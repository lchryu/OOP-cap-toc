import java.util.List;

public class CoSoVatChat {
    private String maCS;
    private String tenCS;
    private List<DanhGiaCSVC> danhGiaList;

    public CoSoVatChat(String maCS, String tenCS, List<DanhGiaCSVC> danhGiaList) {
        this.maCS = maCS;
        this.tenCS = tenCS;
        this.danhGiaList = danhGiaList;
    }

    public String getMaCS() {
        return maCS;
    }

    public void setMaCS(String maCS) {
        this.maCS = maCS;
    }

    public String getTenCS() {
        return tenCS;
    }

    public void setTenCS(String tenCS) {
        this.tenCS = tenCS;
    }

    public List<DanhGiaCSVC> getDanhGiaList() {
        return danhGiaList;
    }

    public void setDanhGiaList(List<DanhGiaCSVC> danhGiaList) {
        this.danhGiaList = danhGiaList;
    }

    public void themDanhGia(DanhGiaCSVC danhGia) {
        danhGiaList.add(danhGia);
    }
}
