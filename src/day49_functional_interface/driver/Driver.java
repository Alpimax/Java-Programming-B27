package day49_functional_interface.driver;

import day49_functional_interface.ConfigReader;

public class Driver { // new Driver()

    private Driver(){}
    /*
        Q: why is the constructor private??

        private means only accessible in the same class
        constructor is used to created object

        so, I cannot create objects outside the class

     */

    private static WebDriver driver;
    /*

        private: cannot access outside the class
        static: don't need an object to use

        default of driver? null
     */

    public static WebDriver getDriver(){

        if(driver == null) {

            switch (ConfigReader.getProperty("browser")) {

                case "chrome":
                    driver = new ChromeDriver();
                    // rest of the code for chrome
                /*
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                 */
                    break;
                case "firefox":
                    driver = new FireFoxDriver();
                    // rest of the code for firefox

            }
        }

        return driver;
    }

}

// Driver.getDriver().get("google")
