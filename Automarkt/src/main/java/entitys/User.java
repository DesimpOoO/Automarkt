package entitys;

public class User {

	private int id;
	private String username;
	private String name;
	private String lastName;
	private String password;
	private String birthdate;
	private String email;

	// true for user, false for admin
	private boolean user;

	public User(String username, String name, String lastName, String password, String birthdate, String email, boolean user) {

		setUsername(username);
		setName(lastName);
		setLastName(lastName);
		setPassword(password);
		setBirthdate(birthdate);
		setEmail(email);
		setUser(user);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return password;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public String getEmail() {
		return email;
	}

	public boolean isUser() {
		return user;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUser(boolean user) {
		this.user = user;
	}

}
