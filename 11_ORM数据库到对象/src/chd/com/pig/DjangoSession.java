package chd.com.pig;
import java.util.Date;

public class DjangoSession{
	private String sessionData;
	private String sessionKey;
	private Date expireDate;
	public void setSessionData (String sessionData){this.sessionData = sessionData;	}
	public void setSessionKey (String sessionKey){this.sessionKey = sessionKey;	}
	public void setExpireDate (Date expireDate){this.expireDate = expireDate;	}
	public String getSessionData (){return this.sessionData;	}
	public String getSessionKey (){return this.sessionKey;	}
	public Date getExpireDate (){return this.expireDate;	}
}