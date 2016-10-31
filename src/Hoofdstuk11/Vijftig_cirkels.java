package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by gebruiker on 26-10-2016.
 */
public class Vijftig_cirkels extends Applet {

    public void init() {
        setSize(800,150);
    }

    public void paint(Graphics g) {
        int teller = 0;
        int x = 20;
        int a = 350;


        while( teller < 51) {
            x += 10;
            a -= 5;

            g.drawOval(a, a, x, x);
            teller++;
        }
    }
}
