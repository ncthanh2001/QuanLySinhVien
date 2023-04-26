package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.QuanLySinhVien;
import model.SinhVien;
import model.svTuNhien;
import model.svXaHoi;

public class view {
	public static void main(String[] args) {
		QuanLySinhVien listsv = new QuanLySinhVien();
		Scanner sc = new Scanner(System.in);
		listsv.addSinhVien(new svTuNhien("Thanh", "FPT", 22, 7, 8));
		listsv.addSinhVien(new svXaHoi("Lanh", "FPT", 18,7, 7));
		listsv.addSinhVien(new svTuNhien("Hello", "FPT", 22, 5, 3));
		listsv.addSinhVien(new svXaHoi("Hi", "FPT", 17,2, 3));
		listsv.addSinhVien(new svTuNhien("Ko", "FPT", 22, 5, 2));
		listsv.addSinhVien(new svXaHoi("Betl", "FPT", 15,8, 9));
		int choice=0;
		do {
			System.out.println("");
			System.out.println("---------------------------------");
			System.out.println("Chương trình quản lý sinh viên ");
			System.out.println("3. Xuất thông tin danh sách sinh viên ");
			System.out.println("4. Tìm sinh viên có tuổi trên n (với n là tuổi được nhập từ bàn phím)");
			System.out.println("5. tìm sinh viên theo chuyên ngành (với chuyên ngành được nhập từ bàn phím)");
			System.out.println("6. tìm sinh viên theo tên (với tên được nhập từ bàn phím) ");
			System.out.println("7. Tìm Sinh Viên Có DTB >= n (với n được nhập từ bàn phím) ");
			System.out.println("8. Thoát chương trình");
			System.out.println("Lưu Ý  : - Quốc tịch của sinh viên được mặc định là Việt Nam \n"
					+ "\t - DTB >= 5 thì xuất kết quả Đậu, ngược lại thì Rớt ");	
			System.out.print("Mời bạn chọn chức năng : ");
			 choice = sc.nextInt();sc.nextLine();
			switch (choice) {
			case 3 :
				listsv.output();
				break;
			case 4:
				System.out.print("Mời bạn nhập tuổi : ");
				int age = sc.nextInt();sc.nextLine();
				listsv.findSVByAge(age);
				break;
			case 5: 
				System.out.print("Mời bạn nhập chuyên ngành : ");
				String major = sc.nextLine();
				listsv.findSVByMajor(major);
				break;
			case 6 : 
				System.out.print("Mời bạn nhập tên : ");
				String name = sc.nextLine();
				listsv.findSVByName(name);
				break;
			case 7:
				System.out.print("Mời bạn nhập Điểm Trung Bình");
				Float dtb = sc.nextFloat();sc.nextLine();
				listsv.findSVByAVG(dtb);
				break;
			case 8 :
				System.out.println("Thoát thành công !!!!");
				break;
			default:System.out.println("Không có chức năng - Mời Bạn chọn lại");
			}
		} while (choice != 8);
	}
}
