
package newpackage1;

class KhachHangVietNam extends HoaDon {
    private String doiTuongKhachHang;
    private double soLuong;
    private double donGia;
    private double dinhMuc;

    public KhachHangVietNam(String maKhachHang, String hoTen, String ngayRaHoaDon, String doiTuongKhachHang,
            double soLuong, double donGia, double dinhMuc) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double tinhThanhTien() {
        double thanhTien;
        if (soLuong <= dinhMuc) {
            thanhTien = soLuong * donGia;
        } else {
            thanhTien = soLuong * donGia * dinhMuc + (soLuong - dinhMuc) * donGia * 2.5;
        }
        return thanhTien;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Doi tuong khac hang " + doiTuongKhachHang);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
        System.out.println("Dinh muc: " + dinhMuc);
        System.out.println("Thanh tien: " + tinhThanhTien());
        System.out.println("----------------------");
    }
}
