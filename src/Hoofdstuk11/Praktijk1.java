package Hoofdstuk11;

/**
 * Created by gebruiker on 31-10-2016.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk1 extends Applet {
    TextField tekstvak;
    Button knop;
    int getalinvoer, uitslag, teller, x, y;
    String s1;
    Boolean activator;

    public void init() {
        setSize(500, 800);

        tekstvak = new TextField("", 5);
        knop = new Button("Ok");
        add(tekstvak);
        add(knop);

        knop.addActionListener(new Vermenigvuldiger());
        y = 80;
        getalinvoer = 0;
        uitslag = 0;
        teller = 0;
        activator = false;
    }

    public void paint(Graphics g) {
        if (activator == true) {
            while (teller < 12) {
                teller++;
                uitslag = getalinvoer * teller;
                g.drawString(getalinvoer + "x" + teller + "=" + uitslag, 200, y);
                y += 20;
            }
        }
    }

    class Vermenigvuldiger implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = tekstvak.getText();
            getalinvoer = Integer.parseInt(s1);
            activator = true;
            teller = 0;
            y = 80;
            repaint();
        }
    }

}
