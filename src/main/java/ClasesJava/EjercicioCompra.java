package ClasesJava;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EjercicioCompra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		//Creamos un arreglo para elegir dinamicamente los productos
		String[] item = {"Sauce Labs Backpack","Sauce Labs Bike Light"};
		
		//Guardamos en una lista los productos existentes
		List<WebElement> productList = driver.findElements(By.cssSelector("div.inventory_item_name "));
		int j =0;
		//Ejecutamos un for para buscar los item
		for(int i=0; i<productList.size();i++) 
		{
		
			String name =  productList.get(i).getText();
			
			//Convertimos el arreglo en una lista
			List itemList = Arrays.asList(item);
			
			if(itemList.contains(name))
			{
				j++;
				driver.findElements(By.cssSelector(".btn_inventory")).get(i).click();
				
			if(j==itemList.size()) 
			{
				break;
				
			}	
			}		
				
		}
		
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Andreina");
		driver.findElement(By.id("last-name")).sendKeys("Jota");
		driver.findElement(By.id("postal-code")).sendKeys("0000");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		Assert.assertEquals(driver.findElement(By.className("complete-header")).getText(), "Thank you for your order!");

	}

}
