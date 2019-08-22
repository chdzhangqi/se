package chd.com.pig;
import java.util.Date;

public class DjangoMigrations{
	private String app;
	private Date applied;
	private String name;
	private Integer id;
	public void setApp (String app){this.app = app;	}
	public void setApplied (Date applied){this.applied = applied;	}
	public void setName (String name){this.name = name;	}
	public void setId (Integer id){this.id = id;	}
	public String getApp (){return this.app;	}
	public Date getApplied (){return this.applied;	}
	public String getName (){return this.name;	}
	public Integer getId (){return this.id;	}
}