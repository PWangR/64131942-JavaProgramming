package dp.wang;
import java.util.Scanner;


public class bai_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KiemTraSNT();

	}
	
	public static boolean LaSNT(int n)
	{
		for(int i=2; i <= Math.sqrt(n-1); i++)
		{
			if(n % i == 0)
			{
				return false;
			}	
		}
		return true;
	}
	
	
	public static void KiemTraSNT()
	{
		Scanner nhap = new Scanner(System.in);
		int n;
		do 
		{
			System.out.print("Nhập vào một số nguyên: ");
			while (!nhap.hasNextInt()) 
			{ // Kiểm tra nếu không phải số
                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ!");
                System.out.print("Nhập lại: ");
                nhap.next(); // Xóa dữ liệu nhập sai
			}
			n = nhap.nextInt();
		}while(n < 2);
		
		if(LaSNT(n))
		{
			System.out.printf("%d Là số nguyên tố!", n);
		}
		else
		{
			System.out.printf("%d Không là số nguyên tố!", n);
		}
		
		nhap.close();
	}

}
