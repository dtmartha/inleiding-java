package Hoofdstuk13;

/**
 * Created by gebruiker on 10-11-2016.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht13_1 extends Applet {
    Button knop;
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;

    String schermtekst;
    Color rood;
    Color groen;
    Color magenta;
    Color blauw;
    Color oranje;

    public void init() {
        rood = Color.RED;
        groen = Color.green;
        magenta = Color.magenta;
        blauw = Color.blue;
        oranje = Color.orange;

        schermtekst = "";

        knop = new Button("rood");
        knop.addActionListener(new knoplistener());
        add(knop);

        knop1 = new Button("groen");
        knop1.addActionListener(new knoplistener1());
        add(knop1);

        knop2 = new Button("magenta");
        knop2.addActionListener(new knoplistener2());
        add(knop2);

        knop3 = new Button("blauw");
        knop3.addActionListener(new knoplistener3());
        add(knop3);

        knop4 = new Button("oranje");
        knop4.addActionListener(new knoplistener4());
        add(knop4);


    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 100, 90);
        knop.setBackground(rood);
        knop1.setBackground(groen);
        knop2.setBackground(magenta);
        knop3.setBackground(blauw);
        knop4.setBackground(oranje);
    }

    class knoplistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            schermtekst = "De kleur is rood";
            repaint();

        }


    }

    class knoplistener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            schermtekst = "De kleur is groen";
            repaint();

        }


    }

    class knoplistener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            schermtekst = "De kleur is magenta";
            repaint();

        }


    }

    class knoplistener3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            schermtekst = "De kleur is blauw";
            repaint();

        }


    }

    class knoplistener4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            schermtekst = "De kleur is oranje";
            repaint();

        }


    }


}
