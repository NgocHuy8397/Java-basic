package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien>danhSach;

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}
	
	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}
	
	//1.thêm sinh viên vào dssv
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}
	//2.in danh sach sinh vien 
	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien: danhSach) {
			System.out.println(sinhVien);
		}
	}
	//3.Kiểm tra danh sách sinh viên có rỗng hay không
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
	}
	//4.Lấy ra số lượng sinh viên trong danh sách
	public int soLuongSinhVien() {
		return this.danhSach.size();
	}
	//5.làm rỗng danh sánh
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}
//	6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}
	//7.Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên
	public boolean xoaSinhVienRaKhoiDanhSach(SinhVien sv) {
		return this.danhSach.remove(sv);
	}
//	8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
	public void timSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if(sinhVien.getHoVaTen().indexOf(ten)>=0) {
				System.out.println(sinhVien);
			}
		}
	}
//	9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
	public void sapXepSinhVienGiamDanTheoDiem() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if(sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()) {
					return 1;
				}else if(sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()){
					return -1;
				} else {
					return 0;
				}
			}
			
		});
	}
//	10.Ghi xuống file
	public void ghiDuLieuXuongFile(File file) {
		try {
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			for(SinhVien sinhvien : danhSach) {
				oos.writeObject(sinhvien);
			}
			SinhVien sv = new SinhVien("123", "Nguyen Ngoc Huy", 2000, 7.0f);
			oos.writeObject(sv);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void docDuLieuTuFile(File f) {
		try {
//			File file = new File("/home/admin/Downloads/Java-basic/How_to_save_objects_to_File/file.data");
			InputStream is = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(is);
			
			SinhVien sv = null;
			while(true) {
				Object oj = ois.readObject();
				if(oj != null) {
					sv = (SinhVien) oj;
					this.danhSach.add(sv);
				}
				
				if(oj == null) {
					break;
				}
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	


}
