import java.util.ArrayList;
import java.util.Comparator;
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
        System.out.println("Nhap thong tin phong");
        Phong phong = ClassTao.taoPhong();
        System.out.println("Nhap thong tin khach hang");
        KhachHang khachHang = ClassTao.taoKhachHang();
        phong.setKhachHang(khachHang);
        danhSachPhong.add(phong);
        VietRaFile.writePhongToFile(danhSachPhong);
    }

    public static void hienThiDSP() {
        if(danhSachPhong.size() == 0){
            return;
        }
        for (Phong phong :
                danhSachPhong) {
            System.out.println(phong.toString());
        }
    }

    public static void khachTraPhong() {
        System.out.println("Nhập tên khách trả: ");
        String ten = scanner.nextLine();
        if (danhSachPhong == null){
            System.out.println("Khong tim thay phong");
            return;
        }
        for(Phong phong : danhSachPhong)
            if (ten.equals(phong.getKhachHang().getTenKhachHang())) {
                System.out.println("Trả phòng");
                int soTien = Integer.parseInt(phong.getThoiHanThue()) * Phong.gia;
                System.out.println("Số tiền trả: " + soTien);
                danhSachPhong.remove(phong);
                VietRaFile.writePhongToFile(danhSachPhong);
                return;
            }
        System.out.println("Khong tim thay phong");
        }

    public static void sapXepPhongTheoTen() {
        danhSachPhong.sort(Comparator.comparing(Phong::getTenPhong));
    }

    public static void timKhachTheoTen() {
        System.out.println("Nhập tên bạn cần tìm: ");
        String tenNhapVao = scanner.nextLine();
        for (int i = 0; i < danhSachPhong.size(); i++) {
            if (tenNhapVao.equals(danhSachPhong.get(i).getKhachHang().getTenKhachHang())) {
                System.out.println("tìm thấy:   " +  danhSachPhong.get(i).getKhachHang().toString());
                return;
            }
        }
        System.out.println("Khong tim thay");
    }


    public static void  suaThongTin() {
        System.out.println("Nhập phòng bạn muốn sửa: ");
        int soPhong = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < danhSachPhong.size(); i++) {
            if (soPhong == danhSachPhong.get(i).getId()) {
                int indexRemove = danhSachPhong.indexOf(danhSachPhong.get(i));
                danhSachPhong.remove(indexRemove);
                choThuePhong();
                return;
            }
        }
        System.out.println("Khong tim thay phong");
    }
    public static void layDanhSachPhongTuFile(){
        danhSachPhong = VietRaFile.readFileToListPhong();
    }
}


