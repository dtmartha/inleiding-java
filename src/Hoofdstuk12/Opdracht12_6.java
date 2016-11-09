package Hoofdstuk12;

/**
 * Created by gebruiker on 9-11-2016.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12_6 extends Applet {
    int[] getallen = {100, 200, 200, 300, 300, 300, 400, 400, 500, 700, 700, 700, 700, 800};

    TextField Tekstvak;
    Button Knop;
    Label label;
    String schermtekst;

    public void init() {
        label = new Label("Voer een getal in");
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
            int teller = 0;


            for (int i = 0; i < getallen.length; i++) {
                if (getallen[i] == invoer) {
                    teller++;
                    gevonden = true;


                }

            }
            if (gevonden) {

                schermtekst = "De waarde is gevonden en komt " + teller + " keer voor ";
            } else {
                schermtekst = "De waarde is niet gevonden";
            }


            repaint();
        }
    }


}

