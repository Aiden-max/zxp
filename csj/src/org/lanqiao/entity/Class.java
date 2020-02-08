package org.lanqiao.entity;

import java.util.List;

public class Class {
 private int classid;
 private String classname;
 private List<Students> students;

public Class(int classid, String classname, List<Students> students) {
	super();
	this.classid = classid;
	this.classname = classname;
	this.students = students;
}
public int getClassid() {
	return classid;
}
public void setClassid(int classid) {
	this.classid = classid;
}
public String getClassname() {
	return classname;
}
public void setClassname(String classname) {
	this.classname = classname;
}
public List<Students> getStudents() {
	return students;
}
public void setStudents(List<Students> students) {
	this.students = students;
}
public Class() {
	
}

	
}
