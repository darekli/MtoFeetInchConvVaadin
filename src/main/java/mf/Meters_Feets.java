package mf;

import org.springframework.stereotype.Component;

@Component
public class Meters_Feets {


    int meters;
    int centimeters;

    int feet;
    int inches;
    final double ratioMtoF = 3.2808399;
    final double ratioFItoM = 0.3048006096012;
    final double inchRatio = 0.0833333333333;
    int myFeet;
    int myInch;

    public Meters_Feets() {
    }

    public Meters_Feets(double meters, double centimeters) {
    }

    @Override
    public String toString() {
        return "Meters_Feets{" +
                "meters=" + meters +
                ", centimeters=" + centimeters +
                ", feet=" + feet +
                ", inches=" + inches +
                ", ratioMtoF=" + ratioMtoF +
                ", ratioFItoM=" + ratioFItoM +
                ", inchRatio=" + inchRatio +
                ", myFeet=" + myFeet +
                ", myInch=" + myInch +
                '}';
    }
    //METERS INTO FEET CONVERTER



//    public double getMeters() {
//        return meters;
//    }
//    public int getMetersSum(int meters, int centimeters) {
//        int metersSum = meters+(centimeters/100);
//        return metersSum;
//    }

//int metersSum = (meters +(centimeters/100));
    public double getDimmInFeet(Double meters, Double centimeters) {
        int inches = (int) Math.ceil((((meters +(centimeters/100)) * ratioMtoF) % 1) * 12);
        double feetFloor = Math.floor((meters + (centimeters / 100)) * ratioMtoF);
        if (inches == 12) {
            return feetFloor + 1;
        } else {
            return feetFloor;
        }
    }

    public double getLeftDimmInInch(Double meters, Double centimeters) {
        int inches = (int) Math.ceil((((meters +(centimeters/100)) * ratioMtoF) % 1) * 12);
        if (inches == 12) {
            return 0;
        } else {
            return inches;
        }
    }
    double bmi;
    public String calculateBmi(Double height2, Double weigth2){
            bmi = (Double.parseDouble(String.valueOf(weigth2)) / Math.pow(Double.parseDouble(String.valueOf(height2)) / 100.00, 2));
        return String.valueOf(bmi);
        }


//    public double getDimmInFeet() {
//        int inches = (int) Math.ceil(((meters * ratioMtoF) % 1) * 12);
//        if (inches == 12) {
//            return (Math.floor(meters * ratioMtoF) + 1);
//        } else {
//            return (Math.floor(meters * ratioMtoF));
//        }
    }





