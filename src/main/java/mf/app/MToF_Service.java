package mf.app;

import com.vaadin.flow.component.notification.Notification;
import org.springframework.stereotype.Service;

@Service
public class MToF_Service {

    final double ratioMtoF = 3.2808399;
    //final double inchRatio = 0.0833333333333;
    final double ratioInchToFoot = 0.0254;
    final double ratioFItoM = 0.3048;
    //STATUTORY INSTRUMENTS
//
//1995 No. 1804
//WEIGHTS AND MEASURES
//
//The Units of Measurement Regulations 1995
    //http://www.csgnetwork.com/csgcvtftin2meterscalc.html


    public int getDimmInFoot(double meters, double cms) {
        int foot = (int) Math.ceil((((meters + (cms / 100)) * ratioMtoF) % 1) * 12);
        double footFloor = Math.floor((meters + (cms / 100)) * ratioMtoF);
        if (foot == 12) {
            return (int) (footFloor + 1);
        } else {
            return (int) footFloor;
        }
    }




    public double getLeftDimmInInch(double meters, double cms) {
        int inches = (int) Math.ceil((((meters + (cms / 100)) * ratioMtoF) % 1) * 12);
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





