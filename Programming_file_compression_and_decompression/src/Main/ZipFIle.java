package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFIle {
	  public static void main(String[] args) throws IOException {
	        String sourceFile = "/Users/mac/eclipse-workspace/Java_76/test.txt";
	        FileOutputStream fos = new FileOutputStream("/Users/mac/eclipse-workspace/Java_76/compressed.zip");
	        ZipOutputStream zipOut = new ZipOutputStream(fos);
	        
	        File fileToZip = new File(sourceFile);
	        FileInputStream fis = new FileInputStream(fileToZip);
	        
	        ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
	        zipOut.putNextEntry(zipEntry);
	        byte[] bytes = new byte[1024];
	        int length;
	        while((length = fis.read(bytes)) >= 0) {
	            zipOut.write(bytes, 0, length);
	        }
	        
	        zipOut.close();
	        fis.close();
	        fos.close();
	    }
}
