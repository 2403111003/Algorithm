package NOop12;

public class Member {
	private String name;
	private String id;
	private String pw;
	private int age;
	public Member(String name,String id,String pw,int age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId() {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw() {
		this.pw = pw;
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age = age;
	}
}
