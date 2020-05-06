//Importamos la libreria proncipal

import processing.core.PApplet;

/**
 * Clase principal que hererda de PApplet
 * (la clase padre que tiene todos los métodos
 * y atributos para usar Processing)
 */
public class Formas extends PApplet {
    //Dimensiones del sketch
    int viewport_w = 1280; // ancho en pixeles
    int viewport_h = 720; // alto en pixeles

    public static void main(String args[]) {
        PApplet.main("Formas");
    }

    //Método que tiene las configuraciones iniciales
    @Override
    public void settings() {
        size(viewport_w, viewport_h, P2D);
        smooth(8);
    }

    // en este metodo tambien podemos meter configuraciones iniciales de nuestro sketch
    @Override
    public void setup() {


    }


    @Override
    public void draw() {
        if (!mousePressed) {
            background(25, 200, 230); //DIA
            fill(255, 255, 0);

        } else {
            background(0, 0, 128); //NOCHE
            fill(238, 238, 238);
        }
        ellipse(mouseX, 200, 150, 150); //SOL Y LUNA

        //SUELO
        if (!mousePressed)
            fill(20, 90, 50);
        else
            fill(0, 51, 51);
        rect(0, 650, 1900, 300);

        //MONTAÑAS
        fill(78, 52, 46);
        triangle(0, 650, 400, 300, 800, 650);
        fill(62, 39, 35);
        triangle(300, 650, 400, 300, 800, 650); //IZQUIERDA

        fill(78, 52, 46);
        triangle(600, 650, 1300, 400, 1600, 650);
        fill(62, 39, 35);
        triangle(1900, 650, 1300, 400, 1600, 650); //DERECHA

        //CASA
        fill(198, 198, 198);
        rect(600, 400, 480, 300);
        fill(128, 128, 128);
        rect(1050, 400, 100, 300);

        //TEJADO
        fill(244, 81, 30);
        triangle(525, 400, 850, 200, 1165, 400);
        fill(191, 54, 12);
        triangle(1165, 400, 850, 200, 1250, 400);

        //PUERTA
        fill(217, 117, 24);
        rect(790, 500, 100, 200);
        ellipse(880, 595, 10, 10);

        //VENTANAS
        if (!mousePressed)
            fill(255, 255, 255);
        else
            fill(255, 255, 55);
        rect(650, 450, 100, 100); //IZQUIERDA
        rect(925, 450, 100, 100); //DERECHA
        ellipse(835, 310, 75, 75); //TEJADO
    }
}
