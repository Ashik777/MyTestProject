package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider (name="LoginData")
	public String[][]getData() throws IOException
	{
		String path= ".//testdata//testdta.xlsx";
		ExcelUtility utlx= new ExcelUtility(path);
		int totalrow=utlx.getRowCount("Sheet1");
		int totalcol=utlx.getCellCount("Sheet1", 1);
		String logindata[][] = new String[totalrow][totalcol];
		for (int i=1;i<=totalrow;i++)
		{
			for (int j=0;j<totalcol;j++)
			{
				logindata[i-1][j]=utlx.getCellData("Sheet1", i, j);
			}
		}
		return logindata;
	}
}
