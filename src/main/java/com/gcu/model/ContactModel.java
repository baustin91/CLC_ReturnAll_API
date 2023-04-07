package com.gcu.model;

public class ContactModel 
{
	  public  int id;
	  public  String firstN;
	  public  String lastN;
	  public  String phone;
	  public  String email;
	  public  String address;
	

	  public ContactModel(int id, String firstN, String lastN, String phone, String email, String address) //long id, 
	  {
		this.id = id;
		this.firstN = firstN;
		this.lastN = lastN;
		this.phone = phone;
		this.email = email;
		this.address = address;
	  }
	
	  public ContactModel() 
	  {
		  super();
		
	  }
	  
	  @Override
		public String toString() //super string 
		{
			return "ContactModel [id=" + id + ", firstN=" + firstN + ", lastN=" + lastN + ", phone=" + phone + ",email=" + email + ", address=" + address + "]";
		}
	  
	//Getter
	  public int getid() 
	  {
	      return id;
	  }
	
	  // Setter	  
	  public void setid(int id) 
	  { 
		  this.id = id;
	  }
	  
	  //Getter
	  public String getfirstN() 
	  {
	      return firstN;
	  }
	
	  // Setter	  
	  public void setfirstN(String firstN) 
	  { 
		  this.firstN = firstN;
	  }
	  
	  //Getter
	  public String getlastN() 
	  {  
	      return lastN;
	  }
	
	  // Setter	  
	  public void setlastN(String lastN) 
	  { 
	    this.lastN = lastN;
	  }
	  
	  //Getter
	  public String getphone() 
	  {
		  
	      return phone;
	  }
	
	  // Setter	  
	  public void setphone(String phone) 
	  { 
	    this.phone = phone;
	  }  
	  
	  //Getter
	  public String getemail() 
	  {
		  
	      return email;
	  }
	  //Setter
	  public void setemail(String email) 
	  { 
	    this.email = email;
	  }
	
	  //Getter  
	  public String getaddress() 
	  {
		  
	      return address;
	  }
	  //Setter
	  public void setaddress(String address) 
	  { 
	    this.address = address;
	  }
	  
	  //New contact model function
	  //public ContactModel addContact(ContactModel newCon) 
	  //{
	//	  return newCon;
	  //}

}