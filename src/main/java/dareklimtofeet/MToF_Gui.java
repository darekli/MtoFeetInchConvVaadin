package dareklimtofeet;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("mtf")
public class MToF_Gui extends Composite<VerticalLayout> implements HasComponents {

MtFController mtFController;

@Autowired
        public MToF_Gui(MtFController mtFController) {
    this.mtFController = mtFController;


    VerticalLayout verticalLayout = new VerticalLayout();
    H1 header = new H1("Meters to feet\"-inch\' converter");
    verticalLayout.setHorizontalComponentAlignment(FlexComponent.Alignment.STRETCH, header);

    Image image = new Image("https://truckeron.eu/files/pics/truckeron/signsLimit.jpg", "image");
    header.setWidth("100%");
    add(header, image);

    }
   // private void


}




//    private MettersIntoFeetConverter mettersIntoFeetConverter;
//
//
//    MToF_Service mToF_service;
//
//    @Autowired
//    public MToF_Gui(MToF_Service mToF_service) {
//        this.mToF_service = mToF_service;
//
//        FeetsIntoMetersConverter feetsIntoMetersConverter;
//        MettersIntoFeetConverter mettersIntoFeetConverter;
//    }
//    @Autowired
//    public  MToF_Gui(MettersIntoFeetConverter mettersIntoFeetConverter){
//        this.mettersIntoFeetConverter = mettersIntoFeetConverter;
//

//
//        HorizontalLayout inputBar = new HorizontalLayout();
//
//        NumberField numberFieldMeters = new NumberField ("Wpisz METRY");
//        numberFieldMeters.setHasControls(true);
//        numberFieldMeters.setMin(1);
//        NumberField numberFieldCm = new NumberField ("Wpisz CENTYMETRY");
//        numberFieldCm.setHasControls(true);
//        numberFieldCm.setMin(1);
//        Button buttonAdd = new Button("Zatwierdź");
//
//
//        Dialog dialogMToF = new Dialog();
//        dialogMToF.setWidth("400px");
//        dialogMToF.setHeight("250px");
//
//
//
//
//        add(numberFieldMeters, numberFieldCm,buttonAdd,dialogMToF);

