package org.lanqiao.entity;
import org.lanqiao.entity.Adress;
public class Student {
	private int id;
	private String name;
	private int age ;
	private boolean sex;
	private Adress adress;
	
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public Student() {
	}
	public Student(int id, String name, int age,boolean sex,Adress adress) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex=sex;
		this.adress=adress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	@Override
	public String toString() {
		return this.id+","+this.name+","+this.age+"," +this.sex+","+this.adress;
	}
}
