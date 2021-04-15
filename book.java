package quiz1;
import java.util.*;

public class book {
	Scanner s = new Scanner(System.in);
	
	String author, type;
	int price;
	
	
	  
		 // Create Setter Method
		  public void setAuthor(String author) {
			  System.out.println("Enter Author you chose :");
		    this.author = s.nextLine();
		  }
		  
		  public void setType(String type) {
			  System.out.println("Enter type you chose :");
			    this.type = s.nextLine();
		  }
		  
		  public void setPrice(int price) {
			  System.out.println("Enter price of the book :");
		    this.price = s.nextInt();
		  }
		  
		  // Create Getter Method
		  public String getAuthor() {
			  return this.author;
		  }
		  
		  public String getType() {
			  return this.type;
		  }
		  
		  public int getPrice() {
		 	  return this.price;
	 	  }
}
