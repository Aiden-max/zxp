package org.lanqiao.entity;

public class Dept {
  private int id;
  private String name;
  private int dept_id;
  private Emp emp;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Dept(int id, String name, int dept_id, Emp emp) {
	super();
	this.id = id;
	this.name = name;
	this.dept_id = dept_id;
	this.emp = emp;
}
public Dept() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDept_id() {
	return dept_id;
}
public void setDept_id(int dept_id) {
	this.dept_id = dept_id;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+","+this.name+","+this.dept_id+","+this.emp;
	}
  
}
