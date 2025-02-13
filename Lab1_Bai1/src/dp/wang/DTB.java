package dp.wang;
import java.util.Scanner;


public class DTB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập vào tên sinh viên (vd: Nguyen Van A): ");
		String tenSV = nhap.nextLine();
		System.out.print("Nhập vào điểm trung bình (vd: 9,8): ");
		double diemTB = nhap.nextDouble();
		
		nhap.nextLine(); // FIX LỖI: Đọc dòng trống sau nextFloat()
		
		System.out.println("Họ và tên: " + tenSV +"\nĐiểm trung bình: " + diemTB);

		nhap.close(); // Đóng Scanner để tránh rò rỉ tài nguyên
	}

}
