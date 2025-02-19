package lab_2;

import java.util.Scanner;

public class bai_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiaiPTBac2();
		
	}
	
	public static void GiaiPTBac2() {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("Nhập vào a : ");
		double a = nhap.nextDouble();
		
		System.out.print("Nhập vào b : ");
		double b = nhap.nextDouble();
		
		System.out.print("Nhập vào c : ");
		double c = nhap.nextDouble();
		
		double Delta = Math.pow(b,2) - 4*a*c;
		
		if(Delta < 0)
		{
			System.out.println("Phương trình vô nghiệm (Delta < 0)");
		}
		else if(Delta == 0)
		{
			System.out.printf("Phương trình có nghiệm kép : %.2f", -b/(2*a));
		}
		else
		{
			System.out.printf("Phương trình có 2 nghiệm phân biệt: x1 = %.2f ; x2 = %.2f", ((-b+Math.sqrt(Delta))/(2*a)), ((-b-Math.sqrt(Delta))/(2*a)) );
		}
			
		
	}

}
