/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2LAB6;

/**
 *
 * @author Ngoc Nhi
 */
public class HOCSINH {
    String hoTen;
    String Lop;
    float Toan;
    float Ly;
    float Hoa;
    
    public HOCSINH(String  hoTen, String Lop,  float Toan, float Ly, float Hoa){
            this.hoTen=hoTen;
            this.Lop=Lop;
            this.Toan=Toan;
            this.Ly=Ly;
            this.Hoa=Hoa;
    }
  
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public float getToan() {
        return Toan;
    }

    public void setToan(float Toan) {
        this.Toan = Toan;
    }

    public float getLy() {
        return Ly;
    }

    public void setLy(float Ly) {
        this.Ly = Ly;
    }

    public float getHoa() {
        return Hoa;
    }

    public void setHoa(float Hoa) {
        this.Hoa = Hoa;
    }
    
    public float diemTrungBinh(){
    return (Toan+Ly+Hoa)/3 ;
    
    }

}
