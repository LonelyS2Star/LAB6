/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1LAB6;

/**
 *
 * @author Ngoc Nhi
 */
public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;

    public NhanVienPartTime(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }

    public NhanVienPartTime(String ten, int gioLamViec, long luong) {
        super(ten, luong);
        this.gioLamViec = gioLamViec;
    }

    @Override
    public void loaiNhanVien(){
        System.out.println("Loai Nhan Vien: PartTime.");
    }
    
    @Override
    public void tinhLuong(){
        System.out.println("Luong cua " + ten + "thang nay la " + luong*gioLamViec);
    }
    
    public int getGioLamViec() {
        return gioLamViec;
    }

    public void setGioLamViec(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }
}
