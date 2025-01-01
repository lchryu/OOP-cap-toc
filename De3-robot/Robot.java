import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Robot {
    private String maRobot; // BOT<number>
    private String tenRobot;
    private LocalDateTime ngaySanXuat;

    // macdinh la pending
    private TrangThaiRobot trangThai;
    // = new arrlst
    private List<NhiemVu>dsNhiemVu;
    // phai tinh toan
    private LocalDateTime thoiGianDuKien;

    public Robot(String maRobot, String tenRobot, LocalDateTime ngaySanXuat) {
        this.maRobot = maRobot;
        this.tenRobot = tenRobot;
        this.ngaySanXuat = ngaySanXuat;
        this.trangThai = TrangThaiRobot.PENDING;
        this.dsNhiemVu = new ArrayList<>();
    }

    public void themNhiemVu(NhiemVu nv) {
        if (trangThai == TrangThaiRobot.PENDING) {
            dsNhiemVu.add(nv);
            trangThai = TrangThaiRobot.ACTIVE;
            // gia su moi nv mat 1h
            thoiGianDuKien = LocalDateTime.now().plusHours(1);
        }
    }

    public String getMaRobot() {
        return maRobot;
    }

    public void setMaRobot(String maRobot) {
        this.maRobot = maRobot;
    }

    public String getTenRobot() {
        return tenRobot;
    }

    public void setTenRobot(String tenRobot) {
        this.tenRobot = tenRobot;
    }

    public LocalDateTime getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDateTime ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public TrangThaiRobot getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(TrangThaiRobot trangThai) {
        this.trangThai = trangThai;
    }

    public List<NhiemVu> getDsNhiemVu() {
        return dsNhiemVu;
    }

    public void setDsNhiemVu(List<NhiemVu> dsNhiemVu) {
        this.dsNhiemVu = dsNhiemVu;
    }

    public LocalDateTime getThoiGianDuKien() {
        return thoiGianDuKien;
    }

    public void setThoiGianDuKien(LocalDateTime thoiGianDuKien) {
        this.thoiGianDuKien = thoiGianDuKien;
    }

    @Override
    public String toString() {
        String tgdk = thoiGianDuKien != null ? thoiGianDuKien.toString() : "Chua nhan nhiem vu";

        return "Robot{" +
                "maRobot='" + maRobot + '\'' +
                ", tenRobot='" + tenRobot + '\'' +
                ", ngaySanXuat=" + ngaySanXuat +
                ", trangThai=" + trangThai +
                ", dsNhiemVu=" + dsNhiemVu +
                ", thoiGianDuKien=" + tgdk +
                '}';
    }
}
