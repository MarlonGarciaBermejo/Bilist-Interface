public class MilitaryTank extends Vehicle {

    int legalAge = 25;
    int milesToGo = 2000;
    int milesDriven = 5;
    boolean info = false;

    //constructor for MilitaryTank
    public MilitaryTank() {
        System.out.println("Tank created, 2000 miles to go!");
    }
    private boolean setDriver(Driver, driver) {
        if (checkAge(driver.driver, driver.age)) {
            this.driver = driver;
            System.out.println("Driver changed to" + driver.driver);
            info = true;

        }
        private boolean checkAge(String name, int age) {
            if (age < legalAge) {
                System.out.println("Driver not changed" + name + " is " + age + ", but you must be 25 or older to drive a Tank");
            } else {
                return true;
            }
            return false;

        }
        public void drive () {
            if (!info) {
                System.out.println("Tank didn't drive- there's no driver!");
            } else {
                milesToGo = milesToGo - milesDriven;
                System.out.println("Tank drove " + milesDriven + " miles - " + milesToGo + " to go!");
            }

        }
    }
}
