package older;

class MetersToFeet {//extends YourDimmensions {

    public static void main(String[] args) {

        double height = 4.06;

        RigidTruck rigid = new RigidTruck("rigid truck", height, 11.8, 2.55);
        String vehicle = rigid.getVehicle();
        double height_ = rigid.getHeight();
        System.out.println("vehile + height"+vehicle+height);
        ReplacementToFeet replacement = new ReplacementToFeet(vehicle, 4.20, 11, 2.55);
        double height1 = replacement.getHeight();
        System.out.println("height1"+height1);
        System.out.println("Your height is: "+height);
    }
}

class ReplacementToFeet extends YourDimmensions{
    public ReplacementToFeet(String vehicle, double height, double width, double length) {
        super(vehicle, height, width, length);
        double mToFeetRatio = 3.2808399;

        double heightInFeet = height * mToFeetRatio;


        double longInFeet = length * mToFeetRatio;
        double wideInFeet = width * mToFeetRatio;
        System.out.println(longInFeet);

    }


    {
        System.out.println("Vehicle " + vehicle + ", height " + height + ", length " + length + ", width " + width);

    }
}

class RigidTruck extends YourDimmensions {
    //private double jghhg; - gdybym chcial cos doodac jakas funkcje

    public RigidTruck(String vehicle, double height, double width, double length) {
        super(vehicle, height, width, length);
        //this.jghhg = jghhg; - - gdybym chcial cos doodac jakas funkcje
    if (length>12) {
        System.out.println(length + " The lenght is over limit 12.00m");
    } else{
        System.out.println("The lenght is: " +length);
    }
    }

}
