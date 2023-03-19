/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1LAB6;

/**
 *
 * @author Ngoc Nhi
 */
public class NhanVien {
    public String ten;
    public long luong;
    
      public NhanVien() {
        this.ten = null;
        this.luong = 0;
    }

    public NhanVien(String ten, long luong) {
        this.ten = ten;
        this.luong = luong;
    }

    public void loaiNhanVien(){
        System.out.println("Loai Nhan Vien: ");
    }
    
    public void tinhLuong(){
        System.out.println("Luong cua " + ten + " thang nay la " + luong);
    }
    
    public void xuatThongTin(){
        System.out.println("Ten Nhan Vien: " + ten);
        loaiNhanVien();
        System.out.println("Co Muc Luong: " + luong);
    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }  
}
