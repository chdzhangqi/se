package chd.com.pig;
public class AuthPermission{
	private String codename;
	private String name;
	private Integer contentTypeId;
	private Integer id;
	public void setCodename (String codename){this.codename = codename;	}
	public void setName (String name){this.name = name;	}
	public void setContentTypeId (Integer contentTypeId){this.contentTypeId = contentTypeId;	}
	public void setId (Integer id){this.id = id;	}
	public String getCodename (){return this.codename;	}
	public String getName (){return this.name;	}
	public Integer getContentTypeId (){return this.contentTypeId;	}
	public Integer getId (){return this.id;	}
}