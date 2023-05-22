
package newpackage1;

class KhachHangNuocNgoai extends HoaDon {
    private String quocTich;
    private double soLuong;
    private double donGia;

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, String ngayRaHoaDon, String quocTich, double soLuong,
            double donGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        this.quocTich = quocTich;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public double tinhThanhTien() {
        return soLuong * donGia;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Quoc tich: " + quocTich);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
        System.out.println("Thanh tien: " + tinhThanhTien());
        System.out.println("----------------------");
    }
}

