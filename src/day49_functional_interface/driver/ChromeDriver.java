package day49_functional_interface.driver;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("opening in chrome");
    }

    @Override
    public void findElement() {
        System.out.println("finding elements in chrome");
    }
}
