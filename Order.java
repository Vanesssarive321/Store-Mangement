public class Order {

   /*...*/
  private double price;
  private boolean hasDrink;
  private int quantity;
  
  // My no argument constructor 
  /*
  * Sets the type of pizza to soft
  */
  public Order() {
    price = 10.00;
    hasDrink = false;
    quantity = 1;
  } 
  // My parameterized constructor
  /*
  * Sets the price to be specified price, service to the specified service,
  *pizzalist to the specifed texture, and texture to the specifed texture
  */
  public Order(double price, boolean hasDrink, int quantity) {
     this.price=price;
       this.hasDrink=hasDrink;
       this.quantity=quantity;
  }

    public Order(double price, boolean hasDrink) {
     this.price=price;
       this.hasDrink=hasDrink;
       this.quantity=1;
  }

  /*
  * gets the type of pizza to soft 
  */
  public boolean getHasDrink() {
    return hasDrink;
    }
  public double getPrice() {
    return price;
    }

    public int getQuantity() {
    return quantity;
    }
  
  /*
  * Sets the type of pizza to soft 
  */
  public void setPrice(double newPrice) {
    price = newPrice;
  }
  public void setHasDrink(boolean newHasDrink) {
    hasDrink = newHasDrink;
  }
    public void setQuantity(int newQuantity) {
    quantity = newQuantity;
  }
  
  /*
  * My toString method
  */
  public String toString() {
    return "Quantity: " + quantity + "\nWith Drink: " + hasDrink + "\nPrice: $" + price + "0";
    }



}


  
