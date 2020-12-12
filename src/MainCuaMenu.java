import java.util.Date;
import java.util.Scanner;

public class MainCuaMenu {
    static Date date = new Date();
    static Scanner scanner = new Scanner(System.in);

    public static void menuChinh() {
        QuanLyPhong.layDanhSachPhongTuFile();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Hà Nội: " + date);
        System.out.println("Chào mừng bạn đến với chức năng quản lý quán trọ của chúng tôi");
        System.out.println("1.Khách đặt phòng: ");
        System.out.println("2.Khách trả phòng: ");
        System.out.println("3.Sửa thông tin phòng: ");
        System.out.println("4.Sắp xếp khách hàng theo phòng: ");
        System.out.println("5.Tìm kiếm khách hàng theo tên: ");
        System.out.println("6.Thoát: ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Chọn chức năng: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                QuanLyPhong.hienThiDSP();
                QuanLyPhong.choThuePhong();
                QuanLyPhong.hienThiDSP();
                menuChinh();
                break;
            case 2:
                QuanLyPhong.khachTraPhong();
                menuChinh();
                break;
            case 3:
                QuanLyPhong.suaThongTin();
                menuChinh();
                break;
            case 4:
                QuanLyPhong.sapXepPhongTheoTen();
                QuanLyPhong.hienThiDSP();
                menuChinh();
                break;
            case 5:
                QuanLyPhong.timKhachTheoTen();
                break;
            case 6:
                System.out.println("Cảm ơn bạn đẫ sử dụng ứng dụng của chúng tôi <3");
                System.exit(0);
                break;
            default:
                System.out.println("Vui lòng nhập lại chức năng: ");
                menuChinh();
                scanner.nextLine();
        }
    }
}