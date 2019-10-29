package older;

public class Main {
    public static void main(String[] args) {

         //double meters =4.13;
        //MettersIntoFeetConverter mettersIntoFeetConverter = new MettersIntoFeetConverter(meters);
        MettersIntoFeetConverter mettersIntoFeetConverter = new MettersIntoFeetConverter(4);
        double dimmension = mettersIntoFeetConverter.getMeters();

        int feet = (int) mettersIntoFeetConverter.getDimmInFeet();
       int inch = mettersIntoFeetConverter.getLeftDimmInInch();
        System.out.println(dimmension+" metry");
        System.out.println(feet+"\"");
        System.out.println(inch+"\'");
        //System.out.println("Twoja wysokość " + meters+ "m równa się " + feet + "\"" + inch + "\'");
        System.out.println("Twoj podany wymiar: " + dimmension+ "m równy jest: " + feet + "\"" + inch + "\'");
        System.out.println("**************************");
//*************
        int myFeet = 13;
        int myInch = 2;

        FeetsIntoMettersConverter feetsIntoMettersConverter = new FeetsIntoMettersConverter(myFeet, myInch);
        int dimmFeet = feetsIntoMettersConverter.getMyFeet();
        int dimmInch = feetsIntoMettersConverter.getMyInch();
        double metersFromFeet = feetsIntoMettersConverter.getDimmInMeters();
        String feetInchToCm2f = String.format("%.2f", metersFromFeet);
        System.out.println(myFeet+"\""+myInch+"\'");
        System.out.println("To jest dokładnie: "+feetInchToCm2f+"m");


    }
}
