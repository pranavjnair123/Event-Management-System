
import java.util.Scanner;

public class check {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter choice");
		System.out.println("1.add data");
		System.out.println("2.login");
		System.out.println("3.view all");
		int n=in.nextInt();
		if(n==1)
		{
			System.out.println("Enter username");
			String username=in.next();
			System.out.println("Enter pswd");
			int pswd=in.nextInt();
			
			user u=new user(username, pswd, "Admin");
			user.adduser(u);
			user.storeuser();
			
			
		}
		if(n==2)
		{
			System.out.println("Enter username");
			String username=in.next();
			System.out.println("Enter pswd");
			int pswd=in.nextInt();
			boolean che=user.check(username, pswd,"Admin");
		
			if(che)
			{
				System.out.println("sucess");
			}
			else
			{
				System.out.println("Fail");
			}
		}
		if(n==3)
		{
			user.viewAll();
		}
	}

}
