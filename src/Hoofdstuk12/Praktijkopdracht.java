package Hoofdstuk12;

/**
 * Created by gebruiker on 9-11-2016.
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {

    int[] nummer;
    String[] naam;
    TextField[] Tekstvakken;
    int teller = 0;
    boolean gedrukt;
    Label label;


    @Override
    public void init() {
        setSize(800, 400);
        Tekstvakken = new TextField[2];
        nummer = new int[10];
        label = new Label("Voer een naam en telefoon nummer in. ");
        add(label);

        naam = new String[10];
        Button knop = new Button("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);


        for (int i = 0; i < Tekstvakken.length; i++) {
            Tekstvakken[i] = new TextField("", 10);
            Tekstvakken[i].addActionListener(kl);
            add(Tekstvakken[i]);
        }
        add(knop);

    }


    private class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {


            if (teller < 10) {

                naam[teller] = Tekstvakken[0].getText();
                nummer[teller] = Integer.parseInt(Tekstvakken[1].getText());

                teller++;
            } else {
                gedrukt = true;
                repaint();
            }
            Tekstvakken[0].setText("");
            Tekstvakken[1].setText("");
        }
    }


    @Override
    public void paint(Graphics g) {
        if (gedrukt) {
            int x = 50;
            int y = 50;
            for (int i = 0; i < nummer.length; i++) {
                g.drawString(naam[i] + "   " + nummer[i], x, y);
                y += 25;

            }

        }
    }
}
