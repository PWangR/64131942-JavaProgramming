package dp.wang;
import java.util.Scanner;

public class PhuongTrinhB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập vào các hệ số a b c: ");
		double a = nhap.nextDouble();
		double b = nhap.nextDouble();
		double c = nhap.nextDouble();
		double Delta = Math.pow(b,2) - 4*a*c;
		System.out.printf("Delta : %.0f", Delta);
		
		if(Delta < 0)
		{
			System.out.println("\nPhương trình vô nghiệm (Delta < 0)");
		}
		else 
		{
			System.out.printf("\nCăn của Delta: %.0f", Math.sqrt(Delta));
		}
			
		
		nhap.close();
	}

}
