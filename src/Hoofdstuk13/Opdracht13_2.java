package Hoofdstuk13;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by gebruiker on 11-11-2016.
 */
public class Opdracht13_2 extends Applet {
    int x1, y1, x2, y2, x3;


    public void init() {
        setSize(800, 300);
        x1 = 360;
        y1 = 480;
        x2 = 120;
        y2 = 200;
        x3 = 600;



    }
    public void paint (Graphics g) {
        tekenDriehoek(g, x1, y1, x2, y2, x3);

    }


    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3) {
        g.drawLine(x1, y2, y1, x2);
        g.drawLine(y1, x2, x3, y2);
        g.drawLine(x1, y2, x3, y2);


    }


}







