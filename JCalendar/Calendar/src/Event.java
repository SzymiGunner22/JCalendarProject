import java.sql.Timestamp;
import java.util.Comparator;

public class Event implements Comparable<Event>{
	private String name;
	private String place;
	private String description;
	
	private Timestamp startDate;
	private Timestamp endDate;
	
	Event(String name,String place,String description,Timestamp start, Timestamp end)
	{
		super();
		this.name=name;
		this.place=place;
		this.description=description;
		this.startDate=start;
		this.endDate=end;
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
		return startDate;
	}
	
	public void setStart(Timestamp start)
	{
		this.startDate=start;
	}
	
	public Timestamp getEnd()
	{
		return endDate;
	}
	
	public void setEnd(Timestamp end)
	{
		this.endDate=end;
	}
	
	public String toString()
	{
		return "Event: " + name + " Date rozpoczecia:" + startDate + " Date zakończenia:" + endDate;
	}

	@Override
	public int compareTo(Event o) {
		// TODO Auto-generated method stub
		return this.startDate.compareTo(o.startDate);
	}

	
	

}
