package Main;

import java.io.File;
import java.util.Scanner;

public class ViduFile {
	File file;
	
	public ViduFile(String tenFile) {
		this.file = new File(tenFile);
	}

	public boolean kiemTraThucThi() {
		return this.file.canExecute();
	}
	
	public boolean kiemTraDoc() {
		return this.file.canRead();
	}
	
	public boolean kiemTraViet() {
		return this.file.canWrite();
	}
	
	public void inDuongDan() {
		System.out.println(this.file.getAbsolutePath());
	}
	
	public void inTenFile() {
		System.out.println(this.file.getName());
	}
	
	public void kiemTraLaThuMucHoacTapTin() {
		if(this.file.isDirectory()) {
			System.out.println("Đây là thư mục"); 
		} else if(this.file.isFile()) {
			System.out.println("Đây là tập tin");
		}
	}
	
	public void inDanhSachFileCon() {
		if(this.file.isDirectory()) {
			System.out.println("Các tập tin con/ thư mục con là: ");
			File[] mangCon = this.file.listFiles();
			for(File file : mangCon) {
				System.out.println(file.getAbsolutePath());
			}
		} else if(this.file.isFile()) {
			System.out.println("Đây là tập tin, không có dữ liệu con bên trong.");
		}
	}
	
	public void inCayThuMuc() {
		this.inChiTietCayThuMuc(this.file, 1);
	}
	
	public void inChiTietCayThuMuc(File f, int bac) {
//		System.out.print("|");
		for (int i = 0; i < bac; i++) {
			System.out.print("\t");
		}
		System.out.print("|__");
		System.out.println(f.getName());
		if (f.canRead()&&f.isDirectory()) {
			File[] mangCon = f.listFiles();
			for (File fx : mangCon) {
				inChiTietCayThuMuc(fx, bac + 1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên file: ");
		String tenFile = sc.nextLine();
		ViduFile vdf = new ViduFile(tenFile);
		int luaChon = 0;
		do {
			System.out.println("-----------------------------");
			System.out.println("Menu:D");
			System.out.println("1.Kiểm tra file có thể thực thi: ");
			System.out.println("2.Kiểm tra file có thể đọc: ");
			System.out.println("3.Kiểm tra file có thể ghi: ");
			System.out.println("4.In đường dẫn: ");
			System.out.println("5.In tên file: ");
			System.out.println("6.Kiểm tra file là thư mục hoặc tập tin: ");
			System.out.println("7.In ra danh sách các file con: ");
			System.out.println("8. In ra cây thư mục");
			System.out.println("0.Thoát chương trình");
			luaChon = sc.nextInt();
			sc.nextLine();
			switch (luaChon) {
			case 1:
				System.out.println(vdf.kiemTraThucThi());
				break;
			case 2:
				System.out.println(vdf.kiemTraDoc());
				break;
			case 3:
				System.out.println(vdf.kiemTraViet());
				break;
			case 4:
				vdf.inDuongDan();
				break;
			case 5:
				vdf.inTenFile();
				break;
			case 6:
				vdf.kiemTraLaThuMucHoacTapTin();
				break;
			case 7:
				vdf.inDanhSachFileCon();
				break;
			case 8:
				vdf.inCayThuMuc();
				break;
			default:
				break;
			}
		} while (luaChon != 0);
	}
}
