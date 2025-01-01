import java.awt.*;
import java.util.Collections;
import java.util.List;

public class HeThongDanhGia {
    private List<SinhVien>dsSinhVien;
    private List<GiangVien>dsGiangVien;
    private List<CoSoVatChat>dsCoSo;
    private List<DanhGia>dsDanhGia;

    public HeThongDanhGia(List<SinhVien> dsSinhVien, List<GiangVien> dsGiangVien, List<CoSoVatChat> dsCoSo, List<DanhGia> dsDanhGia) {
        this.dsSinhVien = dsSinhVien;
        this.dsGiangVien = dsGiangVien;
        this.dsCoSo = dsCoSo;
        this.dsDanhGia = dsDanhGia;
    }
    // 1 hien thi danh sach danh gia trong hoc ky cua nam
    public void hienThiDanhGia(String hocky, String namHoc) {
        System.out.println("Danh sach danh gia HK " + hocky + " nam hoc " + namHoc +":");
        for (DanhGia dg : dsDanhGia) {
            if (dg.getHocKy().equals(hocky) && dg.getNameHoc().equals(namHoc)) {
                System.out.println(dg);
            }
        }
    }

    // 2 them danh gia moi
    public void themDanhGiaGV(SinhVien sv, GiangVien gv, String hocky, String namHoc, String nhanxet, int diem) {
        DanhGiaGV danhgia = new DanhGiaGV(sv, gv, hocky, namHoc, nhanxet, diem);
        dsDanhGia.add(danhgia);
        sv.tangSoLuongDanhGia();
    }

    // 3. xac dinh danh sach csvc tai cs NB
    public void danhSachDanhGiaCSVC(String maCS, String hocKy, String namHoc) {
        System.out.println("Danh sach danh gia co so " + maCS + " nam hoc " + namHoc +" tai hoc ky " + hocKy);
        for (DanhGia dg : dsDanhGia) {
            if (dg instanceof DanhGiaCSVC) {
                DanhGiaCSVC dgCS = (DanhGiaCSVC) dg;
                if (dgCS.getCoSo().equals(maCS) &&
                dgCS.getHocKy().equals(hocKy) &&
                dgCS.getNameHoc().equals(namHoc)) {
                    System.out.println(dgCS);
                }
            }
        }
    }

    // 4 tinh diem trung binh cua giang vien (chua tinh theo hoc ky)
    public void tinhDiemTBGiangVien(String hocky, String namHoc) {
        System.out.println("Diem tb gv cua hk " + hocky + " nam hoc " + namHoc +":");
        for (GiangVien gv : dsGiangVien) {
            System.out.println(gv.getMaGV() + " | " + gv.getHoTen() + " | " + gv.tinhDiemTrungBinh());
        }
    }

    // 5. sap xep dssv giam dan theo nam sinh
    // neu nam sinh == -> tang dan so luong danh gia
    public void sapXepSinhVien() {
        Collections.sort(dsSinhVien, (o1, o2) -> {
            if (o1.getNgaySinh().getYear() != o2.getNgaySinh().getYear()) {
                return o2.getNgaySinh().getYear() - o1.getNgaySinh().getYear();
            }
            return o1.getSoLuongDanhGia() - o2.getSoLuongDanhGia();
        });
        for (SinhVien sv : dsSinhVien) {
            System.out.println(sv);
        }
    }
    public void themSinhVien(SinhVien sv) {dsSinhVien.add(sv);}
    public void themGiangVien(GiangVien gv) {dsGiangVien.add(gv);}
    public void themCoSo(CoSoVatChat coSoVatChat) {dsCoSo.add(coSoVatChat);}
}
