import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Pattern pattern = Pattern.compile("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
        Matcher matcher;
        String ngayThue;
        do {
            System.out.println("Ngày thuê: ");
            ngayThue = scanner.nextLine();
            matcher = pattern.matcher(ngayThue);
        } while (!matcher.matches());
        return ngayThue;
    }

    public static String hanThue() {
        Pattern pattern = Pattern.compile("[0-9]{1,}");
        Matcher matcher;
        String hanThue;
        do {
            System.out.println("Thời hạn thuê: ");
            hanThue = scanner.nextLine();
            matcher = pattern.matcher(hanThue);
        } while (!matcher.matches());
        return hanThue;
    }

    public static String nhapGioiTinh() {
        Pattern pattern = Pattern.compile("[nN]{1}[aA]{1}[mM]{1}|[nN]{1}[uU]{1}");
        Matcher matcher;
        String gioiTinh;
        do {
            System.out.println("Nhập giới tính: ");
            gioiTinh = scanner.nextLine();
            matcher = pattern.matcher(gioiTinh);
        } while (!matcher.matches());
        return gioiTinh;
    }

    public static int nhapTuoi() {
        Pattern pattern = Pattern.compile("[1-9]{1}[0-9]{0,1}");
        Matcher matcher;
        String tuoiString;
        do {
            System.out.println("Nhập tuổi");
            tuoiString = (scanner.nextLine());
            matcher = pattern.matcher(tuoiString);
        } while (!matcher.matches());
        int tuoi = Integer.parseInt(tuoiString);
        return tuoi;
    }

    public static int nhapCMND() {
        Pattern pattern = Pattern.compile("[1-9]{1}[0-9]{8}");
        Matcher matcher;
        String cMNDStirng;
        do {
            System.out.println("Nhập CMND");
            cMNDStirng = scanner.nextLine();
            matcher = pattern.matcher(cMNDStirng);
        }while (!matcher.matches());
        int cMND = Integer.parseInt(cMNDStirng);
        return cMND;
    }
}
