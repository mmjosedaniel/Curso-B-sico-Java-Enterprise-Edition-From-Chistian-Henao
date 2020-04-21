import javax.faces.bean.ManagedBean;

@ManagedBean
public class BeanPerson {
	private String name;
	private String phone;
	private int age;
	private String welcomeMessage;
	
	public BeanPerson() {
		
	}
	
	public void greeting() {
		String message = "Hellow! Welcome to the system,"
				+ "it is a plesure to attend you " + getName();
		setWelcomeMessage(message);
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getWelcomeMessage() {
		return welcomeMessage;
	}

	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}
}
