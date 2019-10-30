package mf;

import org.springframework.stereotype.Component;

@Component
public class Meters_Feets {

//    final double ratioMtoF = 3.2808399;
//    final double ratioFItoM = 0.3048006096012;
    final double inchRatio = 0.0833333333333;
//STATUTORY INSTRUMENTS
//
//1995 No. 1804
//WEIGHTS AND MEASURES
//
//The Units of Measurement Regulations 1995
    final double ratioMtoF = 3.2808399;
    final double ratioFItoM = 0.3048;



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

    public String getOneOneConvertionMToF(Double meters, Double centimeters) {
    double mToFInch = (meters +(centimeters/100)) * ratioMtoF;
       // double roundOff = Math.round(ddd*100)/100D;

      return String.valueOf(mToFInch);
    }

    public String getDimInMeters(Double foot, Double inch) {
      double meters= foot*ratioFItoM + inch * inchRatio;
            return String.valueOf(meters);
        }

    }





