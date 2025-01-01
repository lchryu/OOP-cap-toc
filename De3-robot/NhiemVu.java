import java.time.LocalDate;
import java.time.LocalDateTime;

public class NhiemVu {
    private String TenNhiemVu;
    private double doUuTien;
    private LocalDateTime thoiGianTao;

    public NhiemVu(String tenNhiemVu, double doUuTien) {
        TenNhiemVu = tenNhiemVu;
        this.doUuTien = doUuTien;
        this.thoiGianTao = LocalDateTime.now();
    }

    public String getTenNhiemVu() {
        return TenNhiemVu;
    }

    public void setTenNhiemVu(String tenNhiemVu) {
        TenNhiemVu = tenNhiemVu;
    }

    public double getDoUuTien() {
        return doUuTien;
    }

    public void setDoUuTien(double doUuTien) {
        this.doUuTien = doUuTien;
    }

    public LocalDateTime getThoiGianTao() {
        return thoiGianTao;
    }

    public void setThoiGianTao(LocalDateTime thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
    }

    @Override
    public String toString() {
        return "NhiemVu{" +
                "TenNhiemVu='" + TenNhiemVu + '\'' +
                ", doUuTien=" + doUuTien +
                ", thoiGianTao=" + thoiGianTao +
                '}';
    }
}
