import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("How much do your retros cost?");
    int price = scan.nextInt();
    System.out.println("How much did your airmaxes cost? ");
    int priceTwo = scan.nextInt();
    System.out.println("How much did your air forces cost ");
    int priceThree = scan.nextInt();
  }

  static int shoeComp(int price, int priceTwo, int priceThree)
  {
   int priceComp = price - priceTwo;
  }
}