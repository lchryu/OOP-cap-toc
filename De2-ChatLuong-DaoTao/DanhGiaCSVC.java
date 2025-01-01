public class DanhGiaCSVC extends DanhGia{
    private CoSoVatChat coSo;

    public DanhGiaCSVC(SinhVien sinhVien, String hocKy, String nameHoc, String nhanXet, CoSoVatChat coSo) {
        super(sinhVien, hocKy, nameHoc, nhanXet);
        this.coSo = coSo;

        // tao ra 1 danh gia moi cho coSo
        coSo.themDanhGia(this);
    }

    public CoSoVatChat getCoSo() {
        return coSo;
    }

    public void setCoSo(CoSoVatChat coSo) {
        this.coSo = coSo;
    }

    @Override
    public String toString() {
        return "DanhGiaCSVC{" +
                "coSo=" + coSo +
                ", maDanhGia='" + maDanhGia + '\'' +
                ", sinhVien=" + sinhVien +
                ", ngayDanhGia=" + ngayDanhGia +
                ", hocKy='" + hocKy + '\'' +
                ", nameHoc='" + nameHoc + '\'' +
                ", nhanXet='" + nhanXet + '\'' +
                '}';
    }
}
