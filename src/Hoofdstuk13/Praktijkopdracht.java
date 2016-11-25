package Hoofdstuk13;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by gebruiker on 17-11-2016.
 */
public class Praktijkopdracht extends Applet {
    Color donkergroen = new Color(0, 51, 0);
    Color groen;
    Color bruin = new Color(153, 51, 0);


    public void init() {

        setSize(900, 600);
        setBackground(donkergroen);
        groen = Color.green;


    }


    public void paint(Graphics g) {
        tekenBoom(g);
    }

    void tekenBoom(Graphics g) {
        /**eerste rij**/
        int y = 50;
        int x = 50;
        int x1 = 65;
        int y1 = 140;
        int breedte = 80;

        for (int j = 0; j < 2; j++) {
            y += 125;
            y1 += 125;


            for (int i = 0; i < 5; i++) {


                g.setColor(groen);
                g.fillOval(x, y, 45, 100);
                g.fillOval(x1, y, 45, 100);

                g.setColor(bruin);
                g.fillRect(x1, y1, 30, 100);


                x += breedte;
                x1 += breedte;


            }
        }

    }
}
