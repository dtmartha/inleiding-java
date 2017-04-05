package Hoofdstuk12;

/**
 * Created by gebruiker on 2-11-2016.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht12_3 extends Applet {
    TextField[] tekstvakken;
    int[] getallen;
    Button knop;
    Label label;
    String schermtekst;


    public void init() {
        label = new Label("Voer 5 getallen in");
        add(label);

        tekstvakken = new TextField[5];
        getallen = new int[5];
        for (int i = 0; i < tekstvakken.length; i++) {
            tekstvakken[i] = new TextField("", 5);
            add(tekstvakken[i]);

        }
        knop = new Button("OK");
        add(knop);
        knop.addActionListener(new Knoplistener());


    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 900, 100);

    }

    class Knoplistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < tekstvakken.length; i++) {
                String invoer = tekstvakken[i].getText();
                getallen[i] = Integer.parseInt(invoer);


            }
            Arrays.sort(getallen);

            for (int i = 0; i < getallen.length; i++) {
                tekstvakken[i].setText(String.valueOf(getallen[i]));
            }
            schermtekst = "De cijfers staan nu van klein naar groot";
            repaint();


        }


    }

}

