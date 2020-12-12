public class KhachHang {
    private String tenKhachHang;
    private String gioiTinh;
    private int tuoi;
    private int cMND;

    public KhachHang() {
    }

    public KhachHang(String name, String gender, int age, int cMND) {
        this.tenKhachHang = name;
        this.gioiTinh = gender;
        this.tuoi = age;
        this.cMND = cMND;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getcMND() {
        return cMND;
    }

    public void setcMND(int cMND) {
        this.cMND = cMND;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "ten='" + tenKhachHang + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", tuoi=" + tuoi +
                ", cMND=" + cMND +
                '}';
    }
    public String toFile(){
        return tenKhachHang + "," + gioiTinh + "," + tuoi + "," + cMND;
    }
}
