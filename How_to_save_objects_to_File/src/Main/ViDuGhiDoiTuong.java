package Main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuong {
	public static void main(String[] args) {
		try {
			File file = new File("/home/admin/Downloads/Java-basic/How_to_save_objects_to_File/file.data");
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			SinhVien sv = new SinhVien("123", "Nguyen Ngoc Huy", 2000, 7.0f);
			oos.writeObject(sv);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
