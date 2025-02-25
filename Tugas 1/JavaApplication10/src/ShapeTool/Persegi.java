/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShapeTool;

/**
 *
 * @author aliad
 */
public class Persegi extends Shape implements Drawable{
    String nama;
    int keliling;
    
    public Persegi(String nama, int keliling) {
        super(nama);
        this.keliling = keliling;
    }

    @Override
    public void infoShape() {
        System.out.println("\nIni Shape Persegi");
    }
    
    @Override
    public void drawing() {
        System.out.println("Anda Menggambar Sebuah Persegi dengan Keliling " + this.keliling);
    }

    @Override
    public void coloring(String color) {
        System.out.println("Anda Mewarnai Persegi denga Keliling" + this.keliling + " Dengan Warna " + color);
    }
}
