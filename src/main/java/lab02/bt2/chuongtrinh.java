/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt2;




import java.util.Scanner;

public class chuongtrinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Nhap ban kinh hinh tron: ");
        double banKinhHinhTron = scanner.nextDouble();
        HinhTron hinhTron = new HinhTron(banKinhHinhTron);

        
        System.out.println("Thong tin hinh tron:");
        System.out.println("Ban kinh: " + hinhTron.getBanKinh());
        System.out.println("Dien tich: " + hinhTron.tinhDienTich());
        System.out.println("Chu vi: " + hinhTron.tinhChuVi());

        
        System.out.print("Nhap ban kinh hinh tru: ");
        double banKinhHinhTru = scanner.nextDouble();
        System.out.print("Nhap chieu cao hinh tru: ");
        double chieuCaoHinhTru = scanner.nextDouble();
        HinhTru hinhTru = new HinhTru(banKinhHinhTru, chieuCaoHinhTru);

       
        System.out.println("Thong tin hinh tru:");
        System.out.println("Ban kinh: " + hinhTru.getBanKinh());
        System.out.println("Chieu cao: " + hinhTru.getChieuCao());
        System.out.println("Dien tich toan phan: " + hinhTru.tinhDienTich());
        System.out.println("The tich: " + hinhTru.tinhTheTich());
    }
}
