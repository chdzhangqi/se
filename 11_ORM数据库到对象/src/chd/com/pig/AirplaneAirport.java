package chd.com.pig;

import java.util.Date;

public class AirplaneAirport {
    private String country;
    private String lng;
    private String city;
    private String name;
    private Date useTime;
    private Integer id;
    private String lat;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getCountry() {
        return this.country;
    }

    public String getLng() {
        return this.lng;
    }

    public String getCity() {
        return this.city;
    }

    public String getName() {
        return this.name;
    }

    public Date getUseTime() {
        return this.useTime;
    }

    public Integer getId() {
        return this.id;
    }

    public String getLat() {
        return this.lat;
    }
}