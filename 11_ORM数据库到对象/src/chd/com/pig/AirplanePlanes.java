package chd.com.pig;
public class AirplanePlanes{
	private String planeName;
	private String planeId;
	private String planeAirplaneId;
	private String planeVersion;
	public void setPlaneName (String planeName){this.planeName = planeName;	}
	public void setPlaneId (String planeId){this.planeId = planeId;	}
	public void setPlaneAirplaneId (String planeAirplaneId){this.planeAirplaneId = planeAirplaneId;	}
	public void setPlaneVersion (String planeVersion){this.planeVersion = planeVersion;	}
	public String getPlaneName (){return this.planeName;	}
	public String getPlaneId (){return this.planeId;	}
	public String getPlaneAirplaneId (){return this.planeAirplaneId;	}
	public String getPlaneVersion (){return this.planeVersion;	}
}