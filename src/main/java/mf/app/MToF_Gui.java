package mf.app;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.MessageSource;

@Route("mtf")
@StyleSheet("/style.css")
@Configurable

public class MToF_Gui extends VerticalLayout {
    private MessageSource messageSource;

    MToF_Service mToF_service;

    @Autowired
    public MToF_Gui(MToF_Service mToF_service) {//MessageSource messageSource,
        //this.messageSource = messageSource;
        this.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        setAlignItems(Alignment.CENTER);
        H2 header = new H2("Meters to feet\'-inches\" converter\n for drivers\" ");
        Image imageTop = new Image("https://truckeron.eu/files/pics/truckeron/truckerLogoAff_small.svg", "image");
        imageTop.setWidth("10%");
        add(imageTop);  //addButtonBack()

        setAlignItems(Alignment.CENTER);
        Image image = new Image("https://truckeron.eu/files/pics/truckeron/lowBridge4Zero.jpg", "image");
        image.setWidth("60%");

        setAlignItems(Alignment.CENTER);

        add(header);

        NumberField meters = new NumberField("meters:");
        meters.setHasControls(true);
        meters.setMin(0);
        meters.setMax(99);

        NumberField cms = new NumberField("cm's (0-100):");
        cms.setHasControls(true);
        cms.setMin(0);
        cms.setMax(99);

        H2 equalsFoot;
        H2 equalsInch;
        equalsFoot = new H2(" foot' ");
        equalsInch = new H2(" inch\"");


        Details infoAboutFootInch = new Details("Important. Please read. Information about conversion.",

                new Text("YOU ARE USING CONVERTER FOR YOR RISK " + " ROUND UP CONVERSION FOR YOUR SAFETY! " + "Remember, international 1 foot is equivalent to 12 inches.\n" +
                        "1 foot is\t0.3048 metre, and 1 inch is 2.54 centimetres.* \n" +
                        "(* The Units of Measurement Regulations 1995; STATUTORY INSTRUMENTS 1995 No. 1804; WEIGHTS AND MEASURES, UK Acts)"));
        Details infoAboutRoadVehiclesUK = new Details("Please read. Information about current UK limits.", new Text("The current UK limits, set out in full in the Road Vehicles (Construction and Use) Regulations\n" +
                "1986 (SI 1986/1078), as amended, are as follows: • LENGTH • 12 metres for a rigid vehicle\n" +
                "• 16.5 metres for an articulated vehicle if the articulated combination can turn within\n" +
                "a concentric radii of 12.5 metres and 5.3 metres; otherwise 15.5 metres\n" +
                "• 18.75 metres for a road train (a combination of a lorry and a trailer)\n" +
                "width\n" +
                "• WIDTH •2.55 metres excluding driving mirrors\n" +
                "• refrigerated vehicles are permitted to be 2.6 metres wide to allow for the extra\n" +
                "thickness of the insulation. \n" +
                "• HEIGHT • no limit, but wherever possible a maximum of 4.95 metres should be adhered to in\n" +
                "order to make maximum use of the motorway and trunk road network."));


        Button buttonCalculate;
      //  buttonCalculate = new Button(messageSource.getMessage("btn", new Object[]{}, Locale.forLanguageTag("pl")));
        buttonCalculate = new Button("Calculate");
        buttonCalculate.addClickListener((event -> {
         //   equalsFoot.setText(
//                    String.valueOf((int) mToF_service.getDimmInFoot(meters.getValue(), cms.getValue())));
//            equalsInch.setText(String.valueOf(Integer.valueOf((int) mToF_service.getLeftDimmInInch(meters.getValue(), cms.getValue()))));
            equalsFoot.setText(String.valueOf(mToF_service.showDimmInFoot(meters.getValue(), cms.getValue())));
           // equalsInch.setText(String.valueOf(Integer.valueOf((int) mToF_service.getLeftDimmInInch(meters.getValue(), cms.getValue()))));

        }));

        HorizontalLayout metersCmsLayout = new HorizontalLayout(meters, cms);
        add(metersCmsLayout);
        HorizontalLayout equalsFInchLayout = new HorizontalLayout(equalsFoot, equalsInch);
        add(equalsFInchLayout);

        add(infoAboutFootInch, infoAboutRoadVehiclesUK, buttonCalculate);

        H2 header2 = new H2("Feet'-inches\" to meters converter");
        setAlignItems(Alignment.CENTER);

        add(header2);

        NumberField numberFieldFoot = new NumberField("Feet'");
        numberFieldFoot.setHasControls(true);
        numberFieldFoot.setMin(0);
        numberFieldFoot.setMax(99);

        NumberField numberFieldInch = new NumberField("Inches\" (0\"-11\"):");
        numberFieldInch.setHasControls(true);
        numberFieldInch.setMin(0);
        numberFieldInch.setMax(11);

        H2 equalsMeters = new H2("Conversion to meters");

        Button buttonCalculateToMeters = new Button("Conversion");

        buttonCalculateToMeters.addClickListener((event -> {
            equalsMeters.setText(String.valueOf(mToF_service.getDimInMeters(numberFieldFoot.getValue(), numberFieldInch.getValue())));
        }));

        setAlignItems(Alignment.CENTER);

        HorizontalLayout textFInchLayout = new HorizontalLayout(numberFieldFoot, numberFieldInch);

        add(textFInchLayout);

        H2 textMeters = new H2("meters");
        HorizontalLayout textMLayout = new HorizontalLayout(equalsMeters, textMeters);

        add(textMLayout);

        setAlignItems(Alignment.CENTER);

        add(buttonCalculateToMeters, image);
        //add(addButtonBack());


    }


}
