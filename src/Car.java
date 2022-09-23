public class Car extends Vehicle {

    int legalage = 18;
    int milesDriven = 10;
    int milesToGo = 100;
    boolean info = false;

    public Car() {
        System.out.println("Car created. 100 miles to go!");
    }

    public void setDriver(Driver driver) {
        if (checkAge(driver.driver, driver.age)) {
            this.driver = driver;
            System.out.println("Driver changed to" + driver.driver);
            info = true;
        }
        private boolean checkAge (String name,int age){
            if (age < legalAge) {
                System.out.println("Driver not changed" + name + " is " + age + " but must be 18 years or older to drive a car");
            } else {
                return true;
            }
            return false;
        }
        public void drive () {
            if (!info) {
                System.out.println("Car didn't drive- there's no driver!");
            } else {
                milesToGo = milesToGo - milesDriven;
                System.out.println("Car drove " + milesDriven + " miles - " + milesToGo + " to go!");
            }
        }
    }
}

