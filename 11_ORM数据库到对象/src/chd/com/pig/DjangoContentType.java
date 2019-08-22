package chd.com.pig;
public class DjangoContentType{
	private String appLabel;
	private String model;
	private Integer id;
	public void setAppLabel (String appLabel){this.appLabel = appLabel;	}
	public void setModel (String model){this.model = model;	}
	public void setId (Integer id){this.id = id;	}
	public String getAppLabel (){return this.appLabel;	}
	public String getModel (){return this.model;	}
	public Integer getId (){return this.id;	}
}