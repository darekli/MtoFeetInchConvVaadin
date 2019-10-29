package dareklimtofeet;

import org.springframework.stereotype.Component;

@Component
public class Meters_Feets {

    double meters;
    int feet;
    int inches;
    final double ratioMtoF = 3.2808399;
    final double ratioFItoM = 0.3048006096012;
    final double inchRatio = 0.0833333333333;
    int myFeet;
    int myInch;

    public Meters_Feets() {
    }

    public double getMeters() {
        return meters;
    }

    public void setMeters(double meters) {
        this.meters = meters;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public double getRatioMtoF() {
        return ratioMtoF;
    }

    public double getRatioFItoM() {
        return ratioFItoM;
    }

    public double getInchRatio() {
        return inchRatio;
    }

    public int getMyFeet() {
        return myFeet;
    }

    public void setMyFeet(int myFeet) {
        this.myFeet = myFeet;
    }

    public int getMyInch() {
        return myInch;
    }

    public void setMyInch(int myInch) {
        this.myInch = myInch;
    }

    @Override
    public String toString() {
        return "Meters_Feets{" +
                "meters=" + meters +
                ", feet=" + feet +
                ", inches=" + inches +
                ", ratioMtoF=" + ratioMtoF +
                ", ratioFItoM=" + ratioFItoM +
                ", inchRatio=" + inchRatio +
                ", myFeet=" + myFeet +
                ", myInch=" + myInch +
                '}';
    }
}
