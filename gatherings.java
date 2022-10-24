public class gatherings extends event{
	public int dd,mm,yyyy;
	public String time;
	public String type;  //type of gatherings like wedding,birthdays etc
	
	public double price_per_hour;
	public String venue;
	public double hours;
	
	
	
	public void setvenue(String s)
	{
		this.venue=s;
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
	public void settitle(String s)
	{
		this.eventName=s;
	}
	public void settype(String s)
	{
		this.type=s;
	}
	public void setprice_per_hour(double t)
	{
		this.price_per_hour=t;
	}
	public void sethours(double x)
	{
		this.hours=x;
	}
	
	public static void printgathering(gatherings q)
	{
		System.out.println(q.eventName);
		System.out.println("Type :"+q.type);
		System.out.println("Venue :"+q.venue);
		System.out.println("On :"+q.dd+"/"+q.mm+"/"+q.yyyy);
		System.out.println(" @ "+q.time);
		System.out.println("Price per hour :"+q.price_per_hour);
		
	}
	
	
	public void makegatherings(int d,int m,int y,String tim,String typ,double pprice,String v)
	{
		dd=d;
		mm=m;
		yyyy=y;
		time=tim;
		type=typ;
		price_per_hour=pprice;
		venue=v;
		
	}
	
	
	public static void bookhours(gatherings q,int c)
	{
			
		System.out.println("Total price is"+c*q.price_per_hour);
	
	}
}