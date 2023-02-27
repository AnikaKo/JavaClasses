package class23Polymorphism;

public class WebDriverTester {
    public static void main(String[] args) {
     WebDriver webDriver=new Chrome();
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();
        // Chrome googleChrome=new Chrome();
       // googleChrome.startBrowser();
        //googleChrome.openURL();
        //googleChrome.testLoginPage();
       // googleChrome.closeBrowser();

WebDriver[] browsers={new Chrome(), new Safari(), new Firefox()};
//an Array of type parant class can hold the objects of all the clild classes

       for(WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }

     /*   for(int i =0; i<browsers.length; i++){
            browsers[i].startBrowser();
            browsers[i].openURL();
            browsers[i].testLoginPage();
            browsers[i].closeBrowser();
        }*/




    }
}
