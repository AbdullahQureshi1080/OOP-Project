import java.io.Serializable;

public class Address implements Serializable {
    private String area;
    private String houseNo;
    private String street;
    private String city;
    private int cityCode;

    public Address() {
    }

    public Address(String area, String houseNo, String street, String city, int cityCode) {
        this.area = area;
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.cityCode = cityCode;
    }
    public Address(String area, String houseNo, String city, int cityCode) {
        this.area = area;
        this.houseNo = houseNo;
        this.city = city;
        this.cityCode = cityCode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public boolean checkAddress(){

        return false;
    }
}
