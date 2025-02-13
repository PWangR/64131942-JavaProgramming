package dp.wang;
import java.util.Scanner;

public class TheTichLapPhuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập vào cạnh của khối lập phương: ");
		double canh = nhap.nextDouble();
		System.out.printf("Thể tích của khối lập phương là: %.0f", Math.pow(canh,3));

		nhap.close();
	}

}
