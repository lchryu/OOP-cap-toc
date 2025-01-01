import java.time.LocalDate;

public class DanhGiaGV extends DanhGia {
    private GiangVien giangVien;
    private double diem;

    public DanhGiaGV(SinhVien sinhVien, GiangVien giangVien, String hocKy, String nameHoc, String nhanXet,  double diem) {
        super(sinhVien, hocKy, nameHoc, nhanXet);
        this.giangVien = giangVien;
        this.diem = diem;
    }

    public GiangVien getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(GiangVien giangVien) {
        this.giangVien = giangVien;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}
