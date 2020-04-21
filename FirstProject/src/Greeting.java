import javax.faces.bean.ManagedBean;

@ManagedBean
public class Greeting {
	public String getMessage(){
		return "Hello! You are welcome!!!";
	}
}
