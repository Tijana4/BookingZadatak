package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;


public class Booking extends BasePage{
    By gde_idete=By.cssSelector("#ss");
    By data_picker = By.cssSelector("div[data-mode='checkin']");
    By datum1=By.cssSelector("td[data-date='2022-12-26']");
    By datum2=By.cssSelector("td[data-date='2023-01-03']");
    By searchButton=By.cssSelector(".sb-searchbox__button ");
    By dorucak=By.xpath("//div[contains(text(),'Breakfast Included')]");

    By klasaSkrol=By.cssSelector(".hprt-table-header-cell.hprt-table-header-rooms-number");

    By hotel=By.cssSelector(".fcab3ed991.a23c043802");

    By reserveButton = By.cssSelector(".js-reservation-button");

    By firstname=By.id("firstname");
    By lastname=By.id("lastname");

    By email=By.id("email");
    By email_confirm=By.id("email_confirm");

    By nextButton=By.cssSelector(".bui-button__text.js-button__text");


    public Booking(WebDriver driver) {
        super(driver);
    }

    public void Bukiraj()
    {
        typeIn(gde_idete,"Zlatibor");
        getElement(data_picker).click();
        clickOnElement(datum1);
        clickOnElement(datum2);
        clickOnElement(searchButton);
    }

    public void odaberiDorucakIhotel()
    {
       // getElement(dorucak).click();
        clickOnElement(dorucak);
        clickOnElement(hotel);
    }

    public void clickSelect()
    {
        List<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        scrollToMyElement(klasaSkrol);
        Select sel =new Select(driver.findElement(By.cssSelector(".hprt-nos-select.js-hprt-nos-select")));
         sel.selectByIndex(1);

        clickOnElement(reserveButton);

    }

    public void unesiPodatke()
    {
        typeIn(firstname, "Test");
        typeIn(lastname,"Tester");
        String mejl=randomMejl();
        typeIn(email, mejl);
        typeIn(email_confirm,mejl);
        clickOnElement(nextButton);

    }


}
