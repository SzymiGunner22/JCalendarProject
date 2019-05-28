import java.sql.Timestamp;
import java.util.Comparator;

public class Event implements Comparable<Event>{
	private String name;
	private String place;
	private String description;
	
	private Timestamp start;
	private Timestamp end;
	
	Event(String name,String place,String description,Timestamp start, Timestamp end)
	{
		super();
		this.name=name;
		this.place=place;
		this.description=description;
		this.start=start;
		this.end=end;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getPlace()
	{
		return place;
	}
	
	public void setPlace(String place)
	{
		this.place=place;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description=description;
	}
	
	public Timestamp getStart()
	{
		return start;
	}
	
	public void setStart(Timestamp start)
	{
		this.start=start;
	}
	
	public Timestamp getEnd()
	{
		return end;
	}
	
	public void setEnd(Timestamp end)
	{
		this.end=end;
	}
	
	public String toString()
	{
		return "Event: " + name ;
	}
	
	public static Comparator<Event> EventComparator = new Comparator<Event>(){
		@Override
		public int compare(Event E1, Event E2) {
			return E1.name.compareTo(E2.name);
		}
	}; 
	
	@Override
	public int compareTo(Event o) {
		// TODO Auto-generated method stub
		if(this.start.equals(o.start)) return 0;
		if(this.start.after(o.start)) return 1;
		else return -1;
	}
}
