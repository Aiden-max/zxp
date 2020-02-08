package org.lanqiao.entity;

public class Emp {
 private int id;
 private String names;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNames() {
	return names;
}
public void setNames(String names) {
	this.names = names;
}
public Emp(int id, String names) {
	super();
	this.id = id;
	this.names = names;
}
public Emp() {
	
}
 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getNames()+","+this.id;
	}
}
