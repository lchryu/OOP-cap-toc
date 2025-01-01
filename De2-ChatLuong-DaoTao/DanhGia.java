import java.time.LocalDate;

public class DanhGia {
    protected static int cnt = 1;
    protected String maDanhGia;
    protected SinhVien sinhVien;
    protected LocalDate ngayDanhGia;
    protected String hocKy;
    protected String nameHoc;
    protected String nhanXet;

    public DanhGia() {
    }

    public DanhGia(SinhVien sinhVien, String hocKy, String nameHoc, String nhanXet) {
        this.maDanhGia = "DG" + cnt;
        cnt++;
        this.sinhVien = sinhVien;
        this.ngayDanhGia = LocalDate.now();
        this.hocKy = hocKy;
        this.nameHoc = nameHoc;
        this.nhanXet = nhanXet;
    }

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        DanhGia.cnt = cnt;
    }

    public String getMaDanhGia() {
        return maDanhGia;
    }

    public void setMaDanhGia(String maDanhGia) {
        this.maDanhGia = maDanhGia;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public LocalDate getNgayDanhGia() {
        return ngayDanhGia;
    }

    public void setNgayDanhGia(LocalDate ngayDanhGia) {
        this.ngayDanhGia = ngayDanhGia;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public String getNameHoc() {
        return nameHoc;
    }

    public void setNameHoc(String nameHoc) {
        this.nameHoc = nameHoc;
    }

    public String getNhanXet() {
        return nhanXet;
    }

    public void setNhanXet(String nhanXet) {
        this.nhanXet = nhanXet;
    }

    @Override
    public String toString() {
        return "DanhGia{" +
                "maDanhGia='" + maDanhGia + '\'' +
                ", sinhVien=" + sinhVien +
                ", ngayDanhGia=" + ngayDanhGia +
                ", hocKy='" + hocKy + '\'' +
                ", nameHoc='" + nameHoc + '\'' +
                ", nhanXet='" + nhanXet + '\'' +
                '}';
    }
}
