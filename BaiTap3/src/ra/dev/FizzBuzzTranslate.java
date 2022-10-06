package ra.dev;

import java.util.AbstractList;
import java.util.LinkedList;
import java.util.Arrays;

public class FizzBuzzTranslate {
    public String translate(int number){
        String returnTrans = "";
        while (number != 0) {
            LinkedList<Integer>arrayList= new LinkedList<>();
            int digit;
            digit = number%10;
            int revered = 0;
            revered = revered * 10 + digit;
            number /=10;
            arrayList.addFirst(digit);

            switch (arrayList.getFirst()) {
                case 1:
                    returnTrans += " Một ";
                    break;
                case 2:
                    returnTrans += " Hai ";
                    break;
                case 3:
                    returnTrans += " Fizz ";
                    returnTrans += " Ba ";
                    break;
                case 4:
                    returnTrans += " Bốn ";
                    break;
                case 5:
                    returnTrans += " Buzz ";
                    returnTrans += " Năm ";
                    break;
                case 6:
                    returnTrans += " Sáu ";
                    break;
                case 7:
                    returnTrans += " Bảy ";
                    break;
                case 8:
                    returnTrans += " Tám ";
                    break;
                case 9:
                    returnTrans += " Chín ";
                    break;
            }
            arrayList.removeLast();
        }
        return returnTrans;
    }



//          if(number%3==0){
//        return returnSting = "Fizz";
//    }else if ( number%5==0) {
//        return returnSting = "Buzz";
//    }
//        return returnSting;



//
//    public String translate2(int number) {
//        String returnTrans = "";
////        while (number > 0) {
////            int digit;
////            digit = number /10;
//            switch (number) {
//                case 1:
//                    returnTrans += "Một";
//                case 2:
//                    returnTrans +="Hai";
//                case 3:
//                    returnTrans += "Fizz";
//                    returnTrans += "Ba";
//                case 4:
//                    returnTrans +="Bốn";
//                case 5:
//                    returnTrans += "Buzz";
//                    returnTrans += "Năm";
//                case 6:
//                    returnTrans +="Sáu";
//                case 7:
//                    returnTrans +="Bảy";
//                case 8:
//                    returnTrans +="Tám";
//                case 9:
//                    returnTrans +="Chín";
//                    break;
//            } return returnTrans;
//
//
//    }


}
