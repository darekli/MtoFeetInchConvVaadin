package mf;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Route("mtf")
public class MToF_Gui extends VerticalLayout implements QuickReturn {


    Meters_Feets meters_feets;
    @Autowired
    public MToF_Gui(Meters_Feets meters_feets) {
        this.meters_feets = meters_feets;
        addButtonBack();

        setAlignItems(Alignment.CENTER);
        H1 header = new H1("Meters to foot\'-inch\" converter" );
        H1 header1a = new H1("for foreign drivers coming to the UK" );

        setAlignItems(Alignment.CENTER);

        Image image = new Image("https://truckeron.eu/files/pics/truckeron/signsLimit.jpg", "image");
        image.setWidth("100%");


        setAlignItems(Alignment.CENTER);

        add(header, header1a);

        NumberField numberFieldMeters = new NumberField("meters:");
        numberFieldMeters.setHasControls(true);
        numberFieldMeters.setMin(0);
        numberFieldMeters.setMax(99);

        NumberField numberFieldCms = new NumberField("cm's (0-100):");
        numberFieldCms.setHasControls(true);

        numberFieldCms.setMin(0);
        numberFieldCms.setMax(99);
        //  Button buttonValueMCmInput = new Button("Your input value: ");

        TextField textFieldEqualsFeet = new TextField(" foot' ");
        TextField textFieldEqualsInch = new TextField(" inch\"");

        Details infoAboutFootInch = new Details("Please read, information about conversion",
                new Text("Remember, international 1 foot is equivalent to 12 inches.\n" +
                        "1 foot is\t0.3048 metre, and 1 inch is 2.54 centimetres.* \n" +
                        "(* The Units of Measurement Regulations 1995; STATUTORY INSTRUMENTS 1995 No. 1804; WEIGHTS AND MEASURES, UK Acts)"));
        Details infoAboutRoadVehiclesUK = new Details("Please read. Information about current UK limits", new Text ("The current UK limits, set out in full in the Road Vehicles (Construction and Use) Regulations\n" +
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

        Button buttonCalculate = new Button("Conversion to foot' - inch\" for road:");

        buttonCalculate.addClickListener((event -> {
            textFieldEqualsFeet.setValue(String.valueOf(Integer.valueOf((int) meters_feets.getDimmInFeet(numberFieldMeters.getValue(), numberFieldCms.getValue()))));
            //textFieldEqualsFeet.setValue((meters_feets.calculateBmi(numberFieldMeters.getValue(),numberFieldCms.getValue())));
            textFieldEqualsInch.setValue(String.valueOf(Integer.valueOf((int) meters_feets.getLeftDimmInInch(numberFieldMeters.getValue(), numberFieldCms.getValue()))));
        }));
        setAlignItems(Alignment.CENTER);

        add(numberFieldMeters, numberFieldCms, textFieldEqualsFeet, textFieldEqualsFeet, textFieldEqualsInch,infoAboutFootInch,infoAboutRoadVehiclesUK, buttonCalculate);

        //TextField textField1To1Convertion = new TextField("Real foot' - inch\" conversion" + " The Units of Measurement Regulations 13th July 1995; STATUTORY INSTRUMENTS 1995 No. 1804; WEIGHTS AND MEASURES; UK Acts");
        // Button buttonCalculate1To1 = new Button("\"Convert to feet'-inch\": ");
//        buttonCalculate.addClickListener((event -> {
//            textField1To1Convertion.setValue(meters_feets.getOneOneConvertionMToF(numberFieldMeters.getValue(), numberFieldCms.getValue()));
//        }));
//        setAlignItems(Alignment.CENTER);
//
//        add(textField1To1Convertion);
//        setAlignItems(Alignment.CENTER);

        H1 header2 = new H1("Foot\'-inch\" to meters converter");
        setAlignItems(Alignment.CENTER);

        add(header2);
        //feet to meters


        NumberField numberFieldFoot = new NumberField("Foots:");
        // numberFieldMeters.setValue(1d);
        numberFieldFoot.setHasControls(true);

        numberFieldFoot.setMin(0);
        numberFieldFoot.setMax(99);

        NumberField numberFieldInch = new NumberField("Inches (0-11):");
        numberFieldInch.setHasControls(true);

        numberFieldInch.setMin(0);
        numberFieldInch.setMax(11);
        //  Button buttonValueMCmInput = new Button("Your input value: ");
        TextField textFieldEqualsMeters = new TextField("Real conversion to meters ");
        //TextField textFieldEqualsCm = new TextField(" centimeters");

        Button buttonCalculateToMeters = new Button("Convert to meters and centimeters");


        buttonCalculateToMeters.addClickListener((event -> {
            textFieldEqualsMeters.setValue(meters_feets.getDimInMeters(numberFieldFoot.getValue(), numberFieldInch.getValue()));
        }));
        setAlignItems(Alignment.CENTER);

        add(numberFieldFoot, numberFieldInch, textFieldEqualsMeters);

        setAlignItems(Alignment.CENTER);

        add(buttonCalculateToMeters, image);


//        bd = new BigDecimal(1/currency.getValue()).setScale(2, RoundingMode.HALF_UP);
////        currencyToGuessValue = bd.doubleValue();//todo sprawdz to big decymal


    }
}
