/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author ADMIN
 */
public class hinhtron {
     private double banKinh;

   
    public hinhtron() {
        this.banKinh = 0;
    }

  
    public hinhtron(double banKinh) {
        this.banKinh = banKinh;
    }

  
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

   
    public double getBanKinh() {
        return banKinh;
    }

   
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

   
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
    
}
