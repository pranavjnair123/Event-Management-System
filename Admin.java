import java.io.*;
import java.util.*;
public class Admin implements Serializable
{
	String name, gender;
	int age;
	String id;
	String qualification;
	
	static ArrayList<Admin>new_asst=new ArrayList<Admin>(); 
	static File assts=new File("C:\\Users\\AMRU\\Desktop\\eclipse stuff\\Project sem1\\src\\assts.dat");  
	static Scanner in = new Scanner(System.in);
	
	Admin(String name, String gender, String qualification, int age, String id)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.qualification= qualification; 
		this.id= id;

	}
	@Override
    public String toString() {
        return "Name: " + this.name + 
               ", gender: " + this.gender+
               ",Age is;"+this.age+
               "Qualifications"+this.qualification;
        
    } 
	public static void newAdmin() 
	{
		System.out.print("Enter name: ");
		String name = in.next();
		System.out.print("Enter the gender: ");
		String gender = in.next();
		System.out.print("Enter the qualifications: ");
		String qualification = in.next();
		System.out.print("Enter age: ");
		int age = in.nextInt();
		System.out.print("Enter her id: ");
		String id= in.next();
		
		Admin asst1= new Admin(name, gender, qualification ,age,id);
	    new_asst.add(asst1); 
		System.out.println("Successfully Completed Addition Of A Event Assistant !");
		System.out.println("The recruited admins are:");
		System.out.println(new_asst);
	}
}