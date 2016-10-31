package Hoofdstuk11;

/**
 * Created by gebruiker on 26-10-2016.
 */
import java.applet.Applet;
import java.awt.*;

/**
 * Created by gebruiker on 26-10-2016.
 */
public class Cirkels extends Applet {

    public void init() {
        setSize(800,150);
    }

    public void paint(Graphics g) {
        int teller = 0;
        int x = 20;
        int a = 150;


        while( teller < 5) {
            x += 20;
            a -= 10;

            g.drawOval(a, a, x, x);
            teller++;
        }
    }
}
