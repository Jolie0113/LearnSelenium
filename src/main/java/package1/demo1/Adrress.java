package package1.demo1;

public class Adrress {

    private String number;
    private String stress;
    private String ward;
    private String district;
    private String city;
    private String country;

    public Adrress(String number, String stress, String ward, String district, String city, String country) {
        this.number = number;
        this.stress = stress;
        this.ward = ward;
        this.district = district;
        this.city = city;
        this.country = country;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStress() {
        return stress;
    }

    public void setStress(String stress) {
        this.stress = stress;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Adrress{" +
                "number='" + number + '\'' +
                ", stress='" + stress + '\'' +
                ", ward='" + ward + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
