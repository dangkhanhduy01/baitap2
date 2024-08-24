/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt2;



public class HinhTru extends HinhTron {
    private double chieuCao;


    public HinhTru() {
        super();
        this.chieuCao = 0;
    }

    
    public HinhTru(double banKinh, double chieuCao) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }

    // Setter cho chieuCao
    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return this.chieuCao;
    }

   
    public double tinhTheTich() {
        return this.tinhDienTich() * this.chieuCao;
    }

   
    @Override
    public double tinhDienTich() {
        return 2 * Math.PI * this.banKinh * (this.banKinh + this.chieuCao);
    }
}
