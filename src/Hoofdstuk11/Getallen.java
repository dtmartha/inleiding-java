package Hoofdstuk11;

/**
 * Created by gebruiker on 20-10-2016.
 */
import java.awt.*;
import java.applet.*;


public class Getallen extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 20; teller > 9; teller--) {
            y += 20;
            g.drawString("" + teller, 305, y );
        }
    }
}