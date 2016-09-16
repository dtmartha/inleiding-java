package Hoofdstuk5;

import java.applet.*;
import java.applet.Applet;
import java.awt.*;

/**
 * Created by Niurca on 13-9-2016.
 * /*
 *
 * Voorbeeld 2.1
 */
//importeer de benodigde klassen uit de Java bibliotheek

//een klasse met de naam Opdracht5 van het type Applet
public class Opdracht5 extends Applet {
    Color lijn;
    Color vul;
    int breedte;
    int hoogte;
    int x;
    int xx;
    int xxx;
    int y;
    int yy;
    int yyy;
    int br;
    int ho;


    //een (lege) methode die de Applet initialiseert \\
    public void init() {

        lijn = Color.black;
        vul = Color.magenta;
        breedte = 270;
        hoogte = 150;
        x = 30;
        xx = 350;
        xxx = 670;
        y = 30;
        yy = 70;
        yyy = 285;
        br = 300;
        ho = 175;


    }


    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {

        g.drawLine(x, y, x + br, y);
        g.drawString("Lijn", 170, 50);
        g.drawRect(x, yy, x + breedte, ho);

        g.setColor(vul);
        g.fillRect(xx, yy, x + breedte, ho);
        g.setColor(lijn);
        g.drawString("Rechthoek", 150, 270);

        g.setColor(lijn);
        g.drawOval(xx, yy, x + breedte, ho);
        g.drawString("Gevulde rechthoek met ovaal", 425, 270);

        g.drawOval(xxx, yy, x + breedte, ho);
        g.setColor(vul);
        g.fillArc(xxx, yy, br, ho, 360, 45);
        g.setColor(lijn);
        g.drawString("Taartpunt met ovaal eromheen", 750, 270);

        g.drawRoundRect(x, yyy, br, ho, 30, 30);
        g.drawString("Afgeronde rechthoek", 120, 480);

        g.setColor(vul);
        g.fillOval(xx, yyy, x + breedte, ho);
        g.setColor(lijn);
        g.drawString("Gevulde ovaal", 460, 480);

        g.drawOval(xxx + x + x, yyy, 175, 175);
        g.drawString("Cirkel", 800, 475);


    }


}














