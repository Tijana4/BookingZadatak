package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Booking;

public class BookingTest extends BaseTest{


    Booking bookin;


    @BeforeMethod
    public void localSetup(){
        bookin=new Booking(driver);

    }

    @Test
    public void test1()
    {
        bookin.Bukiraj();
        bookin.odaberiDorucakIhotel();
        bookin.clickSelect();
        bookin.unesiPodatke();
    }


}
