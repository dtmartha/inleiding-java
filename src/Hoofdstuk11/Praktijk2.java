package Hoofdstuk11;

/**
 * Created by gebruiker on 31-10-2016.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk2 extends Applet {
    Button knop;
    int uitslag, teller, x, y, tafelteller;
    String s1, s2, text;
    Boolean activator;

    public void init() {
        setSize(500, 800);

        knop = new Button("Ok");
        add(knop);
        knop.addActionListener(new Vermenigvuldiger());

        y = 80;
        uitslag = 0;
        teller = 0;
        tafelteller = 0;
        activator = false;
    }

    public void paint(Graphics g) {
        if (tafelteller <= 12) {
            if (activator == true) {
                while (teller < 12) {
                    teller++;
                    uitslag = tafelteller * teller;
                    g.drawString(tafelteller + "x" + teller + "=" + uitslag, 200, y);
                    y += 20;
                }
            }
        } else {
            activator = false;
            g.drawString("De tafels gaan tot 12.", 200, y);
        }
    }


    class Vermenigvuldiger implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            activator = true;
            tafelteller++;
            teller = 0;
            y = 80;
            repaint();
        }
    }

}
