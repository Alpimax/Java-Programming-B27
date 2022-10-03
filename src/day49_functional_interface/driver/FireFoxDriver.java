package day49_functional_interface.driver;

public class FireFoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("opening in firefox");
    }

    @Override
    public void findElement() {
        System.out.println("finding elements in firefox");
    }
}
