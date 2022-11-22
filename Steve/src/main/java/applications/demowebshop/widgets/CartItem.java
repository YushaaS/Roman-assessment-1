package applications.demowebshop.widgets;

import org.openqa.selenium.By;

public class CartItem {
    public By productItem (String itemName){
        return By.xpath("//a[text() = '"+itemName+"']/ancestor::tr[@class='cart-item-row']");
    }

    public By productRadioBtn(String itemName){
        return By.xpath("//a[text() = '"+itemName+"']/ancestor::tr[@class='cart-item-row']//input[@type= 'checkbox']");

    }

}