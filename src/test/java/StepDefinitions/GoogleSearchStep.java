package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

public class GoogleSearchStep {
    public static WebDriver driver = null;


    @Given( "web browser is open" )

    public void web_browser_is_open() {
        String projectPath = System.getProperty( "user.dir" );
        String path = new File( projectPath + "/src/test/java/resources/drivers/chromedriver" ).getAbsolutePath();
        System.setProperty( "webdriver.chrome.driver", path );
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS );
        driver.manage().timeouts().pageLoadTimeout( 30, TimeUnit.SECONDS );
    }

    @And( "user is on google home page" )
    public String user_is_on_google_home_page() {
        driver.manage().window().maximize();
        driver.navigate().to( "https://www.google.com/" );
        return driver.getTitle();
    }

    @When( "user enters <searchText>" )
    public WebElement user_enters_search_text() {
        WebElement ele = driver.findElement( By.name( "q" ) );
        ele.sendKeys( "Raghav Pal" );
        return ele;
    }

    @And( "user clicks Login Button" )
    public void user_clicks_login_button() {
        WebElement searchBtn = driver.findElement( By.name( "q" ) );
        searchBtn.sendKeys( Keys.RETURN );
    }

    @And( "user is navigated to search results page" )
    public boolean user_is_navigated_to_search_results_page() {

        Predicate < WebDriver > isTitled = ( x ) -> x.getTitle().contains( "Raghav Pal " ) || x.getTitle().contains( "Automation Test Architect " );
        if (isTitled.test( driver )) {
            System.out.println( driver.getTitle().toUpperCase() );
        }
        return driver.getPageSource().contains( "Raghav Pal| Automation Test Architect" );
    }


    @And( "New searched page is displayed" )
    public boolean new_searched_page_is_displayed() {
//        WebElement element=driver.findElement(  By.xpath( "//*[@id=\"rso\"]/div[2]/div/div/div[2]/div[1]/a/h3" ));
//         if(element.isDisplayed()){
//             element.click() ;
//         }else{
//             System.out.println(element.isDisplayed());
//         }

        System.out.println( driver.getTitle() + " : " + driver.getCurrentUrl() );
        Predicate < WebDriver > isDisplayed = ( x ) -> x.getTitle().contains( "Raghav Pal " ) || x.getTitle().contains( "Automation Test Architect " );
        return isDisplayed.test(driver);


    }

//    @When("user navigates to {string}")
//    public void user_navigates_to(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        driver.navigate().to( "https://mvnrepository.com/repos/central" );
//
//        String s = (string==driver.getTitle()) ? "On Maven Repo Central" : "Not Valid: "+string;
//        System.out.println(s);
//    }

//    @And("user enters <searchText2>")
//    public void user_enters_search_text2() throws InterruptedException {
//        // Write code here that turns the phrase above into concrete actions
//        WebElement elem=driver.findElement( By.name( "q" ) );
//        elem.sendKeys( "cucumber java" );
//        elem.sendKeys( Keys.ENTER );
//        driver.manage().timeouts().implicitlyWait( 20,TimeUnit.SECONDS );
//        driver.manage().timeouts().pageLoadTimeout( 20,TimeUnit.SECONDS );
//        Thread.sleep( 1000 );
////        driver.close();
////        driver.quit();
//    }

//    @Given("user is on the searched page")
//    public void user_is_on_the_searched_page() {
//        driver.manage().window().fullscreen();
//        WebElement searchTextField=driver.findElement( By.className( "textfield" ) );
//        searchTextField.isDisplayed();
//
//    }
//
//    @When("user enters userSearchedText")
//    public void user_enters_user_searched_text() {
//        WebElement searchTextField=driver.findElement( By.className( "textfield" ) );
//        searchTextField.sendKeys( "cucumber" );
//        searchTextField.sendKeys( Keys.ENTER );
//    }
}
