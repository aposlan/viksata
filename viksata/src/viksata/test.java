package viksata;
import java.util.Scanner;
public class test {

	static Scanner s = new Scanner(System.in);
	static User u1 = new User("andreicho", "12345");
	static Admin a1 = new Admin("adrian", "azsumadmin");

	public static void main(String[] args) {
		
		checkPotrebitel();
		
	}
	
	public static void checkPotrebitel() {
		
		System.out.println("Vuvedete potrebitelsko ime : ");
		String username = s.nextLine();
		System.out.println("Vuvedete parola : ");
		String password = s.nextLine();
		
		if(u1.getUsername().equalsIgnoreCase(username) && u1.getPassword().equals(password)) {
			System.out.println("Vlqzohte kato user!");
		} else if(a1.getUsername().equalsIgnoreCase(username) && a1.getPassword().equals(password)) {
			System.out.println("Vlqzohte kato admin!");
		}
		
	}

}
