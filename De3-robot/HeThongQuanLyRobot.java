import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class HeThongQuanLyRobot {
    private List<Robot>dsRobot;


    public HeThongQuanLyRobot() {
        dsRobot = new ArrayList<Robot>();
    }

    // 1 them robot vao ds
    public void addRobot(Robot robot) {
        dsRobot.add(robot);
    }

    // 2 hien thi ds robot san xuat trong 2 nam
    public void hienThiRobotMoi() {
        LocalDateTime haiNamTrc = LocalDateTime.now().minusYears(2);

        System.out.println("Danh sach robot sx trong 2 nam gan day");
        for (Robot robot : dsRobot) {
            System.out.println(robot);
        }
    }

    // 3. Xac dinh danh sach robot dang hoat dong
    public void dsRobotDangHoatDong() {
        System.out.println("DS robot dang active");
        for (Robot robot : dsRobot) {
            if (robot.getTrangThai() == TrangThaiRobot.ACTIVE) {
                System.out.println(robot);
            }
        }
    }

    // 4 giao nhiem vu
    public void giaoNhiemVu(String maRobot, NhiemVu nv) {
        for (Robot robot : dsRobot) {
            if (robot.getMaRobot().equals(maRobot)) {
                if (robot.getTrangThai() == TrangThaiRobot.PENDING) {
                    robot.themNhiemVu(nv);
                    System.out.println("Da giao nv cho robot " + maRobot);
                } else {
                    System.out.println("Robot " + maRobot + " dang o trang thai " + robot.getTrangThai() + " KHONG THE NHAN NV MOI!");
                }
            }
            return;
        }

        System.out.println("Khong tim thay robot " + maRobot);
    }
    // 5. in ra ds nv cua robot
    // sap xep theo do uu tien giam dan
    // neu uutien = nhau thi sap tang dan theo time tao nv
    public void hienThiNhiemVuRobot(String maRobot) {
        for (Robot robot : dsRobot) {
            if (robot.getMaRobot().equals(maRobot)) {
                List<NhiemVu>lstNV = robot.getDsNhiemVu();

                Collections.sort(lstNV, (o1, o2) -> {
                    if (o1.getDoUuTien() != o2.getDoUuTien()) {
//                        return o2.getDoUuTien() - o1.getDoUuTien();
                        return Double.compare(o2.getDoUuTien(), o1.getDoUuTien());
                    }
                    return o1.getThoiGianTao().compareTo(o2.getThoiGianTao());
                });

                for (NhiemVu nv : lstNV) {
                    System.out.println(nv);
                }
            }
            return;
        }
        System.out.println("Khong tim thay robot " + maRobot);

    }
}
