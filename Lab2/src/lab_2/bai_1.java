package lab_2;
import java.util.Scanner;

public class bai_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiaiPTBac1();
	}

	public static void GiaiPTBac1() {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("Nhập vào a : ");
		double a = nhap.nextDouble();
		
		System.out.print("Nhập vào b : ");
		double b = nhap.nextDouble();
		
		if(a == 0)
		{
			if(b == 0)
			{
				System.out.println("Phương trình có vô số nghiệm");
			}
			else
			{
				System.out.println("Phương trình vô nghiệm");
			}
		}
		else
		{
			System.out.printf("Phương trình có nghiệm x = %.2f", -b/a );
		}
	}
	
	
}
