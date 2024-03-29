package script;

import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Lib;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class VerifyProductVersion extends BaseTest{
	@Test(priority=3,groups={"product"})
	public void testProductVersion(){
		String sheet="VerifyProductVersion";
		String un=Lib.getCellValue(XL_PATH,sheet,1,0);
		String pw=Lib.getCellValue(XL_PATH,sheet,1,1);
		String version=Lib.getCellValue(XL_PATH,sheet,1,2);
//		Enter valid user name
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
//		Enter valid password
		l.setPassword(pw);
//		click on login
		l.clickLogin();
//		click Help
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.clickHelp();
//		Click on About ActiTIME
		e.clickAboutActiTIME();
//		verify Product version
		e.verifyProductVersion(version);
//		Click close button on the popup
		e.clickCloseButton();
//		click logout
		e.clickLogout();
	}
}





