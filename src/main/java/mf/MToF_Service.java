package mf;

import org.springframework.stereotype.Service;

@Service
public class MToF_Service {

    final double ratioMtoF = 3.2808399;
    final double inchRatio = 0.0833333333333;
    final double ratioInchToFoot = 0.0254;
    //STATUTORY INSTRUMENTS
//
//1995 No. 1804
//WEIGHTS AND MEASURES
//
//The Units of Measurement Regulations 1995
    //http://www.csgnetwork.com/csgcvtftin2meterscalc.html
    final double ratioFItoM = 0.3048;


    public double getDimmInFoot(double meters, double centimeters) {
        int foot = (int) Math.ceil((((meters + (centimeters / 100)) * ratioMtoF) % 1) * 12);
        double footFloor = Math.floor((meters + (centimeters / 100)) * ratioMtoF);
        if (foot == 12) {
            return footFloor + 1;
        } else {
            return footFloor;
        }
    }

    public double getLeftDimmInInch(double meters, double centimeters) {
        int inches = (int) Math.ceil((((meters + (centimeters / 100)) * ratioMtoF) % 1) * 12);
        if (inches == 12) {
            return 0;
        } else {
            return inches;
        }
    }

    public String getDimInMeters(double foot, double inch) {
        double meters = foot * ratioFItoM + inch * ratioInchToFoot;
        String StringMeters2f = String.format("%.2f", meters);
        return String.valueOf(StringMeters2f);
        //return meters; //for tests only
    }


}





