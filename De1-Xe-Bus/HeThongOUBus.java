import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

public class HeThongOUBus {
    private List<SinhVien>danhSachSinhVien;
    private List<Ve>danhSachVe;
    private DateTimeFormatter formatter;


    public HeThongOUBus() {
        this.danhSachSinhVien = new ArrayList<>();
        this.danhSachVe = new ArrayList<>();
        // default dd/mm/yyy
        this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }


    void themVe(Ve ve) {
        this.danhSachVe.add(ve);
    }

    // 1. Kiem tra ma ve con hieu luc hay khong (theo msv)
    public void kiemTraVe(String maSV) {
        System.out.println("Danh sach ve cua sinh vien " + maSV + ": ");
        boolean timThay = false;
        for (Ve ve : danhSachVe) {
            if (ve.getSinhVien().getMaSV().equals(maSV)) {
                timThay = true;
                System.out.printf("Ma ve: %s | Ngay mua: %s | Ngay het han: %s | Loai ve: %s | Trang thai: %s",
                        ve.getMaVe(),
                        ve.getNgayMua().format(formatter),
                        ve.getNgayHetHan().format(formatter),
                        ve.getLoaive(),
                        ve.conHieuLuc() ? "Con hieu luc\n" : "Het han!\n");
            }
        }
        if (!timThay) System.out.println("Khong tim thay ve nao cua sinh vien nay!");
    }

    // 2.1 Them sinh vien & hien thi danh sach sinh vien nam1 & 2
    public void themSinhVien(SinhVien sinhVien) {
        danhSachSinhVien.add(sinhVien);

    }
    // 2.2 hien thi theo nam
    public void hienThiDsNam1_2() {
        LocalDate today = LocalDate.now();
        int namHienTai = today.getYear();

        System.out.println("Danh sach sinh vien nam 1:");
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.getNgayNhapHoc().getYear() == namHienTai) {
                System.out.println(sv.getMaSV() + " - " + sv.getHoTen());
            }
        }

        System.out.println("Danh sach sinh vien nam 2:");
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.getNgayNhapHoc().getYear() == namHienTai - 1) {
                System.out.println(sv.getMaSV() + " - " + sv.getHoTen());
            }
        }

    }
    // 3. Thong ke so ve cua sinh vien
    public void thongKeVe(String maSV) {
        int soVeThang = 0;
        int soVeNam = 0;

        for (Ve ve : danhSachVe) {
            if (ve.getSinhVien().getMaSV().equals(maSV)) {
                if (ve.getLoaive().equalsIgnoreCase("THANG")) soVeThang++;
                else soVeNam++;
            }
        }

        System.out.println("Sinh vien " + maSV + " da mua " + soVeThang + " ve thang & " + soVeNam + " so ve nam");
    }

    // 4. Dssv da mua ve trong nam 2024
    public void timSinhVienNam2024() {
        System.out.println("Danh sach ve nam 2024: ");
        Set<SinhVien>se = new HashSet<>();

        for (Ve ve : danhSachVe) {
            if (ve.getNgayMua().getYear() == 2024 && !se.contains(ve.getSinhVien())) {
                SinhVien sv = ve.getSinhVien();
                System.out.println(sv.getMaSV() + " - " + sv.getHoTen());

                // ghi thang sv do vao trong set
                se.add(sv);
            }
        }

        // cach 2 la duyet qua dsve va add het vao trong se
    }

    // 5 sap xep sinh vien theo nam nhap hoc
    public void sapXepTheoNamNhapHoc() {
        System.out.println("DSSV sap xep theo nam nhap hoc: ");


        // giam dan theo nam nhap hoc
        // neu cung nam thi sap tang
        Collections.sort(danhSachSinhVien, (o1, o2)-> {
            if (o1.getNgayNhapHoc().getYear() != o2.getNgayNhapHoc().getYear()) {
                return o2.getNgayNhapHoc().getYear() - o1.getNgayNhapHoc().getYear();
            } return o1.getMaSV().compareTo(o2.getMaSV());
        });

        for (SinhVien sv : danhSachSinhVien) {
            System.out.printf("%s - %s - Nhap hoc: %s\n",
                    sv.getMaSV(),
                    sv.getHoTen(),
                    sv.getNgayNhapHoc().format(formatter));
        }
    }
}
