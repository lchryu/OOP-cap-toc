import java.time.LocalDateTime;

enum TrangThaiRobot {
    PENDING("gray"),    // Robot đang chờ, có thể nhận nhiệm vụ mới
    ACTIVE("green"),    // Robot đang hoạt động
    CHARGING("gold");   // Robot đang sạc pin

    private final String mauSac; // Thuộc tính lưu màu của trạng thái

    // Constructor của enum
    TrangThaiRobot(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getMauSac() {
        return mauSac;
    }
}
/*
BOT123 ... BOT124
ten
ngay sx
trang thai
*/
public class main {
    public static void main(String[] args) {
        HeThongQuanLyRobot hethong = new HeThongQuanLyRobot();

        // tao robot & them (1)
        Robot robot1 = new Robot("BOT001", "Robot A", LocalDateTime.now().minusMonths(6));
        Robot robot2 = new Robot("BOT002", "Robot B", LocalDateTime.now().minusYears(5));
        hethong.addRobot(robot1);
        hethong.addRobot(robot2);


        // 2 robot 2 nam gan day
        hethong.hienThiRobotMoi();


        // giao nv cho robot
//        hethong.giaoNhiemVu(new NhiemVu("nv1", 5));

        hethong.giaoNhiemVu("BOT001" ,new NhiemVu("nv1", 5));
        hethong.giaoNhiemVu("BOT001" ,new NhiemVu("nv2", 3));

        System.out.println("3 danh sasch robot dang hoat dong");
        hethong.dsRobotDangHoatDong();

        // 5. them nhiem vu va kiem tra
        System.out.println();
        System.out.println("Nhiem vu cua 001");;
        hethong.hienThiNhiemVuRobot("BOT001");
    }
}
