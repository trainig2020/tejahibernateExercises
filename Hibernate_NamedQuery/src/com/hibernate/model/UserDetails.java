package com.hibernate.model;





import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@NamedQuery(name="UserDetails.byId",query="from UserDetails where UserId=?")
@NamedNativeQuery(name="UserDetails.byName",query="select * from UserDetails where UserName=?", 
					resultClass=UserDetails.class)
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int userId;
	
	
	
	private String userName;
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	

}
