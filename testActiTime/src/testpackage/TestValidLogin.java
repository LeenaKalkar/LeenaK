package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.LoginPage;

public class TestValidLogin extends BaseTest {
  @Test
  public void login() throws EncryptedDocumentException, IOException {
	  
	  LoginPage lp=new LoginPage(driver);
	  Flib flib = new Flib();
	  String validUsername = flib.readPropertyData("PROP_PATH", "UN");
	  String validPassword = flib.readPropertyData("PROP_PATH", "PASS");
	  
	  lp.validLogin(validUsername,validPassword );
	  		
  }
}
