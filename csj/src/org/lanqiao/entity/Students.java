package org.lanqiao.entity;

public class Students {
  private int id;
  private String name;
  private int classid;
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
public int getClassid() {
	return classid;
}
public void setClassid(int classid) {
	this.classid = classid;
}
public Students(int id, String name, int classid) {
	super();
	this.id = id;
	this.name = name;
	this.classid = classid;
}
public Students() {
	
}
}
