package classnobject;

public class TestCar {
    public static void main(String[] args) {
        Car imaniscar=new Car();
        System.out.println(imaniscar.brand);  //calling default constructor here directly, since the value is already assigned in Car class

        System.out.println("________________________");

        // Below example- we are also using default constructor here. But created a new object and Re-assigning the value.  the  this is time consuming, since we have to use  set method- the brand, year, model first AND then get the brand etc

        Car ashazCar=new Car();
        ashazCar.setBrand("Jaguar");
        ashazCar.setModel("Rx");
        ashazCar.setYear(2019);
        System.out.println(ashazCar.getBrand());
        System.out.println(ashazCar.getModel());
        System.out.println(ashazCar.getYear());


        System.out.println("______________________________");  // when we use custome constructor, we do not need to use .set method to set them indivually, we can declare
                                                               // them all at once. like below example using custom constructor.
                                                               // we do not need to initialize any parameter. we already initialized them in Constructor
                                                               // instead we can only put the values against the param
                                                               // totally ignoring set method

        Car honda=new Car ("Honda", "Accord", 2019); // here we have created an object and using the constructor that we have initialized
        System.out.println(honda.getBrand());
        System.out.println(honda.getModel());
        System.out.println(honda.getYear());

        Car zeenanscar= new Car("Lexus", "GM", 2018, 50000.45, true);
        System.out.println("Zeenan's Car: " + zeenanscar.getBrand());
        System.out.println("Zeenan's Car: " + zeenanscar.getModel());
        System.out.println("Zeenan's Car: " +zeenanscar.getYear());
        System.out.println("Zeenan's Car: " +zeenanscar.getPrice());
        System.out.println("Zeenan's Car: " +zeenanscar.isNew);
    }
}
