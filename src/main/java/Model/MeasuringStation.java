package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MeasuringStation {

    long id;
    @JsonProperty("stationName")
    String stationName;
    @JsonProperty("gegrLat")
    double gegrLat;
    @JsonProperty("gegrLon")
    double gegrLon;
    @JsonProperty("city")
    private City city;
    @JsonProperty("addressStreet")
    String addressStreet;

    public long getId() {
        return id;
    }

    public String getStationName() {
        return stationName;
    }

    public double getGegrLat() {
        return gegrLat;
    }

    public double getGegrLon() {
        return gegrLon;
    }

    public City getCity() {
        return city;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    @Override
    public String toString() {
        return "StacjaPomiarowa{" +
                "id=" + id +
                ", stationName='" + stationName + '\'' +
                ", gegrLat=" + gegrLat +
                ", gegrLon=" + gegrLon +
                ", city=" + city +
                ", addressStreet='" + addressStreet + '\'' +
                '}';
    }
}
