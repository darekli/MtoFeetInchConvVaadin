package mf;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("mtf")
public class MToF_Gui extends Composite<VerticalLayout> implements HasComponents {


    Meters_Feets meters_feets;

    @Autowired
    public MToF_Gui(Meters_Feets meters_feets) {
        this.meters_feets = meters_feets;

        H1 header = new H1("Meters to foot\'-inch\" converter");

        Image image = new Image("https://truckeron.eu/files/pics/truckeron/signsLimit.jpg", "image");
        header.setWidth("100%");
        add(header);

        HorizontalLayout horizontalLayout = new HorizontalLayout();

        NumberField numberFieldMeters = new NumberField("Meters:");
        // numberFieldMeters.setValue(1d);
        numberFieldMeters.setHasControls(true);
        numberFieldMeters.setMin(0);
        numberFieldMeters.setMax(99);

        NumberField numberFieldCms = new NumberField("Centimeters (0-100):");
        numberFieldCms.setHasControls(true);
        numberFieldCms.setMin(0);
        numberFieldCms.setMax(99);
        //  Button buttonValueMCmInput = new Button("Your input value: ");
        TextField textFieldEqualsFeet = new TextField(" foot' ");
        TextField textFieldEqualsInch = new TextField(" inch\" (12 inches ( ins.)\t = \t1 foot)");

        Button buttonCalculate = new Button("Convert to foot' - inch\" for road:");

        buttonCalculate.addClickListener((event -> {
            textFieldEqualsFeet.setValue(String.valueOf(Integer.valueOf((int) meters_feets.getDimmInFeet(numberFieldMeters.getValue(), numberFieldCms.getValue()))));
            //textFieldEqualsFeet.setValue((meters_feets.calculateBmi(numberFieldMeters.getValue(),numberFieldCms.getValue())));
            textFieldEqualsInch.setValue(String.valueOf(Integer.valueOf((int) meters_feets.getLeftDimmInInch(numberFieldMeters.getValue(), numberFieldCms.getValue()))));
        }));

        add(numberFieldMeters, numberFieldCms, textFieldEqualsFeet, textFieldEqualsFeet, textFieldEqualsInch, buttonCalculate);

        TextField textField1To1Convertion = new TextField("Real foot' - inch\" convert" + " The Units of Measurement Regulations 13th July 1995; STATUTORY INSTRUMENTS 1995 No. 1804; WEIGHTS AND MEASURES; UK Acts");
        // Button buttonCalculate1To1 = new Button("\"Convert to feet'-inch\": ");
        buttonCalculate.addClickListener((event -> {
            textField1To1Convertion.setValue(meters_feets.getOneOneConvertionMToF(numberFieldMeters.getValue(), numberFieldCms.getValue()));
        }));
        add(textField1To1Convertion);
        H1 header2 = new H1("Foot\'-inch\" to meters converter");
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
        TextField textFieldEqualsMeters = new TextField("Real convertion to meters ");
        TextField textFieldEqualsCm = new TextField(" centimeters");

        Button buttonCalculateToMeters = new Button("Convert to meters and centimeters");

        buttonCalculateToMeters.addClickListener((event -> {
            textFieldEqualsMeters.setValue(meters_feets.getDimInMeters(numberFieldFoot.getValue(), numberFieldInch.getValue()));
        }));

add(numberFieldFoot,numberFieldInch,textFieldEqualsMeters);
        add(buttonCalculateToMeters,image);


    }
}
