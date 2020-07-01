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


//    public String getDimmInFoot(double meters, double cms) {
//        if (meters == Double.parseDouble(null) || cms == Double.parseDouble(null)) {
//           return showError();
//        } else {
//            return String.valueOf(showDimmInFoot(meters, cms));
//        }
//
//        // return showDimmInFoot(meters,centimeters);
//    }
//
//    private String showError() {
//        Notification notification = Notification.show("Please enter a data");
//        return String.valueOf(notification);
//    }

    double showDimmInFoot(double meters, double cms) {
        int foot = (int) Math.ceil((((meters + (cms / 100)) * ratioMtoF) % 1) * 12);
        double footFloor = Math.floor((meters + (cms / 100)) * ratioMtoF);
        if (foot == 12) {
            return footFloor + 1;
        } else {
            return footFloor;
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





