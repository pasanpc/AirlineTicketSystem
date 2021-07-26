package com.user;

public class User {
	
	private int id;
    private String fname;
    private String lname;
    private String userName;
    private String nic;
    private String phone;
    private String email;
    private String address1;
    private String password;
    
	public User(int id, String fname, String lname, String userName, String nic, String phone, String email, String address1, String password) {
		
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.userName = userName;
		this.nic = nic;
		this.phone = phone;
		this.email = email;
		this.address1 = address1;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getUserName() {
		return userName;
	}

	public String getNic() {
		return nic;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress1() {
		return address1;
	}
	
	public String getPassword() {
		return password;
	}
      

}
