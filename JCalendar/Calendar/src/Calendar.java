import java.util.*;
public class Calendar {
	 
	ArrayList<Event> EventStorage =  new ArrayList();
	
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



}
