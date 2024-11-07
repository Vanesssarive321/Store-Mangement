import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

  Order italianstore = new Order (8.00, true, 4);

System.out.println(italianstore);

    Pizza pizza = new Pizza(8.00, true, 4, "large");

System.out.println(pizza);

        Pasta pasta = new Pasta(10.00, false, 2, "red sauce");

System.out.println(pasta);
    
/*
System.out.println("Price and Service: " + italianstore.toString());
   
System.out.println("What is My Price and Service");
     
double userPrice = input.nextDouble();
input.nextLine();
String userService = input.nextLine();

italianstore.setPrice(userPrice);
italianstore.setService(userService);
   
System.out.println("My Price and Service: " + userPrice + " and " + userService); 
System.out.println("\n");

pizzalist pizza = new pizzalist (149.99,"Cheese","Peperoni");
    System.out.println("Price, Service, and Type:  " + pizza.toString());
    System.out.println("What Is My Price, Service, and Drinks?");

      userPrice = input.nextDouble();
      input.nextLine();
      userService = input.nextLine();
      input.nextLine();

      pizza.setPrice(userPrice);
      pizza.setService(userService);

    System.out.println("My Price, Service, and Drinks: " + userPrice +", "+ userService);
    System.out.println("\n");

Pasta pasta = new pasta(179.99,"Spaghetti","Iinguine",true);
     System.out.println("Price, Service, and Drinks and If you Want Your Pasta Done: " + pasta.toString());
     System.out.println("What Is My Price, Service, Drinks, and Do I Want My Pasta Done? ");

     userPrice = input.nextDouble();
     input.nextLine();
     userService = input.nextLine();
     input.nextLine();
     userDrink = input.nextLine();
     input.nextLine();

    pasta.setPrice(userPrice);
    pasta.setService(userService);
    pasta.setDrinks(userDrinks);

  System.out.println("My Price, Service, and Drinks, and Do I want My Drinks");

    userPrice = input.nextDouble();
    input.nextLine();
    userService = input.nextline();
    input.nextline();
    userDinks = input.nextline();
    input.nextLine();
System.out.println("My Price, Service, pizza, and Drink, and Do I Want My Drink Done: " + userPrice +", " + userService + ", " + userDrink);
 */
    
  
   
  // Closes the Scanner object
    input.close();
   
  }
}