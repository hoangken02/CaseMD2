public class Phong {

    private String tenPhong;
    private int id;
    public static final int gia = 10000;
    private String ngayThue;
    private String thoiHanThue;

    public Phong() {
    }

    public Phong(String name, int id, String ngayThue, String thoiHanThue) {
        this.tenPhong = name;
        this.id = id;
        this.ngayThue = ngayThue;
        this.thoiHanThue = thoiHanThue;
    }

    public String getTenKhachHang() {
        return tenPhong;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenPhong = tenKhachHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGia() {
        return gia;
    }

    public String getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(String ngayThue) {
        this.ngayThue = ngayThue;
    }

    public String getThoiHanThue() {
        return thoiHanThue;
    }

    public void setThoiHanThue(String thoiHanThue) {
        this.thoiHanThue = thoiHanThue;
    }

    @Override
    public String toString() {
        return "Phong{" +
                "ten='" + tenPhong + '\'' +
                ", id=" + id +
                ", gia=" + gia +
                ", ngayThue='" + ngayThue + '\'' +
                ", thoiHanThue='" + thoiHanThue + '\'' +
                '}';
    }
}
