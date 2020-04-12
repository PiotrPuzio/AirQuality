package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Commune {

    @JsonProperty("communeName")
    String communeName;
    @JsonProperty("districtName")
    String districtName;
    @JsonProperty("provinceName")
    String provinceName;

    public String getCommuneName() {
        return communeName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    @Override
    public String toString() {
        return "Commune{" +
                "communeName='" + communeName + '\'' +
                ", districtName='" + districtName + '\'' +
                ", provinceName='" + provinceName + '\'' +
                '}';
    }
}
