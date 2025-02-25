/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShapeTool;

/**
 *
 * @author aliad
 */
abstract class Shape {
    public String nama;

    public Shape(String nama) {
        this.nama = nama;
    }
    
    public void infoShape(){ //Ini polymorphism, masing masing subClass mempunyai implementasi yang beda beda tiap infonya
    }
}
