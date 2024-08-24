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
        double bankinh = scanner.nextDouble();

     
        HinhTron ht = new HinhTron(bankinh);
        ht.xuat();

    
        System.out.print("Nhap chieu cao hinh tru: ");
        double chieucao = scanner.nextDouble();

      
        HinhTru htru = new HinhTru(bankinh, chieucao);
        htru.xuat();
    }
}
