import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VietRaFile {
    static File file = null;
    static FileWriter fileWriter = null;
    static BufferedReader bufferedReader = null;
    static FileReader fileReader = null;

    public static void writePhongToFile(List<Phong> phongs) {
        file = new File("Phong.csv");
        try {
            file.createNewFile();
            fileWriter = new FileWriter(file);
            if(phongs == null){
                return;
            }
            for (Phong phong : phongs) {
                fileWriter.append(phong.stringToFile());
                fileWriter.append("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error input/output File");
        }
    }

    public static List<Phong> readFileToListPhong() {
        List<Phong> list = new ArrayList<>();
        file = new File("Phong.csv");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                String tenphong = split[0];
                int id = Integer.parseInt(split[1]);
                String ngaythue = split[2];
                String thoiHanthue = split[3];
                String tenKhachhang = split[4];
                String gioiTinh = split[5];
                int tuoi = Integer.parseInt(split[6]);
                int cmnd = Integer.parseInt(split[7]);
                KhachHang khachHang = new KhachHang(tenKhachhang, gioiTinh, tuoi, cmnd);
                Phong phong = new Phong(tenphong,id,ngaythue,thoiHanthue);
                phong.setKhachHang(khachHang);
                list.add(phong);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error input/output File");
        }
        return list;
    }

}