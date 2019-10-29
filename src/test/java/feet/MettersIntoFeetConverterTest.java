package feet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MettersIntoFeetConverterTest {

    @Test
    void getMeters() {
    }

    @Test
    void getDimmInFeet_Converting_() {
        double meters =1.83;
        final double ratioMtoF = 3.2808399;
        int in = (int) Math.ceil(((meters * ratioMtoF) % 1) * 12);
        assertEquals(1,in);
    }



}