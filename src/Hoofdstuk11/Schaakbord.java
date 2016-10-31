package Hoofdstuk11;

/**
 * Created by gebruiker on 26-10-2016.
 */

import java.applet.Applet;
import java.awt.*;

public class Schaakbord extends Applet {
    Color zwart;
    Color wit;

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.magenta);
        int y = 50;
        int x = 50;
        int breedte = 40, hoogte = 40, rij = 0, kolom = 0;
        zwart = (Color.black);
        wit = Color.WHITE;
        for (rij = 0; rij < 4; rij++) {
            x = 50;
            y += 40;


            //eerste rij

            for (kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(zwart);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(wit);
                    g.fillRect(x, y, breedte, hoogte);
                }

                x += breedte;
            }


            //tweede rij
            x = 50;
            y += 40;
            for (kolom = 0; kolom < 8; kolom++) {
                if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                    g.setColor(zwart);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(wit);
                    g.fillRect(x, y, breedte, hoogte);
                }

                x += breedte;
            }



        }
    }
}



