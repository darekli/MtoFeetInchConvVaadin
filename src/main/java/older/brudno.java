package older;

import java.text.DecimalFormat;

public class brudno {
    public static void main(String[] args) {

        double aaa = (13 * (12 / 39.37)) + ((4 / 12) * (12 / 39.37));
        double bbb = 5 *0.08333333333 * 0.3048006096012;

        int a = 2;
        int b = 3;
        double ss = (13*0.3048006096012)+(4 *0.08333333333*0.3048006096012);
        final double ratioMtoF = 3.2808399;

        //double mToFInch = (Double.parseDouble(String.valueOf(4 +((13/100) * ratioMtoF))));
        double ddd = 4.23333;
        double ddd1 = (ddd+0.00f);
        double roundOff = Math.round(ddd*100)/100D;
        double meters =4;
        double centimeters = 33.33535;
        //double mToFdInch = Math.round((meters +(centimeters/100) * ratioMtoF)/100D);

        double mToFdInch = centimeters/100;
//return
        double qqq= Math.round(mToFdInch);
        double mToFInch = (meters +centimeters/100)/1D;



        System.out.println(ss);
        System.out.println(bbb);

        System.out.println(ddd);
        System.out.println(ddd1);
        System.out.println(roundOff);
        System.out.println(mToFdInch+"ljkl");
        System.out.println(qqq);
        System.out.println(mToFInch);

    }

}
//0.0833
