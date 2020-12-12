import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;

public class NhapTuBanPhim {
    static Scanner scanner = new Scanner(System.in);
    public static String nhapTenPhong() {
        System.out.println("Nhập tên phòng: ");
        String ten = scanner.nextLine();
        return ten;
    }

    public static String nhapTenNguoi() {
        System.out.println("Nhập tên người: ");
        String ten = scanner.nextLine();
        return ten;
    }

    public static int nhapID() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public static String ngayThue() {
        System.out.println("Ngày thuê: ");
        String ngayThue = scanner.nextLine();
        return ngayThue;
    }

    public static String hanThue() {
        System.out.println("Thời hạn thuê: ");
        String hanThue = scanner.nextLine();
        return hanThue;
    }
    public static String nhapGioiTinh(){
        System.out.println("Nhập giới tính: ");
        String gioiTinh = scanner.nextLine();
        return gioiTinh;
    }

    public static int nhapTuoi(){
        System.out.println("Nhập tuổi");
        int tuoi = Integer.parseInt(scanner.nextLine());
        return tuoi;
    }

    public static int nhapCMND(){
        System.out.println("Nhập CMND");
        int cMND = Integer.parseInt(scanner.nextLine());
        return cMND;
    }
}
