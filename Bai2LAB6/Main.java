/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2LAB6;

/**
 *
 * @author Ngoc Nhi
 */
public class Main {

    public static void main (String [] args){
      
      HOCSINH hs=new HOCSINH("Nguyen Van Nam", "11B", 8, 9, 7);
      System.out.println( "Diem cua hoc sinh la " + hs.diemTrungBinh());

      HOCSINHCHUYENTOAN hs1 = new HOCSINHCHUYENTOAN("Nguyen Thi Lan", "11B", 10, 9.5f, 8);
      System.out.println( "Diem cua hoc sinh chuyen toan la " + hs1.diemTrungBinh());
   }
}