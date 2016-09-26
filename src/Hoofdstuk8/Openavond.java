package Hoofdstuk8;

/**
 * Created by gebruiker on 26-9-2016.
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Openavond extends Applet {

    int sMan;
    int sVrouw;
    int sStMan;
    int sStVrouw;
    int totaal;

    Button knopMan;
    Button knopVrouw;
    Button knopStMan;
    Button knopStVrouw;


    public void init() {
        knopMan = new Button("Man");
        knopVrouw = new Button("Vrouw");
        knopStMan = new Button("Student man");
        knopStVrouw = new Button("Student vrouw");


        knopMan.addActionListener(new TellersMan());
        knopVrouw.addActionListener(new TellersVrouw());
        knopStMan.addActionListener(new TellersStMan());
        knopStVrouw.addActionListener(new TellersStVrouw());


        add(knopMan);
        add(knopVrouw);
        add(knopStMan);
        add(knopStVrouw);


    }


    public void paint(Graphics g) {
        g.drawString(sMan + " Aantal mannen", 70, 90);
        g.drawString(sVrouw + " Aantal vrouwen", 70, 105);
        g.drawString(sStMan + " Aantal potentiele mannelijke studenten", 70, 120);
        g.drawString(sStVrouw + " Aantal potentiele vrouwelijke studenten", 70, 135);

        g.drawString(totaal + " Totaal", 70, 150);
    }


    class TellersMan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            sMan++;
            totaal++;
            repaint();
        }

    }

    class TellersVrouw implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            sVrouw++;
            totaal++;
            repaint();
        }

    }

    class TellersStMan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            sStMan++;
            totaal++;
            repaint();
        }

    }

    class TellersStVrouw implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            sStVrouw++;
            totaal++;
            repaint();
        }

    }

}

