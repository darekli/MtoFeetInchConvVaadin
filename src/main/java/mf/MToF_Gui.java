package mf;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
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

        H1 header = new H1("Meters to feet\'-inch\" converter");

        // Image image = new Image("https://truckeron.eu/files/pics/truckeron/signsLimit.jpg", "image");
        header.setWidth("100%");
        add(header);

        HorizontalLayout horizontalLayout = new HorizontalLayout();

        NumberField numberFieldMeters = new NumberField("Meters:");
       // numberFieldMeters.setValue(1d);
        numberFieldMeters.setHasControls(true);
        numberFieldMeters.setMin(1);
        numberFieldMeters.setMax(99);

        NumberField numberFieldCms = new NumberField("Centimeters:");
        numberFieldCms.setHasControls(true);
        numberFieldCms.setMin(1);
        numberFieldCms.setMax(99);
        //  Button buttonValueMCmInput = new Button("Your input value: ");
        TextField textFieldEqualsFeet = new TextField(" feet'-inch\": ");
        TextField textFieldEqualsInch = new TextField(" feet'-inch\": ");

        Button buttonCalculate = new Button("\"Convert to feet'-inch\\\": \"");

        buttonCalculate.addClickListener((event -> {
           textFieldEqualsFeet.setValue(String.valueOf(meters_feets.getDimmInFeet(numberFieldMeters.getValue(), numberFieldCms.getValue())));
          //textFieldEqualsFeet.setValue((meters_feets.calculateBmi(numberFieldMeters.getValue(),numberFieldCms.getValue())));
       textFieldEqualsInch.setValue(String.valueOf(meters_feets.getLeftDimmInInch(numberFieldMeters.getValue(),numberFieldCms.getValue())));
        }));

           add(numberFieldMeters, numberFieldCms, textFieldEqualsFeet, textFieldEqualsFeet,buttonCalculate);
    }
}













       // Button wynik = new Button("Convert to feet'-inch\": ");
        //equals = new TextField("Wynik");
//        Label labelMCm = new Label();
//        Label labelWynik = new Label();

//        buttonValueMCmInput.addClickListener(ClickEvent -> {
//            labelMCm.setText(" " + " Your input value: " + numberFieldMeters.getValue() + " m " + numberFieldCms.getValue() + " numberField");
//        });//todo dzialaoo
//        wynik.addClickListener(ClickEvent -> {
//            labelMCm.setText("53563564356 " + "  "+meters_feets.ratioMtoF+"'-"+meters_feets.inches+"\"");
//        });
//
//        wynik.addClickListener(ClickEvent -> {
//labelWynik.setText("Feet inch "+ (numberFieldMeters.getValue()*100+numberFieldCms.getValue())* mToFUtil.getDimmInFeet());
        //    labelWynik.setText("Feet inch "+ mToFUtil.getDimmInFeet(numberFieldMeters.getValue(),numberFieldCms.getValue()));

//        double sumInMetters = (((numberFieldMeters.getValue()*100)+(numberFieldCms.getValue()))/100);
////        double bbb = mToFUtil.getDimmInFeet();
//          labelWynik.setText("Wynik: "+sumInMetters+ "bbb "+bbb);//todo dzialaolo
           // labelWynik.setText("Wynikkhkjhkjhkljlk: "+mToFUtil.getDimmInFeet());//todo dzialaolo
//        });
//
//
//        add(numberFieldMeters, (Component) numberFieldCms, buttonValueMCmInput, wynik, labelMCm,labelWynik);
//        //add(image);
//
//    }
//    }
