package dp.wang;
import java.util.Scanner;

public class TinhTong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In ra tên chương trình
		System.out.println("Chương trình tính tổng 2 số");
		//Tạo đối tượng nhập
		Scanner nhap = new Scanner(System.in);
		//Nhắc người dùng nhập 2 số
		System.out.println("Nhập vào 2 số");
		//Nhap A
		double a= nhap.nextDouble();
		//Nhap B
		double b= nhap.nextDouble();
		double tong = a + b;
		System.out.print("Tổng là : ");
		System.out.println(tong);
		
	}

}
