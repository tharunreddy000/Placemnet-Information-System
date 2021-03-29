package qwerty;

public class user {
	 String name=null;
     String mobile=null;
     String email1=null;
     String adar=null;
     String dob;
     String add=null;
     String branch=null;
     String cgpa=null;
     String link=null;
     String degree=null;
     
    
	public user() {
		super();
	}


	public user(String name, String mobile, String email1, String adar, String dob, String add, String branch,
			String cgpa, String link, String degree) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email1 = email1;
		this.adar = adar;
		this.dob = dob;
		this.add = add;
		this.branch = branch;
		this.cgpa = cgpa;
		this.link = link;
		this.degree = degree;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmail1() {
		return email1;
	}


	public void setEmail1(String email1) {
		this.email1 = email1;
	}


	public String getAdar() {
		return adar;
	}


	public void setAdar(String adar) {
		this.adar = adar;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getCgpa() {
		return cgpa;
	}


	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}
	 
}
