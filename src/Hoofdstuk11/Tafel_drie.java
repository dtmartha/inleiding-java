package Hoofdstuk11;

/**
 * Created by gebruiker on 26-10-2016.
 */
import java.applet.Applet;
import java.awt.*;


public class Tafel_drie extends Applet {

    public void init() {
        setSize(800,150);
    }

    public void paint(Graphics g) {
        int teller = 1, drie=3, uitslag=0;
        int x = 1;

        while(teller < 13) {
            x += 60;
            uitslag = drie * teller;
            g.drawString( drie + "x"+ teller + " = " + uitslag, x, 45 );
            teller++;
        }
    }
}

