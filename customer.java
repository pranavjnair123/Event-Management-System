import java.util.ArrayList;
import java.util.Scanner;
public class customer extends user {
	customer(String u, int p, String t) {
		super(u, p, t);
	}

	public String cusName;
	public static ArrayList<event> cusevents=new ArrayList<event>();
	
	public static void evCreate(user u){
		event.loadEvents();
		String name;
		int type = 0;
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter event name");
		name=scnr.next();
		System.out.println("Enter event type\n 1.Gathering\n 2.Show\n 3.Tournament");
		type=scnr.nextInt();
		if (type==1) {
			System.out.println("Enter event name");
			String ename=scnr.next();
			System.out.println("Enter date");
			int date=scnr.nextInt();
			System.out.println("Enter month");
			int month=scnr.nextInt();
			System.out.println("Enter year");
			int year=scnr.nextInt();
			System.out.println("Enter time");
			String time=scnr.next();
			System.out.println("Enter type of function");
			String typeoffunc=scnr.next();
			System.out.println("Enter price per hour");
			int pph=scnr.nextInt();
			System.out.println("Enter venue");
			String venue=scnr.next();
			
			gatherings g=new gatherings();
			g.eventName=ename;
			g.eventType="gathering";
			g.organizer=u.getusername();
			g.eventType="gathering";
			g.makegatherings(date, month, year, time, typeoffunc, pph, venue);
			g.addEvent();
			event.storeEvents();
		}
		if (type==2) {
			int dd,mm,yyyy;
			String time;
			String typeofshow;  //type of event like music,stand up comedy etc
			
			double ticketprice;
			String venue;
			int seats;
			System.out.println("Enter date");
			dd=scnr.nextInt();
			System.out.println("Enter month");
			mm=scnr.nextInt();
			System.out.println("Enter year");
			yyyy=scnr.nextInt();
			System.out.println("Enter Time of the show");
			time=scnr.next();
			System.out.println("Enter type of show");
			String stype=scnr.next();
			System.out.println("Enter Ticketprice");
			ticketprice=scnr.nextDouble();
			System.out.println("Enter venue");
			venue=scnr.next();
			System.out.println("Enter number of seats");
			seats=scnr.nextInt();
			
			shows s=new shows(name,dd,mm,yyyy,time,stype,ticketprice,venue,seats);
			s.organizer=u.getusername();
			s.eventType="show";
			s.addEvent();
			event.storeEvents();
		}
		
		if (type==3) {
			tournament t=new tournament();
			System.out.println("Enter tournament name");
			t.eventName=scnr.next();
			System.out.println("Enter sport name");
			t.sport=scnr.next();
			System.out.println("Enter number of players per team");
			t.teamSize=scnr.nextInt();
			System.out.println("Enter number of teams");
			t.teamno=scnr.nextInt();
			
			for (int i=0;i<t.teamno;i++) {
				team t1=new team();
				t1.newteam(t.teamSize, t.teamlist);
			}
			
			t.addEvent();
			event.storeEvents();
			
			System.out.println();
		}
		
	}
	
	
	public static void getcusevs(user u) {
		System.out.println();
		Scanner scnr=new Scanner(System.in);
		event.loadEvents();
		for(event i:event.eventList) {
			if (i.organizer.equals(u.getusername())) {
				customer.cusevents.add(i);
			}
		}
		for(event i:customer.cusevents) {
			System.out.println(i.eventName);
		}
		System.out.println();
		System.out.println("Enter event to view details for");
		String nm=scnr.next();
		for(event i:customer.cusevents) {
			if(i.eventName.equals(nm)) {
				if(i.eventType.equals("gathering")) {
					gatherings k=(gatherings) i;
					gatherings.printgathering(k);
					System.out.println();
				}
				if(i.eventType.equals("tournament")) {
					tournament k=(tournament) i;
					tournament.tGen(k, k.teamlist);
					System.out.println();
				}
				if(i.eventType.equals("show")) {
					shows k=(shows) i;
					shows.printshow(k);
					System.out.println();
				}
			}
		}
	}
	
	public static void delcusev(user u) {
		System.out.println("Enter event name");
		Scanner scnr =new Scanner(System.in);
		String nm=scnr.next();
		event.loadEvents();
		for(event i:event.eventList) {
			if (i.organizer.equals(u.getusername())) {
				customer.cusevents.add(i);
			}
		}
		for(event i:customer.cusevents) {
			System.out.println("t1");
			if(i.eventName.equals(nm)) {
				event.eventList.remove(i);
				event.loadEvents();
			}
		}
	}
}