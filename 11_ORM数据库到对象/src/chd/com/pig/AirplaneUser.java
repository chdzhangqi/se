package chd.com.pig;
import java.util.Date;

public class AirplaneUser{
	private Date lastLogin;
	private String firstName;
	private String lastName;
	private String password;
	private Byte isStaff;
	private Date dateJoined;
	private Byte isSuperuser;
	private Integer id;
	private Byte isActive;
	private String email;
	private String username;
	public void setLastLogin (Date lastLogin){this.lastLogin = lastLogin;	}
	public void setFirstName (String firstName){this.firstName = firstName;	}
	public void setLastName (String lastName){this.lastName = lastName;	}
	public void setPassword (String password){this.password = password;	}
	public void setIsStaff (Byte isStaff){this.isStaff = isStaff;	}
	public void setDateJoined (Date dateJoined){this.dateJoined = dateJoined;	}
	public void setIsSuperuser (Byte isSuperuser){this.isSuperuser = isSuperuser;	}
	public void setId (Integer id){this.id = id;	}
	public void setIsActive (Byte isActive){this.isActive = isActive;	}
	public void setEmail (String email){this.email = email;	}
	public void setUsername (String username){this.username = username;	}
	public Date getLastLogin (){return this.lastLogin;	}
	public String getFirstName (){return this.firstName;	}
	public String getLastName (){return this.lastName;	}
	public String getPassword (){return this.password;	}
	public Byte getIsStaff (){return this.isStaff;	}
	public Date getDateJoined (){return this.dateJoined;	}
	public Byte getIsSuperuser (){return this.isSuperuser;	}
	public Integer getId (){return this.id;	}
	public Byte getIsActive (){return this.isActive;	}
	public String getEmail (){return this.email;	}
	public String getUsername (){return this.username;	}
}