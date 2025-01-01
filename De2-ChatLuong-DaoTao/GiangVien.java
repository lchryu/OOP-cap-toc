import java.time.LocalDate;
import java.util.List;

public class GiangVien extends Nguoi{
    private String maGV;
    private List<Double>diemDanhGia;

    public GiangVien() {
    }

    public GiangVien(String hoTen, boolean gioiTinh, LocalDate ngaySinh, String maGV, List<Double> diemDanhGia) {
        super(hoTen, gioiTinh, ngaySinh);
        this.maGV = maGV;
        this.diemDanhGia = diemDanhGia;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public List<Double> getDiemDanhGia() {
        return diemDanhGia;
    }

    public void setDiemDanhGia(List<Double> diemDanhGia) {
        this.diemDanhGia = diemDanhGia;
    }

    public void themDiemDanhGia(double diem) { diemDanhGia.add(diem); }


    public double tinhDiemTrungBinh() {
        if (diemDanhGia.isEmpty()) return 0;
        double s = 0;
        for(double diem : diemDanhGia) {
            s += diem;
        }
        return s/diemDanhGia.size();
    }
}
