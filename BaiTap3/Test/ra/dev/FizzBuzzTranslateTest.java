package ra.dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    @Test
        void translate (){
        int number = 42;

        String expected = "Fizz";
        FizzBuzzTranslate TL = new FizzBuzzTranslate();
        String KQ = TL.translate(number);

        assertEquals(expected,KQ);
    }

//    @Test
//    void translate2 (){
//        int number = 6;
//
//        String expected = "Sáu";
//
//        FizzBuzzTranslate Tl = new FizzBuzzTranslate();
//        String KL2 = Tl.translate2(number);
//
//        assertEquals(expected,KL2);
//    }

}