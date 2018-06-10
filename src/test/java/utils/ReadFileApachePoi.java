package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFileApachePoi {
	public static void readFile(String file) {
		try {
		  DataFormatter fmt = new DataFormatter(); //Dung de ep kieu
	      FileInputStream excelFile = new FileInputStream(new File(file));
	      Workbook workbook = new XSSFWorkbook(excelFile);
	      Sheet datatypeSheet = workbook.getSheetAt(0);
	      Iterator<Row> iterator = datatypeSheet.iterator();
	      Row firstRow = iterator.next();
	      Cell firstCell = firstRow.getCell(1);
	      System.out.println(firstCell.getStringCellValue());
	      while(iterator.hasNext()) {
	    	  Row row = iterator.next();
	    	  //System.out.println(fmt.formatCellValue(row.getCell(0)));
	    	  System.out.println(fmt.formatCellValue(row.getCell(1)));
	      }
	      workbook.close();
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
}
