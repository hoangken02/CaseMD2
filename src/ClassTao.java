import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassTao {
    static Scanner scanner = new Scanner(System.in);
    static List<Phong> danhSachPhong = new ArrayList<>();

    public static List<Phong> getDanhSachPhong() {
        return danhSachPhong;
    }

    public static void setDanhSachPhong(List<Phong> danhSachPhong) {
        QuanLyPhong.danhSachPhong = danhSachPhong;
    }

    public static KhachHang taoKhachHang() {
        KhachHang khachHang = new KhachHang(NhapTuBanPhim.nhapTenNguoi(), NhapTuBanPhim.nhapGioiTinh(), NhapTuBanPhim.nhapTuoi(), NhapTuBanPhim.nhapCMND());
        return khachHang;
    }

    public static Phong taoPhong() {
        if (danhSachPhong.size() < 2) {
            Phong phong = new Phong(NhapTuBanPhim.nhapTenPhong(), NhapTuBanPhim.nhapID(), NhapTuBanPhim.ngayThue(), NhapTuBanPhim.hanThue());
            danhSachPhong.add(phong);
            return phong;
        } else {
            System.out.println("Đã hết phòng");
            return null;
        }
    }
}
