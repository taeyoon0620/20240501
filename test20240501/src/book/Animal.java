package book;

public class Animal {
	
	//필드 멤버 
	private long id;
	private String name;
	private int	age;
	
	// 멤버 메소드
	public Animal(long id, String name, int age) {// 잘못됨
		this.id = id;
		this.name = name;
		this.age = age;
	}
	

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getId() { 
		return id;
	}
	

	
	// 생성자
	public void showInfo() {
		System.out.println();
		System.out.println(this.id + " " + this.name + " " + this.age);
	}
	
	
}
