/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt2;



public class HinhTron {
    protected double banKinh;


    public HinhTron() {
        this.banKinh = 0;
    }


    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }


    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

 
    public double getBanKinh() {
        return this.banKinh;
    }

   
    public double tinhDienTich() {
        return Math.PI * this.banKinh * this.banKinh;
    }


    public double tinhChuVi() {
        return 2 * Math.PI * this.banKinh;
    }
}
