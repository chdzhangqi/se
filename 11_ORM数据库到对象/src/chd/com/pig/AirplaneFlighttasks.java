package chd.com.pig;
import java.util.Date;

public class AirplaneFlighttasks{
	private String fAirport;
	private String tAirport;
	private Date fPlanTime;
	private Integer fliNumber;
	private Date tPlanTime;
	private Date fRealTime;
	private Date tRealTime;
	private String fliId;
	public void setFAirport (String fAirport){this.fAirport = fAirport;	}
	public void setTAirport (String tAirport){this.tAirport = tAirport;	}
	public void setFPlanTime (Date fPlanTime){this.fPlanTime = fPlanTime;	}
	public void setFliNumber (Integer fliNumber){this.fliNumber = fliNumber;	}
	public void setTPlanTime (Date tPlanTime){this.tPlanTime = tPlanTime;	}
	public void setFRealTime (Date fRealTime){this.fRealTime = fRealTime;	}
	public void setTRealTime (Date tRealTime){this.tRealTime = tRealTime;	}
	public void setFliId (String fliId){this.fliId = fliId;	}
	public String getFAirport (){return this.fAirport;	}
	public String getTAirport (){return this.tAirport;	}
	public Date getFPlanTime (){return this.fPlanTime;	}
	public Integer getFliNumber (){return this.fliNumber;	}
	public Date getTPlanTime (){return this.tPlanTime;	}
	public Date getFRealTime (){return this.fRealTime;	}
	public Date getTRealTime (){return this.tRealTime;	}
	public String getFliId (){return this.fliId;	}
}