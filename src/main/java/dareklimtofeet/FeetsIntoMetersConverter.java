package dareklimtofeet;

import mf.Meters_Feets;
import org.springframework.beans.factory.annotation.Autowired;

//@Service
public class FeetsIntoMetersConverter {

    private Meters_Feets meters_feets;
    private int myFeet;
    private int myInch;



    @Autowired
    public FeetsIntoMetersConverter(Meters_Feets meters_feets) {
        this.meters_feets = meters_feets;
    }

    public FeetsIntoMetersConverter(int myFeet, int myInch) {
        this.myFeet = myFeet;
        this.myInch = myInch;
    }

    public double getDimmInMeters() {
        final double ratioFItoM = 0.3048006096012;
        final double inchRatio = 0.0833333333333;
        return (myFeet * ratioFItoM) + ((myInch * inchRatio * ratioFItoM));
    }

}
