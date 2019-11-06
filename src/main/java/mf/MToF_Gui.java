package mf;

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

@Route("mtf")
@StyleSheet("/style.css")
public class MToF_Gui extends VerticalLayout implements QuickReturn {


    MToF_Service meters_feets;

    @Autowired
    public MToF_Gui(MToF_Service meters_feets) {
       // this.meters_feets = meters_feets;
        this.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        setAlignItems(Alignment.CENTER);
        H2 header = new H2("Meters to foot\'-inch\" converter\n for foreign drivers coming to the UK\" " );
        Image imageTop = new Image("https://truckeron.eu/files/pics/truckeron/truckerLogoAff_small.svg", "image");
        imageTop.setWidth("10%");
        add(addButtonBack(),imageTop);

        setAlignItems(Alignment.CENTER);
        Image image = new Image("https://truckeron.eu/files/pics/truckeron/lowBridge4Zero.jpg", "image");
        image.setWidth("80%");

        setAlignItems(Alignment.CENTER);

        add(header);

        NumberField meters;
        NumberField cms;
        meters = new NumberField("meters:");
        meters.setHasControls(true);
        meters.setMin(0);
        meters.setMax(99);

        cms = new NumberField("cm's (0-100):");
        cms.setHasControls(true);
        cms.setMin(0);
        cms.setMax(99);

//TextField equalsFoot;
//TextField equalsInch;
//
//        equalsFoot = new TextField(" foot' ");
//        equalsInch = new TextField(" inch\"");

        H2 equalsFoot;
        H2 equalsInch;
        equalsFoot = new H2(" foot' ");
        equalsInch = new H2(" inch\"");


        Details infoAboutFootInch = new Details("Important. Please read. Information about conversion.",

                new Text("YOU ARE USING CONVERTER FOR YOR RISK "+" ROUND UP CONVERSION FOR YOUR SAFETY! "+"Remember, international 1 foot is equivalent to 12 inches.\n" +
                        "1 foot is\t0.3048 metre, and 1 inch is 2.54 centimetres.* \n" +
                        "(* The Units of Measurement Regulations 1995; STATUTORY INSTRUMENTS 1995 No. 1804; WEIGHTS AND MEASURES, UK Acts)"));
        Details infoAboutRoadVehiclesUK = new Details("Please read. Information about current UK limits.", new Text ("The current UK limits, set out in full in the Road Vehicles (Construction and Use) Regulations\n" +
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

        Button calculate;
        calculate = new Button("Conversion");

     calculate.addClickListener((event -> {
            equalsFoot.setText(String.valueOf((int) meters_feets.getDimmInFeet(meters.getValue(), cms.getValue())));
            equalsInch.setText(String.valueOf(Integer.valueOf((int) meters_feets.getLeftDimmInInch(meters.getValue(), cms.getValue()))));
        }));

HorizontalLayout metersCmsLayout = new HorizontalLayout(meters, cms);
        add(metersCmsLayout);
        HorizontalLayout equalsFInchLayout = new HorizontalLayout(equalsFoot,equalsInch);
        add(equalsFInchLayout);
//add(equalsFoot, equalsFoot);
add(infoAboutFootInch,infoAboutRoadVehiclesUK, calculate);
        //TextField textField1To1Convertion = new TextField("Real foot' - inch\" conversion" + " The Units of Measurement Regulations 13th July 1995; STATUTORY INSTRUMENTS 1995 No. 1804; WEIGHTS AND MEASURES; UK Acts");
        // Button buttonCalculate1To1 = new Button("\"Convert to feet'-inch\": ");
//        buttonCalculate.addClickListener((event -> {
//            textField1To1Convertion.setValue(meters_feets.getOneOneConvertionMToF(numberFieldMeters.getValue(), numberFieldCms.getValue()));
//        }));
//        setAlignItems(Alignment.CENTER);
//
//        add(textField1To1Convertion);
//        setAlignItems(Alignment.CENTER);

        H2 header2 = new H2("Foot'-inch\" to meters converter");
        setAlignItems(Alignment.CENTER);

        add(header2);
        //feet to meters


        NumberField numberFieldFoot = new NumberField("Foot'");
        // numberFieldMeters.setValue(1d);
        numberFieldFoot.setHasControls(true);

        numberFieldFoot.setMin(0);
        numberFieldFoot.setMax(99);

        NumberField numberFieldInch = new NumberField("Inch\" (0\"-11\"):");
        numberFieldInch.setHasControls(true);

        numberFieldInch.setMin(0);
        numberFieldInch.setMax(11);
        //  Button buttonValueMCmInput = new Button("Your input value: ");
        H2 equalsMeters;
        equalsMeters = new H2("Conversion to meters");
        //TextField textFieldEqualsCm = new TextField(" centimeters");

        Button buttonCalculateToMeters = new Button("Conversion");


        buttonCalculateToMeters.addClickListener((event -> {
            equalsMeters.setText(meters_feets.getDimInMeters(numberFieldFoot.getValue(), numberFieldInch.getValue()));
        }));

        setAlignItems(Alignment.CENTER);
HorizontalLayout footInchLayout = new HorizontalLayout(numberFieldFoot,numberFieldInch);
        add(footInchLayout);
add(equalsMeters);

        setAlignItems(Alignment.CENTER);

        add(buttonCalculateToMeters, image);
        add(addButtonBack());
    }
}
