//package StepDefinitions;
//
//import org.junit.BeforeClass;
//import org.junit.jupiter.api.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//
//class GoogleSearchStepTest {
//
//    private static GoogleSearchStep google;
//    private static WebDriver driverShadow;
//
//    @BeforeClass
//    static void setUp() {
//        google=new GoogleSearchStep();
//        driverShadow=GoogleSearchStep.driver;
//    }
//
//    @BeforeEach
//    @org.junit.Test
//    public void browserTest(){
//        Assertions.assertNotNull( google );
//        Assertions.assertNotNull( driverShadow );
//    }
//
//    @Test
//    void web_browser_is_open() {
//        Assertions.assertEquals( true,google.new_searched_page_is_displayed());
//    }
//
//    @Test
//    void user_is_on_google_home_page() {
//        Assertions.assertEquals( driverShadow.getTitle() ,google.user_is_on_google_home_page() );
//    }
//
//    @Test
//    void user_enters_search_text() {
//        WebElement ele = driverShadow.findElement( By.name( "q" ) );
////        Assertions.assertEquals( "","" );
//        Assertions.assertSame( ele,google.user_enters_search_text().getScreenshotAs( OutputType.FILE  ) );
//    }
//
////    @Test
////    void user_clicks_login_button() {
////
////    }
////
////    @Test
////    void user_is_navigated_to_search_results_page() {
////    }
//
//    @Test
//    void new_searched_page_is_displayed() {
//        Assertions.assertEquals( true,google.new_searched_page_is_displayed());
//
//    }
//
//
//    @AfterEach
//    void tearDown() {
//        driverShadow.close();
//        driverShadow.quit();
//        Assertions.assertNull( driverShadow=null );
//    }
//
//
//}