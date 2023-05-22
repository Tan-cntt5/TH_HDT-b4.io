
package newpackage;

import java.util.ArrayList;
import java.util.List;

public class QuanLyGiaoDich {
    private List<GiaoDich> danhSachGiaoDich;

    public QuanLyGiaoDich() {
        danhSachGiaoDich = new ArrayList<>();
    }

    public void themGiaoDich(GiaoDich giaoDich) {
        danhSachGiaoDich.add(giaoDich);
    }

    public void xuatDanhSachGiaoDich() {
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            System.out.println("Ma giao dich: " + giaoDich.maGd);
            System.out.println("Ngay giao dich: " + giaoDich.ngayGd);
            System.out.println("Thanh tien: " + giaoDich.tinhThanhTien());
            System.out.println("=================================");
        }
    }

    public int demSoLuongGiaoDichDat() {
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                count++;
            }
        }
        return count;
    }

    public int demSoLuongGiaoDichNha() {
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichNha) {
                count++;
            }
        }
        return count;
    }

    public double tinhTrungBinhThanhTienGiaoDichDat() {
        double sum = 0;
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                sum += giaoDich.tinhThanhTien();
                count++;
            }
        }
        return sum / count;
    }

    public void xuatGiaoDichThang9Nam2013() {
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich.ngayGd.contains("05/2023")) {
                System.out.println("Ma giao dich: " + giaoDich.maGd);
                System.out.println("Ngay giao dich: " + giaoDich.ngayGd);
                System.out.println("Thanh tien: " + giaoDich.tinhThanhTien());
                System.out.println("=================================");
            }
        }
    }

 public static void main(String[] args) {
        QuanLyGiaoDich qlgd = new QuanLyGiaoDich();

        GiaoDichDat gdDat1 = new GiaoDichDat("GD001", "19/05/2023", 100, 200, "A");
        GiaoDichDat gdDat2 = new GiaoDichDat("GD002", "20/05/2023", 150, 300, "B");
        GiaoDichNha gdNha1 = new GiaoDichNha("GD003", "21/05/2023", 200, 150, "cao cap", "Binh tan");
        GiaoDichNha gdNha2 = new GiaoDichNha("GD004", "25/07/2023", 180, 200, "thuong", "Tan phu");

        qlgd.themGiaoDich(gdDat1);
        qlgd.themGiaoDich(gdDat2);
        qlgd.themGiaoDich(gdNha1);
        qlgd.themGiaoDich(gdNha2);

        qlgd.xuatDanhSachGiaoDich();

        int soLuongGiaoDichDat = qlgd.demSoLuongGiaoDichDat();
        int soLuongGiaoDichNha = qlgd.demSoLuongGiaoDichNha();
        double trungBinhThanhTienGiaoDichDat = qlgd.tinhTrungBinhThanhTienGiaoDichDat();

        System.out.println("So luong giao ddch dat: " + soLuongGiaoDichDat);
        System.out.println("So luong giao dich nha: " + soLuongGiaoDichNha);
        System.out.println("Trung binh thanh tien giao dich dat: " + trungBinhThanhTienGiaoDichDat);

        System.out.println("Cac giao dich thang 5 nam 2023:");
        qlgd.xuatGiaoDichThang9Nam2013();
    }
}
