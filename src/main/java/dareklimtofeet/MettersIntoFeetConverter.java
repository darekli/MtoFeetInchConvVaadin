package dareklimtofeet;

import org.springframework.stereotype.Service;

@Service
public class MettersIntoFeetConverter {

    double meters;
    final double ratioMtoF = 3.2808399;

//    public MettersIntoFeetConverter(double meters) {
//        this.meters = meters;
//    }

    public double getMeters() {
        return meters;
    }

    public double getDimmInFeet() {
        int inches = (int) Math.ceil(((meters * ratioMtoF) % 1) * 12);
        if (inches == 12) {
            return (Math.floor(meters * ratioMtoF) + 1);
        } else {
            return (Math.floor(meters * ratioMtoF));
        }
    }

    public int getLeftDimmInInch() {
        int inches = (int) Math.ceil(((meters * ratioMtoF) % 1) * 12);
        if (inches==12) {
            return 0;
        }else {
            return inches;
        }
    }
}
//0.3048
//Math.ceil
//1 yard = 3600/3937 meter or 1 yard = 0.914 401 8288 meter
//this relation is equivalent to:
//
//1 foot = 12/39.37 meter or 1 foot = 0.304 800 609 6012 meter
//	5.75 feet	1.75 m
//5 feet 10 inches	5.83 feet	1.78 m
//5 feet 11 inches	5.92 feet	1.8 m
//6 feet 0 inches	6 feet	1.83 m
//6 feet 1 inches	6.08 feet	1.85 m
//6 feet 2 inches	6.17 feet	1.88 m

//7 m	22.966 ft	22 ft, 11.59 in	275.59 in
//3 m	9.843 ft	9 ft, 10.11 in	118.11 in
//4 m	13.123 ft	13 ft, 1.48 in	157.48 in
//5 m	16.404 ft	16 ft, 4.85 in	196.85 in
