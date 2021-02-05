import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // These are the sentences asking the question for the user.
    System.out.println(
        "Hello welcome to Alex's shoe store,a lot fo people have been shopping here so we only have a option of 3 types of shoes. The first option is 1) White air force Ones = $90, 2) black air force ones = $90, 3) golden air max 2's = $120. Which ones would you like? respond with price of shoes");
    int shoe = scan.nextInt();
    System.out.println("How much money do you have? ");
    double money = scan.nextDouble();

    System.out.println("Your change is " +affordable(shoe, money));
    System.out.println("Thank you for shopping at Alex's shoe store make sure to come back again!");
    System.out.println("Did you have a good experience shopping at alex's shoe store?");
    
    System.out.println("Would you like any add ons to your shoes such as colored shoe laces, colored off white ziptie or a off white tag.");
    boolean addOns = scan.nextBoolean();
    double laces = .50;
    double ziptie = 1.50;
    double tag = 5.00; 
    
    
    System.out.println("The total you have to pay is  " + addOnsOption(laces, ziptie, tag, addOns));

    System.out.println("Thank you for your opnion, please let us know if we can improve anything on www.ALEX'Shoestore.com! ");
  }

  static double affordable(int shoe, double money) {
    if (money > shoe) {

      System.out.println("Cool, you have enough money! ");
      return money - shoe;
    } else {
      System.out.println("Sorry, maybe next time");
      return money;
    }
  }

    static double addOnsOption(double laces, double ziptie, double tag, boolean addOns){
      if (addOns){
        System.out.println("Cool, you want some attachments!");
        return laces + ziptie + tag;
      } else {
        System.out.println("Oh its cool if you don't want it. ");
      return 0;
      }


    }


  
}