/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt2;

/**
 *
 * @author duyne
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class chuongtrinh {
    public static void main(String[] args) {
        List<SinhVien> ds = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        
        do {
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("5. Ket thuc");
            System.out.print("Lua chon cua ban: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống
            
            switch (luaChon) {
                case 1:
                    nhapds(ds, scanner);
                    break;
                case 2:
                    xuatds(ds);
                    break;
                case 3:
                    xuatsvGioi(ds);
                    break;
                case 4:
                    sapXep(ds);
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (luaChon != 5);
    }

    public static void nhapds(List<SinhVien> danhSach, Scanner scanner) {
        System.out.print("Nhap so luong sinh vien: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Nganh (IT/Biz): ");
            String nganh = scanner.nextLine();

            if (nganh.equalsIgnoreCase("IT")) {
                System.out.print("Diem Java: ");
                double diemJava = scanner.nextDouble();
                System.out.print("Diem HTML: ");
                double diemHtml = scanner.nextDouble();
                System.out.print("Diem CSS: ");
                double diemCss = scanner.nextDouble();
                scanner.nextLine(); 
                danhSach.add(new SinhVienIT(hoTen, diemJava, diemHtml, diemCss));
            } else if (nganh.equalsIgnoreCase("Biz")) {
                System.out.print("Diem Marketing: ");
                double diemMarketing = scanner.nextDouble();
                System.out.print("Diem Sales: ");
                double diemSales = scanner.nextDouble();
                scanner.nextLine(); 
                danhSach.add(new SinhVienBiz(hoTen, diemMarketing, diemSales));
            } else {
                System.out.println("Nganh khong hop le!");
                i--; 
            }
        }
    }

    public static void xuatds(List<SinhVien> ds) {
        for (SinhVien sv : ds) {
            sv.xuat();
            System.out.println();
        }
    }

    public static void xuatsvGioi(List<SinhVien> danhSach) {
        for (SinhVien sv : danhSach) {
            if (sv.getHocLuc().equalsIgnoreCase("Gioi")) {
                sv.xuat();
                System.out.println();
            }
        }
    }

    public static void sapXep(List<SinhVien> ds) {
        Collections.sort(ds, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.getDiem(), sv1.getDiem());
            }
        });
        System.out.println("Danh sach sinh vien sau khi sap xep:");
        xuatds(ds);
    }
}


