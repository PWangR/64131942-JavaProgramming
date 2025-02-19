package dp.wang;

import java.util.ArrayList;

public class ChuongTrinh {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//Tạo 2 sản phẩm 
//		SanPham sp1 = new SanPham();
//		SanPham sp2 = new SanPham(2, "Bánh Mì", "Đồ ăn sáng", "BanhMi.JPG");
//		
//		sp1.setMaSP(1);
//		sp1.setTenSP("Banh Bao");
//		sp1.setLoaiSP("Đồ ăn sáng");
//		sp1.setAnhSP("BanhBao.JPG");
//		
//		//in ra thông tin 2 sp
//		String thongtinSP1 = sp1.toString();
//		String thongtinSP2 = "Mã SP2 là : " + sp2.getMaSP();
//			   thongtinSP2 +=" Tên SP2 là: " +sp2.getTenSP();
//	    System.out.println(thongtinSP1);
//	    System.out.println(thongtinSP2);
		
		// Khai báo danh sách sản phẩm
		ArrayList<SanPham> dsSanPham;
		// Xin mới
		dsSanPham = new ArrayList<SanPham>();
		
		//Nhập 3 sản phẩm
		SanPham sp2 = new SanPham(0, "Cơm", "Đồ ăn", null);
		SanPham sp3 = new SanPham(0, "Bánh Mì", "Đồ ăn", null);
		
		// Thêm sản phẩm vào danh sách
		dsSanPham.add(new SanPham(0, "Kem", "Đồ ăn nhanh", null));
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
//		for(SanPham x: dsSanPham)
//			System.out.println(x);
		
		for (int i = 0; i <dsSanPham.size(); i++)
		{
			SanPham sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
	    
	}

}
