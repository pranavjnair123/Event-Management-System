import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.io.ObjectOutputStream;
 


public class main {

 

    public static void main(String[] args) {
    
    
        
        int ch;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("----------------------------------------------------------");
        System.out.println("*-*-*-*-*-*-*-*Event Management System*-*-*--*-*--*-*-*-*");
        System.out.println("----------------------------------------------------------");
        
        boolean running=true;
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
			
			user u=new user(username, pswd, "Customer");
			user.adduser(u);
			user.storeuser();
			
			
		}
		if(n==2)
		{
			
			
			System.out.println("----------------------------------------------------------");
	        System.out.println("(1)Admin (2)Customer (3) Guest");
	        System.out.println("----------------------------------------------------------");
	        ch=sc.nextInt();
	        
			
			if (ch==1) {
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
			
			if (ch==2) {
				System.out.println("Enter username");
				String username=in.next();
				System.out.println("Enter pswd");
				int pswd=in.nextInt();
				boolean che=user.check(username, pswd,"Customer");
				if(che)
				{
					System.out.println("sucess");
				}
				else
				{
					System.out.println("Fail");
				}
				
				user u=user.getUser(username, pswd);
				System.out.println();
				
				while(running) {
					System.out.println("1. Create an event");
					System.out.println("2. View events");
					System.out.println("3. Delete event");
					System.out.println("4. Exit");
					int op=sc.nextInt();
					if(op==1) {
						customer.evCreate(u);
					}
					if (op==2) {
						customer.getcusevs(u);
					}
					if(op==4) {
						running=false;
						System.exit(0);
					}
					
					if(op==3) {
						
					}
					
					
					
					continue;
				}
			}
			if(ch==3) {
				System.out.println("guest");
			}
		
			
	        if(ch==1)
	        {
	        Admin.newAdmin();
	        }
	    
	        if(ch==3)
	        { String Name,Place,Address;
	         Long PhoneNumber, NoOfPerson;
	        
	        System.out.println("You've logged in as Guest");
	        System.out.println("----------------------------------------------------------");
	        System.out.println("Please enter details:");
	        System.out.println("----------------------------------------------------------");
	        System.out.println("Choose Name:");
	        Name=sc.next();
	        System.out.println("Choose Place:");
	        Place=sc.next();
	        System.out.println("Choose Address:");
	        Address=sc.next();
	        System.out.println("Choose PhoneNumber:");
	        PhoneNumber=sc.nextLong();
	        System.out.println("Choose NoofPerson:");
	        NoOfPerson=sc.nextLong();
	        
	         System.out.println("All events available are:");}
	         event.viewAll();
	        
	}
		
		if(n==3)
		{
			user.viewAll();
		}}
        }
        
        
        

 


    

