import java.io.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class user implements Serializable
{
	 static ArrayList<user> userList=new ArrayList<>();
	 private String username=new String();
	 private int password;
	 private String usertype;
	
	 
	public static void removeuser(user u) {
		user.loadusers();
		user.userList.remove(u);
		user.storeuser();
	}
	public String getusername()
	{
		return username;
	}
	public int getpassword()
	{
		return password;
	}
	
	public void setusername(String n)
	{
		this.username=n;
	}
	
	public void setpassword(int n)
	{
		this.password=n;
	}
	
	public String getusertype()
	{
		return usertype;
	}
	public void setusertype(String n)
	{
		this.usertype=n;
	}
	
	user(String u,int p,String t)
	{
		this.username=u;
		this.password=p;
		this.usertype=t;
		
	}
	

	public static void adduser(user n)
	{
		loadusers();
		userList.add(n);
	}
	public static boolean check(String u,int p,String t)
	{
		loadusers();
		for (user i:userList)
		{
			if(i.getusername().equals(u)&&i.getpassword()==p&&i.getusertype().equals(t))
			{
					
						return true;
	
			}
			
		}
		return false;
		
	}
	
	public static user getUser(String u,int p) {
		loadusers();
		user t = null;
		for (user i:userList)
		{
			if(i.getusername().equals(u)&&i.getpassword()==p)
			{
				t=i;
						
	
			}
			else {
				t=new user(u,p,"Customer");
				
			}
			
		}
		return t;
		
	}
	
	public static void storeuser() {
		File f=new File("D:\\Eclipse-workspace\\PROJECT\\src\\userlist.dat");
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(f));
			out.writeObject(userList);
			out.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	public static void loadusers() {
		File f=new File("D:\\\\Eclipse-workspace\\\\PROJECT\\\\src\\\\userlist.dat");
		try {
			@SuppressWarnings("resource")
			ObjectInputStream in=new ObjectInputStream(new FileInputStream(f));
			user.userList=(ArrayList<user>) in.readObject();
		}
		catch(IOException e) {
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void viewAll() {
		user.loadusers();
		for (user i:userList) {
			System.out.println();
			System.out.print(i.username);
			System.out.print(" : ");
			System.out.print(i.usertype);
			System.out.println();
		}
}
}

