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

    int yas;
    int valerie;
    int hans;
    int jeroen;




    //een (lege) methode die de Applet initialiseert
    public void init() {
        lijn = Color.black;
        rood = Color.red;
        oranje = Color.orange;
        yas = 415;

        //

        valerie = 33*3+25;
        hans = 66*3+25;
        jeroen =99*3+25;
    }
    //een methode die de inhoud van het scherm tekentg.drawString("60", b, 200);
    public void paint(Graphics g) {
        g.drawLine(40, 90, 40, 415);
        g.drawLine(45, 415, 190, 415);

        g.drawString("V", 50, 430);
        g.setColor(rood);
        g.drawString("J", 110, 430);
        g.setColor(oranje);
        g.drawString("H", 170, 430);

        g.setColor(lijn);
        g.drawString("100",15, 100); /*Tabellen*/
        g.drawString("80",25, 160);
        g.drawString("60",25, 220 );
        g.drawString("40",25, 280);
        g.drawString("20",25, 340);
        g.drawString("0",25, 400);


        g.fillRect(40, yas-valerie, 40, valerie);

        g.setColor(rood);
        g.fillRect(100, yas-hans, 40, hans);

        g.setColor(oranje);
        g.fillRect(150, yas-jeroen, 40, jeroen);

    }
}
