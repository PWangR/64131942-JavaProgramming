package dp.wang;
import java.util.Scanner;

public class ChuViDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập vào 2 cạnh của hình chữ nhật: ");
		double a = nhap.nextDouble();
		double b = nhap.nextDouble();
		System.out.printf("Chu vi của hình chữ nhật là : %.0f \n", (a+b)*2);
		System.out.printf("Diện tích của hình chữ nhật là: %.0f \n", a*b);
		System.out.printf("Cạnh nhỏ của hình chữ nhật là: %.0f \n", Math.min(a, b));
	
		nhap.close();
	}

}
