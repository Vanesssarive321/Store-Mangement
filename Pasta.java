public class Pasta extends Order {

  /*
  *My instance variable
  */
  private String sauceType; // the type of sauce on the pasta, for example "red sauce", "white sauce"

// My no-argument construter
  /*
  * Sets the wantsPastaDone as true (if true)
  */
public Pasta(double price,boolean hasDrink,int quantity, String newSauceType){
  super(price, hasDrink, quantity);
  sauceType = newSauceType;
}

//My accesor method
/*
*Returns Yes if the program wants their pasta done(true),
*and returns No if they do not(false).
  */
 public String getSauceType() {
    return sauceType;
 }
 public void setSauceType(String newSauceType) {
    sauceType = newSauceType;
 }
  
  /*
  * My toString method
  */
  public String toString() {
    return "~~~Pasta~~~" + "\nSauce: " + sauceType + "\n" + super.toString();
    }

  
}
  
 