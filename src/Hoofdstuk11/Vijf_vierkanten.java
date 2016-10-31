package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by gebruiker on 26-10-2016.
 */
public class Vijf_vierkanten extends Applet {

    public void init() {
        setSize(800,150);
    }

    public void paint(Graphics g) {
        int teller = 0;
        int x = 20;
        int y = 20;

        while( teller < 5) {
            x += 20;
            y += 20;


            g.drawRect(x, y, 20, 20);
            teller++;
        }
    }
}
