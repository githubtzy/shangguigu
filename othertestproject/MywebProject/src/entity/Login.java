package entity;

public class Login {
	
	private int id;
	
	
	private String name;
	
	private String age;
	
	private String  passwd;
	
	public Login() {
	
	}

	public Login(String name, String passwd) {
		super();
		this.name = name;
		this.passwd = passwd;
	}

	public Login(int id, String name, String age, String passwd) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", name=" + name + ", age="
				+ age + ", passwd=" + passwd + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}



}
