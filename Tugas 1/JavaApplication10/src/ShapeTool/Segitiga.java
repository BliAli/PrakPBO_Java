/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShapeTool;

/**
 *
 * @author aliad
 */
public class Segitiga extends Shape implements Drawable{
    String nama;
    int luas;
    
    public Segitiga(String nama, int luas) {
        super(nama);
        this.luas = luas;
    }

    @Override
    public void infoShape() {
        System.out.println("\nIni Shape Segitiga");
    }
    
    @Override
    public void drawing() {
        System.out.println("Anda Menggambar Sebuah Segitiga dengan Luas " + this.luas);
    }

    @Override
    public void coloring(String color) {
        System.out.println("Anda Mewarnai Segitiga denga Luas" + this.luas + " Dengan Warna " + color);
    }
    
}
