package chd.com.pig;
import java.util.Date;

public class AirplaneSpecialtasks{
	private String fAirport;
	private String speVersion;
	private Date fPlanTime;
	private Date tPlanTime;
	private Date fRealTime;
	private Date tRealTime;
	private String fliId;
	public void setFAirport (String fAirport){this.fAirport = fAirport;	}
	public void setSpeVersion (String speVersion){this.speVersion = speVersion;	}
	public void setFPlanTime (Date fPlanTime){this.fPlanTime = fPlanTime;	}
	public void setTPlanTime (Date tPlanTime){this.tPlanTime = tPlanTime;	}
	public void setFRealTime (Date fRealTime){this.fRealTime = fRealTime;	}
	public void setTRealTime (Date tRealTime){this.tRealTime = tRealTime;	}
	public void setFliId (String fliId){this.fliId = fliId;	}
	public String getFAirport (){return this.fAirport;	}
	public String getSpeVersion (){return this.speVersion;	}
	public Date getFPlanTime (){return this.fPlanTime;	}
	public Date getTPlanTime (){return this.tPlanTime;	}
	public Date getFRealTime (){return this.fRealTime;	}
	public Date getTRealTime (){return this.tRealTime;	}
	public String getFliId (){return this.fliId;	}
}