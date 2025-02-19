package lab_2;
import java.util.Scanner;

public class bai_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int chucNang;
		
		while(true)
		{
			System.out.print("\n-------------\n");
			System.out.print("1. Giải phương trình bậc nhất\n");
			System.out.print("2. Giải phương trình bậc 2\n");
			System.out.print("3. Tính tiền điện\n");
			System.out.print("4. Kết thúc\n");
			System.out.print("-------------\n");
			
			 // Kiểm tra nhập đúng số nguyên từ 1 đến 4
			do
			{
				System.out.print("Chọn chức năng: ");
				while (!nhap.hasNextDouble()) 
					{ // Kiểm tra nếu không phải số
		                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ!");
		                System.out.print("Nhập lại: ");
		                nhap.next(); // Xóa dữ liệu nhập sai
					}
					chucNang = nhap.nextInt();
					if(chucNang < 1 || chucNang > 4)
						System.out.println("Lỗi: Nhập một số nguyên từ 1 đến 4");
			}while(chucNang < 0 || chucNang > 4);
			
			// Xử lý lựa chọn
			switch(chucNang)
			{
				case 1:
					bai_1.GiaiPTBac1();
					break;
				case 2:
					bai_2.GiaiPTBac2();
					break;
				case 3:
					bai_3.TinhTienDien();
					break;
				case 4:
					 System.out.println("Chương trình kết thúc.");
	                    nhap.close();
	                    return;
			}
		}
	}
}
