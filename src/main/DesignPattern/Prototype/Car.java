package Prototype;

public class Car implements Cloneable{

    private String company;
    private String model;
    private String serialNumber;
    private Integer year;

    public Car(String company, String model, String serialNumber, Integer year) {
        this.company = company;
        this.model = model;
        this.serialNumber = serialNumber;
        this.year = year;
    }

    public Car(){}

    public String getCompany() {
        return company;
    }

    public Car setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Car setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public Car setYear(Integer year) {
        this.year = year;
        return this;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
