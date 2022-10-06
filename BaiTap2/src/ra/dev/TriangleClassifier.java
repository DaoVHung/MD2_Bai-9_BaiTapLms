package ra.dev;

public class TriangleClassifier {
  public String getTriangle(int a, int b, int c) {
    String returnString = "";
    if (a + b > c && b + c > a && a + c > b) {
      if ((a * a == (b * b + c * c)) || (b * b == (a * a + c * c)) || (c * c == (a * a + b * b))) {
        System.out.println("Đó là tam giác vuông");
        return returnString = "Tam Giác Vuông";
      } else if (a == b && b == c) {
        System.out.println("Đó là hình tam giác đều");
        return returnString = "Tam Giác Đều";

      } else if (a == b || b == c) {
        System.out.println("Đó là tam giác cân");
        return returnString = "Tam Giác Cân";
      }
      System.out.println("Tam Giác Thường");
     return returnString = "Tam Giác Thường";
    }
    return returnString;
  }
}


//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("Nhập vào cạnh a :");
//    int a = Integer.parseInt(sc.nextLine());
//
//    System.out.println("Nhập vào cạnh b :");
//    int b = Integer.parseInt(sc.nextLine());
//
//    System.out.println("Nhập vào cạnh c :");
//
//    int c = Integer.parseInt(sc.nextLine());