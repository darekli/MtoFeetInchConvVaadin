package older;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class YourDimmensions {
    //1 - rigid, 2 - truck and trailer, 3 - road train
    public String vehicle = "rigid truck";
    public double height = 4.04;
    public double length = 17.6;
    public double width = 2.55;
//    if (
//            height > 4.0) {
//             System.out.println("Overheight!");
//    MetersToFeet dimmensionLimiter = new MetersToFeet();
//        dimmensionLimiter.validateH(double height);

    //System.out.println(hightInFeet + " " + "Feets");

    public YourDimmensions(String vehicle, double height, double length, double width) {
        this.vehicle = vehicle;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public String getVehicle() {
        return this.vehicle;
    }

    public double getHeight() {
        return this.height;
    }
    public double getLength() {
        return this.length;
    }
    public double getWidth() {
        return this.width;
    }
}








//class Replacement extends YourDimmensions{
//
//    double mToFeetRatio = 3.2808399;
//
//    double heightInFeet = height * mToFeetRatio;
//
//
//    double longInFeet = length * mToFeetRatio;
//    double wideInFeet = width * mToFeetRatio;
//
//
//}
//
//
//
//class DimmensionLimiter extends YourDimmensions
////to compare your unit  with under low regulations
//{
//    //public void dimmensionsHeight(double height){  //
//    //public void dimmensionsHeightLengthWidth(height, length, width);
//
////    if (height>4.0){
////    System.out.println("Overheight!");
////}else {
////    System.out.println("Correct height");
////}
//
//    double highInMetersMAX = 0;
//    double longInMetersMAX = 0;
//    double wideInMetersMAX = 0;
//
//    //public void
//
//}
//class RigidTruck  //1
//{
//    double lengthRgdTmMax = 12.00;
//    double widthRgdTmMax = 2.55;
//    double heightRgdTmMax = 4.95;
//}
//class TruckAndTrailer //2
//{
//    double lengthTTmMax = 16.50;
//    double widthTTmMax = 2.55;
//    double heightTTmMax = 4.95;
//}
//class RoadTrain  //3
//{
////Road train - a rigid vehicle at the front, which pulls a trailer behind it
//    double lengthRoadTmMax = 18.75;
//    double widthRoadTmMax = 2.55;
//    double heightRoadTmMax = 4.95;
//}
//
//class MetersToFeet extends YourDimmensions {
//    public static void main(String[] args) {
//        Replacement mToF = new Replacement();
//        double highF = mToF.heightInFeet;
//        double longF = mToF.longInFeet;
//        double wideF = mToF.wideInFeet;;
////        String str = String.format("%1.2f",highF);
////        highF =Double.valueOf(str);
////this.height =height;
//
////*********************SPRAWDZIC POTEM
////        MetersToFeet dimmensionLimiter = new MetersToFeet();
////        public void validateH(double height){
////            //dimmensionLimiter.validateH(height);
////            dimmensionLimiter.height(highF);
////
////            if (height > 4.0) {
////                System.out.println("Overheight!");
////            } else {
////                System.out.println("Correct height");
////            }
////
////        }
//        //*****************************
//
//            highF = highF*100;
//        highF = Math.round(highF);
//        highF = highF/100;
//
//        longF = longF*100;
//        longF = Math.round(longF);
//        longF = longF/100;
//
//        wideF = wideF*100;
//        wideF = Math.round(wideF);
//        wideF = wideF/100;
//
//        System.out.println("Your unit is high (in Feet): "+ highF);
//        System.out.println("Your unit is long (in Feet): "+ longF);
//        System.out.println("Your unit is wide (in Feet): "+ wideF);
//
//    }
//
//}
//}

//ArrayList


//****PONIZEJ DZIALA TYLKO W KODILLI
//class MetersToFeet {
//
//        double hight = 4.04;
//        double long_ = 17.6;
//        double width = 2.55;
//        double mToFeetRatio = 3.2808399;
//        double hightInFeet = hight * mToFeetRatio;
//        //System.out.println(hightInFeet + " " + "Feets");
//
//    }
//
//class App {
//    public static void main(String[] args) {
//        MetersToFeet mToF = new MetersToFeet();
//        double result = mToF.hightInFeet;
//        System.out.println(result);
//    }
//}
//******POWYZEJ DZIALA TYLKKO W KODILLI


//class MetersToFeet extends YourDimensions{

//Scanner f = new Scanner(System.in);

//    double m_to_feet = 4.15;
//    double m_f = 3.2808399;
//    double feet_to_m = f.nextDouble();
//double m_to_feet = ((feet_to_m / 0.3048));

//    public double mToF(double m_to_feet, double m_f) {
//        return m_to_feet * m_f;




//class Application extends MetersToFeet{


//System.out.println(hightInFeet);
//metersToFeet - tworzenie obiektu
//            MetersToFeet metersToFeet = new MetersToFeet();
//            double result = metersToFeet.mToF(4, 1);
//            System.out.println(result);



//}DZIALA TYLKO W KODILLI<<<<<<<<<<


//import java.util.Scanner;
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
//class MetersToFeet {
//    public static void main(String[] args) {
//        Scanner f = new Scanner(System.in);
//        //f= new f;
//        //double inputValue= f;
//        double m_to_feet = f;
//        double ratioMtoF = 3.2808399; //constance
//        double converse = m_to_feet * ratioMtoF;
//        System.out.println("Feets: " + converse);
//    }
//}
//class FeetstoMeters{

//    public MetersToFeet(double m_to_feet, double ratioMtoF) {
//        //konstruktory
//        this.m_to_feet = m_to_feet;
//        this.ratioMtoF = ratioMtoF;
//
//        System.out.println(m_to_feet+" - your hight value");
//    }
//
//    //public MetersToFeet() {
//
//    //}
//
//    public double getM_to_feet(){
//        return this.m_to_feet;
//    }
//    private double getRatioMtoF(){
//        return this.ratioMtoF;
//
//    }
//double feet_to_m = f.nextDouble();
//double m_to_feet = ((feet_to_m / 0.3048));

//
//    public double mToF(double m_to_feet, double ratioMtoF) {
//        return m_to_feet * ratioMtoF;
//        //System.out.println(m_to_feet + " " + "Feets");
//    }
//}

//class Application{
//


//metersToFeet - tworzenie obiektu
//        MetersToFeet metersToFeet = new MetersToFeet();
//        double result = metersToFeet.mToF(2,13);
//        System.out.println(result);
//MetersToFeet new1 = new MetersToFeet(11,11);








//
//        System.out.println("Enter The Feets:"+"for exp."+"13,3"+"(colon (,) - not dot (.))");
//        Scanner m = new Scanner(System.in);
//
//        double meters = m.nextDouble(); //meters from input
//        double feet = ((meters / 3.2808399) * 100.0) / 100.0;
//        System.out.println(feet +" "+"Meters");
//
//
//        System.out.println("Enter the HIGH in Meters (ex.: 4,05)");
//    }

























//import java.util.Scanner;
//
//class MetersToFeet{
//
//    public static void main(String[] args) {
//        Scanner f = new Scanner(System.in);
//
//        double feet_to_m = f.nextDouble();
//        double m_to_feet = ((feet_to_m / 0.3048));
//        {
//
//
//            System.out.println(m_to_feet + " " + "Feets");
//
//        }
//    }
//
//        class FeetToMeters {
//
//
//
//
//        System.out.println("Enter The Feets:"+"for exp."+"13,3"+"(colon (,) - not dot (.))");
//            Scanner m = new Scanner(System.in);
//
//            double meters = m.nextDouble(); //meters from input
//            double feet = ((meters / 3.2808399) * 100.0) / 100.0;
//        System.out.println(feet +" "+"Meters");
//
//
//        System.out.println("Enter the HIGH in Meters (ex.: 4,05)");
//        }
//    }
//}
