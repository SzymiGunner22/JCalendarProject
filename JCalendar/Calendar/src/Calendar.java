import java.sql.Timestamp;
import java.util.*;
public class Calendar {
	 
	ArrayList<Event> EventStorage =  new ArrayList<Event>();
	
Calendar(){}
		

void addEvent(Event e) {
	EventStorage.add(e);
	sortBystartTime();
}
void deleteEvent(Event e) {
	EventStorage.remove(e);
	sortBystartTime();
}
void sortBystartTime()
{
	Collections.sort(EventStorage);
}
void setNewStartDateCal(Event ev,int y,int m, int d, int h, int mi, int s, int n)
{
	ev.setNewStartDate(y, m, d, h, mi, s, n);
	sortBystartTime();
}
void setNewEndDateCal(Event ev, int y,int m, int d, int h, int mi, int s, int n)
{
	ev.setNewEndDate(y, m, d, h, mi, s, n);
	sortBystartTime();
}
void printAllEvents() {
	for(Event ev: EventStorage) {
		System.out.println(ev.toString());
		
	}
	
}



}
