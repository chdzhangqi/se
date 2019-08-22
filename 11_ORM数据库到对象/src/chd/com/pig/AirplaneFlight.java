package chd.com.pig;
import java.util.Date;

public class AirplaneFlight{
	private String fAirport;
	private String tAirport;
	private Date fTime;
	private String airplane;
	private Integer id;
	private Date tTime;
	private String type;
	private String fCity;
	private String airId;
	private String tCity;
	private String flightNumber;
	public void setFAirport (String fAirport){this.fAirport = fAirport;	}
	public void setTAirport (String tAirport){this.tAirport = tAirport;	}
	public void setFTime (Date fTime){this.fTime = fTime;	}
	public void setAirplane (String airplane){this.airplane = airplane;	}
	public void setId (Integer id){this.id = id;	}
	public void setTTime (Date tTime){this.tTime = tTime;	}
	public void setType (String type){this.type = type;	}
	public void setFCity (String fCity){this.fCity = fCity;	}
	public void setAirId (String airId){this.airId = airId;	}
	public void setTCity (String tCity){this.tCity = tCity;	}
	public void setFlightNumber (String flightNumber){this.flightNumber = flightNumber;	}
	public String getFAirport (){return this.fAirport;	}
	public String getTAirport (){return this.tAirport;	}
	public Date getFTime (){return this.fTime;	}
	public String getAirplane (){return this.airplane;	}
	public Integer getId (){return this.id;	}
	public Date getTTime (){return this.tTime;	}
	public String getType (){return this.type;	}
	public String getFCity (){return this.fCity;	}
	public String getAirId (){return this.airId;	}
	public String getTCity (){return this.tCity;	}
	public String getFlightNumber (){return this.flightNumber;	}
}