package class23Polymorphism;

public class WebDriver {
    public void startBrowser(){
        System.out.println("starting the browser");
    }
    public void openURL(){
        System.out.println("opening a url");
    }
    public void testLoginPage(){
        System.out.println("checking if login page works");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Google Chrome");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the url in Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google chrome");
    }
}
class Safari extends WebDriver{
    public void startBrowser() {
        System.out.println("Starting Safari");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the url in Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari");
    }

}
class Firefox extends WebDriver{
    public void startBrowser() {
        System.out.println("Starting Firefox");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the url in Firefox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login in Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Firefox");
    }

}