package uploadFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleMultiFilesUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		//Uploading single file
		/*driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]")).sendKeys("C:\\Users\\admin\\Desktop\\Automation_code.txt");
        if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().equals("Automation_code.txt"))
		{
        	System.out.println("The file is uploaded successfully");
		}
        else {
        	System.out.println("Upload failed");
        }
        */
        //Uploading multiple files
        String file1="C:\\Users\\admin\\Desktop\\Automation_code.txt";
        String file2="C:\\Users\\admin\\Desktop\\ref.txt";
        driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]")).sendKeys(file1+"\n"+file2);
        int noOfFilesUploaded = driver.findElements(By.xpath("//ul[@id=\"fileList\"]//li")).size();
        if(noOfFilesUploaded==2)
        {
        	System.out.println("All files are uploaded");
        }
        else
        {
        	System.out.println("Files are not uploaded or incorrect files");
        }
        //Validate file names
        if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().equals("Automation_code.txt")
        		&& driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().equals("ref.txt"))
        {
        	System.out.println("File names matching.");
        }
        else
        {
        	System.out.println("File names are not matching.");
        }
        		
        
	}

}
