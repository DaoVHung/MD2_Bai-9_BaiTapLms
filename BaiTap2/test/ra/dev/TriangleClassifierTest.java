package ra.dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void criangleTest1(){
        int a = 3;
        int b = 4;
        int c = 5;

        String expected = "Tam Giác Vuông";

        TriangleClassifier TC = new TriangleClassifier();
        String strActual = TC.getTriangle(a,b,c);

        assertEquals(expected,strActual);
    }

}
