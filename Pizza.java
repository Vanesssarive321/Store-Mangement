public class Pizza extends Order {

   /*...*/
  private String size; // the size of the pizza, for example "small", "medium", "large"
  

  // My no argument constructor 
  /*
  * Sets the size of pizza to medium
  */
  public Pizza () {
    size = "medium";
  }

  // My parameterized constructor
  /*
  * Sets the price to be specified price, service to the specified service,
  *pizzalist to the specifed texture, and texture to the specifed texture
  */
  public Pizza(double price, boolean hasDrink, int quantity, String size) {
    super(price,hasDrink,quantity);
    this.size = size;
  }

public String getSize() {
    return size;
    }
  
  public void setSize(String newSize) {
    size = newSize;
  }

  
  /*
  * My toString method
  */
  public String toString() {
    return "~~~Pizza~~~" + "\nSize: " + size + "\n" + super.toString();
    }


}

