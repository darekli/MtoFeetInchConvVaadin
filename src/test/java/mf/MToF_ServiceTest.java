package mf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MToF_ServiceTest {

    @Test
    void getDimmInFoot() {
        //given
        MToF_Service mToF_service = new MToF_Service();
        //when
        double test0a = mToF_service.getDimmInFoot(3, 45);
        double test0b = mToF_service.getDimmInFoot(3, 65);
        double test0c = mToF_service.getDimmInFoot(4, 04);
        double test0d = mToF_service.getDimmInFoot(4, 00);
        double test0e = mToF_service.getDimmInFoot(3, 95);
        double test0f = mToF_service.getDimmInFoot(4, 25);
        double test0g = mToF_service.getDimmInFoot(5, 00);


        //then
        assertEquals(11, test0a);
        assertEquals(12, test0b, "11ft 11.700787404. 12 is becouse for safety reason");
        assertEquals(13, test0c);
        assertEquals(13, test0d);
        assertEquals(13, test0e);
        assertEquals(14, test0f,"13ft 11.322834648, safety reason");
        assertEquals(16, test0g);


    }

    @Test
    void getLeftDimmInInch() {
        //given
        MToF_Service mToF_service = new MToF_Service();
        //when
        double test1a = mToF_service.getLeftDimmInInch(3, 45);
        double test1b = mToF_service.getLeftDimmInInch(3, 65);
        double test1c = mToF_service.getLeftDimmInInch(4, 04);
        double test1d = mToF_service.getLeftDimmInInch(4, 00);
        double test1e = mToF_service.getLeftDimmInInch(3, 95);
        double test1f = mToF_service.getLeftDimmInInch(4, 25);
        double test1g = mToF_service.getLeftDimmInInch(5, 00);
        //then
        assertEquals(4,test1a,"11ft 3.826771656");
        assertEquals(0, test1b,"11ft 11.700787404");
        assertEquals(4, test1c);
        assertEquals(2, test1d);
        assertEquals(0, test1e);
        assertEquals(0, test1f);
        assertEquals(5, test1g);

    }


//    @Test  //test works well.
//    void getDimInMeters() {
//        //given
//        MToF_Service mToF_service = new MToF_Service();
//        //when
//        double test2a = mToF_service.getDimInMeters(3, 11);
//        double test2b = mToF_service.getDimInMeters(3, 3);
//        double test2c = mToF_service.getDimInMeters(4, 4);
//        double test2d = mToF_service.getDimInMeters(4, 0);
//        double test2e = mToF_service.getDimInMeters(3, 12);
//        double test2f = mToF_service.getDimInMeters(4, 7);
//        double test2g = mToF_service.getDimInMeters(5, 8);
//        //then
//        assertEquals(1.1938,test2a);
//        assertEquals(0.9906000000000001,test2b);
//        assertEquals(1.3208,test2c);
//        assertEquals(1.2192,test2d);
//        assertEquals(1.2192,test2e);
//        assertEquals(1.397,test2f);
//        assertEquals(1.7272,test2g);



}
