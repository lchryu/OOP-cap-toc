import java.time.LocalDate;
import java.util.List;

public class Ve {
    private String maVe; // 3 chu so
    private SinhVien sinhVien;
    private LocalDate ngayMua;

    // xxx he thong tu tinh
    private LocalDate ngayHetHan;
    private String loaive; // NAM - THANG
    private String diemXuatPhat;

    // co rule
    private double giaVe;
    private List<String>tuyenXe;


    public Ve(String maVe, SinhVien sinhVien, LocalDate ngayMua, String loaive, String diemXuatPhat, List<String> tuyenXe) {
        this.maVe = maVe;
        this.sinhVien = sinhVien;
        this.ngayMua = ngayMua;
        this.loaive = loaive;
        this.diemXuatPhat = diemXuatPhat;
        this.tuyenXe = tuyenXe;
        tinhGiaVe();
        tinhNgayHetHan();
    }
    private void tinhGiaVe() {
        LocalDate today = LocalDate.now();
        int thang = today.getMonthValue();

        if (this.loaive.equalsIgnoreCase("NAM")) {
            this.giaVe = thang <= 6 ? 4500 : 3000;
        } else if (this.loaive.equalsIgnoreCase("THANG")) {
            int ngay = today.getDayOfMonth();
            giaVe = ngay <= 15 ? 450 : 300;
        }
    }
    private void tinhNgayHetHan() {
        if (loaive.equalsIgnoreCase("NAM"))
            ngayHetHan = ngayMua.plusYears(1);
        else if (loaive.equalsIgnoreCase("THANG"))
            ngayHetHan = ngayMua.plusMonths(1);
    }

    // viet trong main cx dc <option>
    public boolean conHieuLuc() {
        return LocalDate.now().isBefore(ngayHetHan) || LocalDate.now().isEqual(ngayHetHan);
    }

    public String getMaVe() {
        return maVe;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public LocalDate getNgayMua() {
        return ngayMua;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public String getLoaive() {
        return loaive;
    }

    public String getDiemXuatPhat() {
        return diemXuatPhat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public List<String> getTuyenXe() {
        return tuyenXe;
    }
}
