import java.sql.Timestamp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Szymon Rutkowski 216881 i Sylwester D�browski");
		Calendar cal = new Calendar();
		@SuppressWarnings("deprecation")
		Event e1 = new Event("Hairdresser","Lodz",new Timestamp(2019-1900,4,28,12,00,00,0),new Timestamp(2019-1900,4,28,12,10,0,0),null);
		Event e2 = new Event("Meeting","Warsaw",new Timestamp(2019-1900,4,28,10,00,00,0),new Timestamp(2019-1900,4,28,12,10,0,0),"Be 30 mins earlier");
		Event e3 = new Event("Mechanic","Poznan",new Timestamp(2019-1900,3,28,10,00,00,0),new Timestamp(2019-1900,3,28,12,10,0,0),"take every part");
//		System.out.println(e1.toString());
//		System.out.println(e2.toString());
		cal.addEvent(e1);
		cal.addEvent(e2);
		cal.addEvent(e3);
		cal.printAllEvents();
		cal.deleteEvent(e2);
		cal.printAllEvents();
	}

}
