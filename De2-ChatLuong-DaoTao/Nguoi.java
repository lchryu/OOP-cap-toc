import java.time.LocalDate;

public class Nguoi {
    protected String hoTen;
    protected boolean gioiTinh; // true: nam, false: nu
    protected LocalDate ngaySinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, boolean gioiTinh, LocalDate ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
