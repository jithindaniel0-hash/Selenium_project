package kerala_test_pkg;

import org.testng.annotations.Test;

import kerala_base_pkg.Kerala_base;

public class Khome_test extends Kerala_base 
{
	@Test(priority = 1)
	public void addpropTestMtd()
	{
		
		khomeobj.addpropMtd();
	}
	
	@Test(priority = 2)
	public void propertyListPrecenseTestMtd()
	{
		
		khomeobj.propertyListPresenceMtd();
	}
	
	@Test(priority = 3)
	public void propertyInfoTestMtd() throws Exception
	{
		
		khomeobj.propertyInfoMtd();
	}
	
	@Test(priority = 4)
	public void propertySummaryTestMtd()
	{
		
		khomeobj.propertySummaryMtd();
	}
	
	@Test(priority = 5)
	public void summaryTestMtd() throws Exception
	{
		
		khomeobj.summaryMtd();
	}
}
