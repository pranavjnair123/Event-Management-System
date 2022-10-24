public class shows extends event
{
	
	int dd,mm,yyyy;
	String time;
	String type;  //type of event like music,stand up comedy etc
	
	double ticketprice;
	String venue;
	int seats;
	
	shows(String s,int d,int m,int y,String tim,String typ,double tprice,String v,int se)
	{
		this.eventName=s;
		this.dd=d;
		this.mm=m;
		this.yyyy=y;
		this.time=tim;
		this.type=typ;
		this.ticketprice=tprice;
		this.venue=v;
		this.seats=se;
	}

	public void setseats(int n)
	{
		this.seats=n;
	}
	public void settime(String t)
	{
		this.time=t;
	}
	public void setday(int d)
	{
		this.dd=d;
	}
	public void setmonth(int m)
	{
		this.mm=m;
	}
	public void setyear(int y)
	{
		this.yyyy=y;
	}
	public void setvenue(String v)
	{
		this.venue=v;
	}
	public void setshowtitle(String s)
	{
		this.eventName=s;
	}
	public void setticketprice(double t)
	{
		this.ticketprice=t;
	}
	
	
	
	
	
	public static void printshow(shows q)
	{
		System.out.println(q.eventName);
		System.out.println("Type :"+q.type);
		System.out.println("Venue :"+q.venue);
		System.out.println("On :"+q.dd+"/"+q.mm+"/"+q.yyyy);
		System.out.print("  @ "+q.time);
		System.out.println("Ticket Price :"+q.ticketprice);
		
	}
	
	
	
	
	public static void bookshowtickets(shows q,int c)
	{
			
		if(((q.seats)-c)>=0)
		{
				int k=q.seats-c;
				q.setseats(k);
		}
	
	}
}