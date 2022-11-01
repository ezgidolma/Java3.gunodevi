
public class User {

	private int id;
	private String firstName;
	private String password;
	private String lastNanme;
	
	public User() {
		
	}
	
	public User(int id,String firstName,String lastName,String password) {
		
		this.id=id;
		this.firstName=firstName;
		this.lastNanme=lastName;
		this.password=password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNanme() {
		return lastNanme;
	}

	public void setLastNanme(String lastNanme) {
		this.lastNanme = lastNanme;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
