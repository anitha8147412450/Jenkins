package pom;


	import java.io.FileInputStream;
	import java.io.FileOutputStream;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Reporter;

	public class Github_ps 
	{
		@FindBy(id="empty-setup-clone-url")
		private WebElement url;
		@FindBy(id="empty-setup-new-repo-echo")
		private WebElement code;
		public Github_ps(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		public void file(String s)
		{
		try
		{
		FileInputStream fis = new FileInputStream("./Excel/data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.createSheet("Sheet1").createRow(0).createCell(0);
		c.setCellValue(s);
		FileOutputStream fos=new FileOutputStream("./Excel/data.xlsx");
		wb.write(fos);
		
		}
		catch(Exception e)
		{
			System.out.println("handle");
		}
		}
		public void getu() throws InterruptedException
		{
			Thread.sleep(3000);
			String s = url.getAttribute("value");
			System.out.println(s);
			file(s);
		}
		public void getcode() throws InterruptedException
		{
			Thread.sleep(3000);
			String s1 = code.getText();
			System.out.println(s1);
		}
	}



