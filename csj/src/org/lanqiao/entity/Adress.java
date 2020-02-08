package org.lanqiao.entity;

public class Adress {
  private String homeadress;
  private String schooladress;
public String getHomeadress() {
	return homeadress;
}
public void setHomeadress(String homeadress) {
	this.homeadress = homeadress;
}
public String getSchooladress() {
	return schooladress;
}
public void setSchooladress(String schooladress) {
	this.schooladress = schooladress;
}
public Adress(String homeadress, String schooladress) {
	
	this.homeadress = homeadress;
	this.schooladress = schooladress;
}
public Adress() {
	
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.homeadress+","+this.schooladress;
	}
}
