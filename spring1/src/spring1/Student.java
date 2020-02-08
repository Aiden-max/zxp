package spring1;
//123
//225
//222
public class Student {
	private int son;
	private String name;
	private int age;
	public int getSon() {
		return son;
	}
	public void setSon(int son) {
		this.son = son;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
 public String string() {
	// TODO Auto-generated method stub
	
	System.out.print(name);
	return name;
}
 @Override
	public String toString() {
		return this.name+","+this.age+","+this.son;
	}
}
