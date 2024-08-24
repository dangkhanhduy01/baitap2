/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt2;



public class HinhTron {
    private double bankinh;

    
    public HinhTron(double bankinh) {
        this.bankinh = bankinh;
    }


    public double getBankinh() {
        return bankinh;
    }

   
    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

 
    public double tinhDienTich() {
        return Math.PI * bankinh * bankinh;
    }

  
    public double tinhChuVi() {
        return 2 * Math.PI * bankinh;
    }

 
    public void xuat() {
        System.out.println("Hinh tron co ban kinh: " + bankinh + 
                           ", dien tich: " + tinhDienTich() +
                           ", chu vi: " + tinhChuVi());
    }
}
