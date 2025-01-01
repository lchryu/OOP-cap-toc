import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HeThongOUBus app = new HeThongOUBus();

        // them sinh vien
        SinhVien sv1 = new SinhVien("SV001", "sv24 Hoang Ha", LocalDate.of(2024, 1, 1));
        SinhVien sv2 = new SinhVien("SV002", "svNow Hoang Long", LocalDate.now());
        SinhVien sv3 = new SinhVien("SV003", "sv2023 Ngoc Linh", LocalDate.of(2023, 1, 1));

        app.themSinhVien(sv1);
        app.themSinhVien(sv2);
        app.themSinhVien(sv3);
        app.themSinhVien(new SinhVien("SV004", "sv2023 Ngoc Linh", LocalDate.now()));

        // them ve
        Ve ve1 = new Ve("001", sv1, LocalDate.now(), "NAM", "Noi thanh", Arrays.asList("Tuyen 1", "Tuyen 2"));
        Ve ve2 = new Ve("002", sv2, LocalDate.of(2024, 1, 1), "THANG", "Noi thanh", Arrays.asList("Tuyen 1"));
        Ve ve3 = new Ve("003", sv3, LocalDate.of(2023, 1, 1), "NAM" ,"Noi thanh", Arrays.asList("Tuyen 3"));
        app.themVe(ve1);
        app.themVe(ve2);
        app.themVe(ve3);

        System.out.println("1.kiem tra ve con hieu luc hay khong");
        app.kiemTraVe("SV001");
        app.kiemTraVe("SV003");

        System.out.println();
        System.out.println();
        System.out.println("2. Ds sinh vie  theo nam da them");
        app.hienThiDsNam1_2();

        System.out.println();
        System.out.println();
        System.out.println("3. thong ke ve");
        app.thongKeVe("SV001");

        System.out.println();
        System.out.println();
        System.out.println("4. dssv mua ve 2024");
        app.timSinhVienNam2024();


        System.out.println();
        System.out.println();
        app.sapXepTheoNamNhapHoc();
    }
}