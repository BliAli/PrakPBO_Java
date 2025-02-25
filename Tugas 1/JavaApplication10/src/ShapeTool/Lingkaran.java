/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShapeTool;

/**
 *
 * @author aliad
 */
public class Lingkaran extends Shape implements Drawable{
    String nama;
    int phi;
    
    public Lingkaran(String nama, int phi) { //Bentuk dari constructor subClass yang mengambil constructor dari SuperClass karena dia extends
        super(nama);
        this.phi = phi;
    }

    @Override
    public void infoShape() {
        System.out.println("\nIni Shape Lingkaran");
    }
    
    @Override
    public void drawing() {
        System.out.println("Anda Menggambar Sebuah Lingkaran dengan PHI " + this.phi);
    }

    @Override
    public void coloring(String color) {
        System.out.println("Anda Mewarnai Lingkaran dengan PHI " + this.phi + " Dengan Warna " + color);
    }
    
    
    
}
