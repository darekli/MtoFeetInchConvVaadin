package feet;

import older.FeetsIntoMettersConverter;
import older.MettersIntoFeetConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetsIntoMettersConverterTest {

    @Test
    void getMyFeet_IsFeetToMetersRatioCorrect() {
        //given
        FeetsIntoMettersConverter feetsIntoMettersConverter = new FeetsIntoMettersConverter(1,0);
        //when
        double feetRatioExp = feetsIntoMettersConverter.getMyFeet();
        //then
        assertEquals(1,feetRatioExp);
    }

    @Test
    void getMyInch_IsInchToMetersRatioCorrect() {
        //given
        FeetsIntoMettersConverter feetsIntoMettersConverter = new FeetsIntoMettersConverter(1,12);
        //when
        double inchRatioExp = feetsIntoMettersConverter.getMyInch();
        //then
        assertEquals(12,inchRatioExp);
    }
//TODO
    @Test
    void getDimmInMeters_InMetersConvertionExpected() {
        //given
        FeetsIntoMettersConverter feetsIntoMettersConverter = new FeetsIntoMettersConverter(9,8);
        //when
        double metersExp = feetsIntoMettersConverter.getDimmInMeters();
        //then
        assertEquals(2.9464058928115184,metersExp,"real my program generate 2.9464058928115184 and expected should be 2.9463999999999997 ");
    }

    static class MainTest {

        @Test
        void TestingCorrectConversionYourMettersToFeetIntOnly() {
            //given
            MettersIntoFeetConverter mettersIntoFeetConverter = new MettersIntoFeetConverter(3.63);
            //when
            int feet = (int) mettersIntoFeetConverter.getDimmInFeet();
            //then
            assertEquals(11, feet, "converter - http://www.csgnetwork.com/csgcvtmeters2ftincalc.html");
        }

        @Test
        void TestingCorrectConversionYourMettersToRestOfInchIntOnly() {
            //given
            MettersIntoFeetConverter mettersIntoFeetConverter = new MettersIntoFeetConverter(7.9);
            //when
            int inch = (int) mettersIntoFeetConverter.getLeftDimmInInch();
            //then
            assertEquals(0, inch, "converter - http://www.csgnetwork.com/csgcvtmeters2ftincalc.html is:11.02362204724409");
        }

        //**********SECOND PART MAIN CLASS TEST****************************
        @Test
        void TestingCorrectConversionYourFeetsToMetersFEETSOnly() {
            //given
            FeetsIntoMettersConverter feetsIntoMettersConverter = new FeetsIntoMettersConverter(12, 2);
            //when
            double metersFromFeet = feetsIntoMettersConverter.getDimmInMeters();
            //then
            assertEquals(3.7084074168145795, metersFromFeet, "converter - http://www.csgnetwork.com/csgcvtmeters2ftincalc.html");
        }

        @Test
        void TestingCorrectConversionYourFeetsToMetersINCHOnly() {
            //given
            FeetsIntoMettersConverter feetsIntoMettersConverter = new FeetsIntoMettersConverter(0, 7);
            //when
            double metersFromFeet = feetsIntoMettersConverter.getDimmInMeters();
            //then
            assertEquals(0.17780035560062887, metersFromFeet, "converter - http://www.csgnetwork.com/csgcvtmeters2ftincalc.html 0.17779999999999999");
        }

        @Test
        void TwoIntINShouldNotBeEqual() {
            //given
            MettersIntoFeetConverter mettersIntoFeetConverter1 = new MettersIntoFeetConverter(5.33);
            MettersIntoFeetConverter mettersIntoFeetConverter2 = new MettersIntoFeetConverter(5.33);
            //when
            assertNotSame(mettersIntoFeetConverter1,mettersIntoFeetConverter2, "Checking if two meters are same");
            //then
        }

    }
}
