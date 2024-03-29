package Main;

import java.util.PriorityQueue;
import java.util.Queue;

public class ViduPriorityQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new PriorityQueue<String>();
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("Nguyen Van B");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("TITV 2");
		
		while(true) {
			String ten = danhSachSV.poll();
			if(ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
