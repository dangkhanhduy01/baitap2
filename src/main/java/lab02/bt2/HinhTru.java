/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt2;



public class HinhTru extends HinhTron {
    private double chieucao;

    
    public HinhTru(double bankinh, double chieucao) {
        super(bankinh); 
        this.chieucao = chieucao;
    }

  
    public double getChieucao() {
        return chieucao;
    }

   
    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

  
    public double tinhTheTich() {
        return tinhDienTich() * chieucao;
    }

   
    @Override
    public double tinhDienTich() {
        return 2 * Math.PI * getBankinh() * (getBankinh() + chieucao);
    }

 
    @Override
    public void xuat() {
        System.out.println("Hinh tru co ban kinh: " + getBankinh() + 
                           ", chieu cao: " + chieucao +
                           ", dien tich: " + tinhDienTich() +
                           ", the tich: " + tinhTheTich());
    }
}
