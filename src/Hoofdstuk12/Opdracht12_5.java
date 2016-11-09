package Hoofdstuk12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gebruiker on 8-11-2016.
 */
public class Opdracht12_5 extends Applet {
    int[] getallen = {55, 44, 58, 102, 23, 17, 52, 31};

    TextField Tekstvak;
    Button Knop;
    String schermtekst;

    public void init() {
        Tekstvak = new TextField("", 8);
        add(Tekstvak);
        Knop = new Button("OK");
        Knop.addActionListener(new knoplistener());
        add(Knop);
        schermtekst = "";

    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 80;

        g.drawString(schermtekst, x, y);


    }

    class knoplistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(Tekstvak.getText());

            boolean gevonden = false;
            int index = 0;

            for (int i = 0; i < getallen.length; i++) {
                if (getallen[i] == invoer) {
                    gevonden = true;
                    index = i;

                }

            }
            if (gevonden) {
                schermtekst = "De waarde is gevonden, De index is " + index;
            } else {
                schermtekst = "De waarde is niet gevonden";
            }


            repaint();
        }
    }


}

