import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Components {
	private String day;
	List<String> daysList;
	
	public Components() {
		daysList = new ArrayList<>();
		
		daysList.add("El Monday");
		daysList.add("El Tuesday");
		daysList.add("El Wenesday");
		daysList.add("El Thursday");
		daysList.add("El Friday");
		daysList.add("El Saturday");
		daysList.add("El Sunday");
		
	}
	
	public String selectedDay() {
		String selection = "" + day;
		
		return selection;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	public List<String> getDaysList() {
		return daysList;
	}
}
