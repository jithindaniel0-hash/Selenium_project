package kerala_test_pkg;

import org.testng.annotations.Test;

import kerala_base_pkg.Kerala_base;

public class Klogin_test extends Kerala_base
{
	@Test(priority = 1)
	public void loginTestMtd()
	{
		kloginobj.loginMtd("userdemo6510@gmail.com", "N79eX8urW@tDEy9");
	}
	

}
