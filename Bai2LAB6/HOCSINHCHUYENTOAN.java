/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2LAB6;

/**
 *
 * @author Ngoc Nhi
 */
public class HOCSINHCHUYENTOAN extends HOCSINH {
    public HOCSINHCHUYENTOAN(String hoTen, String Lop, float Toan, float Ly, float Hoa) {
        super(hoTen, Lop, Toan, Ly, Hoa);
    }
    
 @Override
    public float diemTrungBinh (){
    return (Hoa+Toan*2+Ly)/4;
    }
   
}


