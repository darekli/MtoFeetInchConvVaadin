package mf;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Tests_MToF {

    @Test
    public void Test_should_meters_centimeters_be_Foot() {
        //given
        MToF_Service mToF_service = new MToF_Service();
        //when
        int foot = (int) mToF_service.getDimmInFoot(3.0, 93.0);
        int foot2 = (int) mToF_service.getDimmInFoot(3.0, 94.0);
        int foot3 = (int) mToF_service.getDimmInFoot(4.0, 24.0);
        int foot4 = (int) mToF_service.getDimmInFoot(4.0, 25.0);
        //then
        Assert.assertEquals(12, foot);
        Assert.assertEquals(13, foot2);
        Assert.assertEquals(13, foot3);
        Assert.assertEquals(14, foot4);
    }

    @Test
    public void Test_should_be_remainingInches_after_conv_from_meters_centimeters() {
        //given
        MToF_Service mToF_service = new MToF_Service();
        //when
        int inches = (int) mToF_service.getLeftDimmInInch(2.0, 34.0);
        int inches2 = (int) mToF_service.getLeftDimmInInch(3.0, 29.0);
        int inches3 = (int) mToF_service.getLeftDimmInInch(4.0, 0.0);
        int inches4 = (int) mToF_service.getLeftDimmInInch(3.0, 95.0);
        int inches4b = (int) mToF_service.getLeftDimmInInch(3.0, 94.0);
        int inches5 = (int) mToF_service.getLeftDimmInInch(3.0, 93.0);
        int inches6 = (int) mToF_service.getLeftDimmInInch(3.0, 91.0);
        //then
        Assert.assertEquals(9, inches);
        Assert.assertEquals(10, inches2);
        Assert.assertEquals(2, inches3);
        Assert.assertEquals(0, inches4);
        Assert.assertEquals(0, inches4b);
        Assert.assertEquals(11, inches5);
        Assert.assertEquals(10, inches6);
    }

  //  @Test
  //  public void Test_should_foot_and_inch_be_meters() {
        //given
  //      MToF_Service mToF_service = new MToF_Service();
        //when
 //       String meters = mToF_service.getDimInMeters(3.0, 56.0);
//        String meters2 = mToF_service.getDimInMeters(12.0, 11.0);
//        String meters3 = mToF_service.getDimInMeters(13.0, 0.0);
//        String meters4 = mToF_service.getDimInMeters(14.0, 0.0);
//        String meters5 = mToF_service.getDimInMeters(15.0, 1.0);

        //then//todo
    // Assert.assertEquals(new String(String.valueOf(2.34)),new String(meters));
//        Assert.assertEquals(2.94, meters2);
//        Assert.assertEquals(2.96, meters3);
//        Assert.assertEquals(4.27, meters4);
//        Assert.assertEquals(4.60, meters5);

   // }
}
