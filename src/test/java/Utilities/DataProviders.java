package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;



public class DataProviders {

	@DataProvider(name = "LoginData")
	public Object[][] getData() throws IOException {
	    String path = System.getProperty("user.dir") + "/TestData/ecommerce-playground.lambdatest.io.xlsx";
	    ExcelUtility xutility = new ExcelUtility(path);

	    int totalRows = xutility.getRowCount("Sheet1"); // Last row index
	    int totalCells = xutility.getCellCount("Sheet1", 1); // Assuming row 1 has full data

	    // If header is in row 0 and data in 1, 2, 3 — total data rows = totalRows (1 to totalRows)
	    Object[][] loginData = new Object[totalRows][totalCells];

	    for (int i = 1; i <= totalRows; i++) {
	        for (int j = 0; j < totalCells; j++) {
	            loginData[i - 1][j] = xutility.getCellData("Sheet1", i, j);
	        }
	    }
	    return loginData;
	}
}