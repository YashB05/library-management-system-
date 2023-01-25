package model;

public class Register {
	private String fname;
	private String lname;
	private String gender;
	private double mobno;
	private String uname;
	private String pass;
	public Register(String fname, String lname, String gender, double mobno, String uname, String pass) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.mobno = mobno;
		this.uname = uname;
		this.pass = pass;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getMobno() {
		return mobno;
	}
	public void setMobno(double mobno) {
		this.mobno = mobno;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
