import java.io.*;
import java.util.ArrayList;
class event implements Serializable {
	public String organizer;
	public String eventName;
	public String eventType;
	public static ArrayList<event> eventList=new ArrayList<event>();
	public String getEventName() {
		return this.eventName;
		
	}
	public void setEventName(String x) {
		this.eventName=x;
	}
	public String getEventtype() {
		return this.eventType;
	}
	public void setEventType(String x) {
		this.eventType=x;
	}
	public void addEvent() {
		eventList.add(this);
	}
	
	public static void storeEvents() {
		File f=new File("D:\\Eclipse-workspace\\PROJECT\\src\\test.dat");
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(f));
			out.writeObject(eventList);
			out.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void loadEvents() {
		File f=new File("D:\\Eclipse-workspace\\PROJECT\\src\\test.dat");
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream(f));
			event.eventList=(ArrayList<event>) in.readObject();
		}
		catch(IOException e) {
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void viewAll() {
		event.loadEvents();
		for (event i:eventList) {
			System.out.println(i.eventName);
		}
	}
}
