import java.time.LocalDate;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private LocalDate ngayNhapHoc;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, LocalDate ngayNhapHoc) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngayNhapHoc = ngayNhapHoc;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgayNhapHoc() {
        return ngayNhapHoc;
    }

    public void setNgayNhapHoc(LocalDate ngayNhapHoc) {
        this.ngayNhapHoc = ngayNhapHoc;
    }
}
