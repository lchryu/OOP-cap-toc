import java.time.LocalDate;

public class SinhVien extends Nguoi{
    private String maSV;
    private int soLuongDanhGia;

    public SinhVien() {
    }

    public SinhVien(String hoTen, boolean gioiTinh, LocalDate ngaySinh, String maSV, int soLuongDanhGia) {
        super(hoTen, gioiTinh, ngaySinh);
        this.maSV = maSV;
        this.soLuongDanhGia = soLuongDanhGia;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public int getSoLuongDanhGia() {
        return soLuongDanhGia;
    }

    public void setSoLuongDanhGia(int soLuongDanhGia) {
        this.soLuongDanhGia = soLuongDanhGia;
    }
    public void tangSoLuongDanhGia() {
        this.soLuongDanhGia++;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", soLuongDanhGia=" + soLuongDanhGia +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", ngaySinh=" + ngaySinh +
                '}';
    }
}
