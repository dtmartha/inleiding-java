package Hoofdstuk5;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Niurca on 16-9-2016.
 */
public class Staafdiagram2 extends Applet {

    Color lijn;
    Color rood;
    Color oranje;
    int x;
    int y;
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;


    //een (lege) methode die de Applet initialiseert
    public void init() {
        lijn = Color.black;
        rood = Color.red;
        oranje = Color.orange;
        x = 40;
        y = 350;
        a = 350;
        b = 25;
        c = 40;
        d = 75;
        e = 370;
        f = 150;


    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawLine(x, 90, x, y);
        g.drawLine(x, y, 190, y);

        g.drawString("V", 50, e);
        g.setColor(rood);
        g.drawString("J", 110, e);
        g.setColor(oranje);
        g.drawString("H", 170, e);

        g.setColor(lijn);
        g.drawString("100", 15, 100); /*Tabellen*/
        g.drawString("80", b, f);
        g.drawString("60", b, 200);
        g.drawString("40", b, 250);
        g.drawString("20", b, 300);
        g.fillRect(x, 245, x, 105);

        g.setColor(rood);
        g.fillRect(100, 90, x, 260);

        g.setColor(oranje);
        g.fillRect(f, 145, x, 205); /* -y coordinaat + laatste coordinaat*/


    }
}
