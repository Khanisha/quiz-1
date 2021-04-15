package quiz1;

public class main {

	public static void main(String[] args) {
		book a = new book();
		a.setAuthor();
		a.setType();
		a.setPrice();
		
		System.out.println("Enter Author and type you chose :");
		
		
		
		System.out.println("Author : " + a.getAuthor());
		System.out.println("Type : " + a.getType());
		System.out.println("Price : " + a.getPrice());
	}

}
