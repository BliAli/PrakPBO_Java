package ShapeTool;
/* @author aliad */
public class Main {

    public static void main(String[] args) {
        //Deklarasi objek dari shape yang hendak dibuat
        Shape lingkaran1 = new Lingkaran("Lingkaran", 10);
        Shape persegi1 = new Persegi("Persegi 1", 15);
        Shape segitiga1 = new Segitiga("Segitiga 1", 20);
        
        lingkaran1.infoShape();
        Drawable drawLingkaran = (Drawable) lingkaran1; // kita deklarasikan objek draw lingkaran dengan menjadikan lingkaran 1 tujuannya
        drawLingkaran.drawing();
        drawLingkaran.coloring("Merah");
        
        
        persegi1.infoShape();
        Drawable drawPersegi = (Drawable) persegi1; // kita deklarasikan objek draw lingkaran dengan menjadikan lingkaran 1 tujuannya, agar bisa menggunakan implementasi Interface Drawable
        drawPersegi.drawing();
        drawPersegi.coloring("Kuning");
        
        
        segitiga1.infoShape();
        Drawable drawSegitiga = (Drawable) segitiga1;
        drawSegitiga.drawing();
        drawSegitiga.coloring("Hijau");
        
        
        
    }
    
}
