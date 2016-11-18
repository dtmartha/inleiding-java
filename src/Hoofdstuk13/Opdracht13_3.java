package Hoofdstuk13;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by gebruiker on 14-11-2016.
 */
public class Opdracht13_3 extends Applet {

    Color rood;


    public void init() {
        setSize(2000, 200);
        rood = Color.red;

    }


    public void paint(Graphics g) {
        g.setColor(rood);
        tekenBakstenen(g);
    }

    void tekenBakstenen(Graphics g) {
        int y = 50;
        int x = 50;
        int breedte = 80, hoogte = 25, rij = 0, kolom = 0;

        for (kolom = 0; kolom < 50; kolom++) { //*eerste rij*//
            if (kolom < 50) {
                g.setColor(rood);
                g.drawRect(x, y, breedte, hoogte);
            }
            x += breedte;

        }


        int y1 = 75;
        int x1 = 75;


        for (kolom = 0; kolom < 50; kolom++) {  /*tweede rij*/
            if (kolom < 50) {
                g.setColor(rood);
                g.drawRect(x1, y1, breedte, hoogte);
            }
            x1 += breedte;

        }
        int y2 = 100;
        int x2 = 100;


        for (kolom = 0; kolom < 50; kolom++) {  /*derde rij*/
            if (kolom < 50) {
                g.setColor(rood);
                g.drawRect(x2, y2, breedte, hoogte);
            }
            x2 += breedte;

        }


    }

}








