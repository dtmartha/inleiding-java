package Hoofdstuk14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht14_1 extends Applet {

    String[] kleuren = {"Harten", "Ruiten", "Klaver", "Schoppen"};
    String[] Waardes = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "heer", "vrouw", "aas"};
    String kleur, waardes1, schermtekst;
    double random, random1;
    int worp, worp1;
    Button knop;
    Color groen;

    public void init() {
        random = Math.random();
        random1 = Math.random();


        worp = (int) (random * kleuren.length);
        worp1 = (int) (random1 * Waardes.length);

        kleur = kleuren[worp];
        waardes1 = Waardes[worp1];

        knop = new Button("Nieuwe kaart");
        knop.addActionListener(new KnopListener());
        add(knop);

        groen = Color.green;
    }

    public void paint(Graphics g) {
        knop.setBackground(groen);
        g.drawString(schermtekst, 20, 20);



    }


    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            schermtekst = "" + kleur + " " + waardes1;
            repaint();


        }
    }


}
