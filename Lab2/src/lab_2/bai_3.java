package lab_2;
import java.util.Scanner;


public class bai_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		double soDien;
		
		// Kiểm tra nếu nhập sai định dạng
		do 
		{
			System.out.print("Nhập vào số điện sử dụng:");
			while (!nhap.hasNextDouble()) 
			{ // Kiểm tra nếu không phải số
                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ!");
                System.out.print("Nhập lại: ");
                nhap.next(); // Xóa dữ liệu nhập sai
			}
			soDien = nhap.nextDouble();
		}while (soDien < 0);
		
		  
            
            if(soDien < 0)
    		{
    			System.out.println("Không thể nhập số điện bé hơn 0!!!");
    		}
    		else if(soDien <= 50)
    		{
    			System.out.printf("Số tiền phải trả là : %.0f", soDien*1000);
    		}
    		else
    		{
    			System.out.printf("Số tiền phải trả là : %.0f", 50*1000+(soDien - 50)*1200);
    		}
		
		
		nhap.close();

	}

}
