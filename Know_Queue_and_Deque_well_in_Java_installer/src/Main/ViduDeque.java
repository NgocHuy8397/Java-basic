package Main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ViduDeque {
	public static void main(String[] args) {
		Deque<String> danhSachSV = new ArrayDeque<String>();
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("Nguyen Van B");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("TITV 2");
		danhSachSV.offerLast("TITV 4");
		danhSachSV.offerFirst("TITV 0");
		
		while(true) {
			String ten = danhSachSV.poll();
			if(ten == null) {
				break;
			}
			System.out.println(ten);
		}
		
	}
}
