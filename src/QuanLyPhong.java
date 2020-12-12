import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyPhong {
    static Scanner scanner = new Scanner(System.in);
    static List<Phong> danhSachPhong = new ArrayList<>();

    public static List<Phong> getDanhSachPhong() {
        return danhSachPhong;
    }

    public static void setDanhSachPhong(List<Phong> danhSachPhong) {
        QuanLyPhong.danhSachPhong = danhSachPhong;
    }

    public static void choThuePhong() {
        danhSachPhong.add(ClassTao.taoPhong());
        System.out.println("Nhập số người thuê: ");
        int soNguoi = Integer.parseInt(scanner.nextLine());
        if (soNguoi < 3 && soNguoi > 0) {
            for (int i = 0; i < soNguoi; i++) {
                danhSachPhong.add(ClassTao.taoKhachHang());
            }
        } else {
            System.out.println("Chỉ cho thuê phòng 2 người thôi!");
            choThuePhong();
        }
    }

    public static void hienThiDSP() {
        for (Phong phong :
                danhSachPhong) {
            System.out.println(phong.toString());
        }
    }

    public static void khachTraPhong() {
        System.out.println("Nhập tên khách trả: ");
        String id = scanner.nextLine();
        int check = 0;
        for (int i = 0; i < danhSachPhong.size(); i++) {
            if (id.equals(danhSachPhong.get(i).getTenKhachHang())) {
                System.out.println("Trả phòng");
                int soTien = Integer.parseInt(danhSachPhong.get(i).getThoiHanThue()) * Phong.gia;
                System.out.println("Số tiền trả: " + soTien);
                check ++;
            }
        }
        if (check == 0){
            System.out.println("Không tìm thấy tên");
        }

    }

    public static void sapXepPhongTheoTen() {


    }

    public static void timKhachTheoTen() {
        System.out.println("Nhập tên bạn cần tìm: ");
        String tenNhapVao = scanner.nextLine();
        int index = 0;
        for (int i = 0; i < danhSachPhong.size(); i++) {
            if (tenNhapVao.equals(danhSachPhong.get(i).getTenKhachHang())) {
                index ++;
                System.out.println("tìm thấy:   " +  danhSachPhong.get(i).toString());
            }
        }if (index == 0){
            System.out.println("Không tìm thấy");
            timKhachTheoTen();
        }
    }


    public static void  suaThongTin() {
        System.out.println("Nhập phòng bạn muốn sửa: ");
        int soPhong = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < danhSachPhong.size(); i++) {
            if (soPhong == danhSachPhong.get(i).getId()) {
                NhapTuBanPhim.nhapTenNguoi();
                NhapTuBanPhim.nhapGioiTinh();
                NhapTuBanPhim.nhapTuoi();
                NhapTuBanPhim.nhapCMND();

            } else {
                System.out.println("Không tìm thấy phòng này");
                suaThongTin();
            }
        }
    }
}


