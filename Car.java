package classnobject;


// creating class with custom constructor and getter, setter method

public class Car {                   // defined propertize without initializing a value
    public String brand;
    public String model;
    public int year;
    public double price;
    public boolean isNew;

    //constructor. We create constructor to initialize an object

    public Car(){         //default constructor. we can initialize the value here, OR we can initialize the value in Main class using .set AND .get
        this.brand="BMW";
        this.model="GHS";
        this.year=2018;
        this.price=409944.30;
        this.isNew=true;
    }


    public Car(String brand, String model, int year) {    //custom constructor
        this.brand = brand;
        this.model=model;
        this.year=year;
    }

    public Car(String brand, String model, int year, double price, boolean isNew) {  //custom constructor
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isNew = isNew;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
