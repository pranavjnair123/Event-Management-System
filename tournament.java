import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class tournament extends event {
	public int teamno;
	public int teamSize;
	public String sport;
	public int viewerseats;
	public ArrayList<team> teamlist=new ArrayList<team>();
	
	public static void tGen(tournament t,ArrayList<team> teamlist){
		if(teamlist.size()%2!=0) {
			team bye=new team();
			bye.teamName="Bye";
			teamlist.add(bye);
		}
		for(int i=0;i<teamlist.size()-1;i+=2) {
			System.out.println(teamlist.get(i).teamName+" vs "+teamlist.get(i+1).teamName);
		}
	}
	
	public static void printteams(tournament t) {
		for(team i:t.teamlist) {
			System.out.println("Team Name "+i.teamName);
			System.out.println("Members: ");
			for(int j=0;j<t.teamSize;j++) {
				System.out.println(i.teamMems[j]);
			}
			System.out.println();
		}
	}
	
	
	}

class team implements Serializable{
	public String[] teamMems;
	public String teamName;
	void newteam(int teamSize,ArrayList<team> teamlist) {
		Scanner scnr =new Scanner(System.in);
		System.out.println("Enter team name");
		teamName=scnr.next();
		System.out.println("Enter each team member's name");
		teamMems =new String[teamSize];
		for (int i=0;i<teamSize;i++) {
			String k=scnr.next();
			teamMems[i]=k;
		}
		System.out.println();
		
		
		teamlist.add(this);
	}
}


	

