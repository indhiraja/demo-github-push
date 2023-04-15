package first;
import java.util.Scanner;
public class student { 
	
	public static void main(String[] args) {
	String name;
	String emailid;
	int password;
	Scanner student=new Scanner(System.in);
	System.out.println("enter a name");
	name=student.nextLine();
	System.out.println("your name"+name);
	System.out.println("emailid");
	emailid=student.nextLine();
	System.out.println("you emailid"+emailid);
	System.out.println("password");
	password=student.nextInt();
	System.out.println("pasword"+password);
	}

}
