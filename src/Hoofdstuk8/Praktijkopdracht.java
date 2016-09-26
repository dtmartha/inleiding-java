package Hoofdstuk8;

/**
 * Created by gebruiker on 26-9-2016.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdracht extends Applet {
    TextField Tekstvak;
    TextField Tekstvak1;
    Button keer;
    Button Delen;
    Button Optellen;
    Button Aftrekken;
    Label label;
    double uitkomst;


    public void init() {
        keer = new Button("");
        keer.setLabel("*");
        keer.addActionListener(new Keer());

        Delen = new Button("");
        Delen.setLabel("/");
        Delen.addActionListener(new Delen());

        Optellen = new Button("");
        Optellen.setLabel("+");
        Optellen.addActionListener(new Optellen());

        Aftrekken = new Button("");
        Aftrekken.setLabel("-");
        Aftrekken.addActionListener(new Aftrekken());

        Tekstvak = new TextField("", 30);
        Tekstvak1 = new TextField("", 30);

        label = new Label("Antwoord");
        add(label);

        add(Tekstvak);
        add(Tekstvak1);

        add(keer);
        add(Delen);
        add(Optellen);
        add(Aftrekken);
    }

    public void paint(Graphics g) {

    }

    class Keer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s1 = Tekstvak.getText();
            double ingevoerdgetal = Double.parseDouble(s1);

            String s2 = Tekstvak1.getText();
            double ingevoerdgetal1 = Double.parseDouble(s2);

            uitkomst = ingevoerdgetal * ingevoerdgetal1;
            Tekstvak.setText( "" + uitkomst);
            Tekstvak1.setText("");

            repaint();
        }
    }

    class Delen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s1 = Tekstvak.getText();
            double ingevoerdgetal = Double.parseDouble(s1);

            String s2 = Tekstvak1.getText();
            double ingevoerdgetal2 = Double.parseDouble(s2);

            uitkomst = ingevoerdgetal / ingevoerdgetal2;
            Tekstvak.setText("" + uitkomst);
            Tekstvak1.setText("");

            repaint();
        }
    }

    class Optellen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s1 = Tekstvak.getText();
            double ingevoerdgetal = Double.parseDouble(s1);

            String s2 = Tekstvak1.getText();
            double ingevoerdgetal2 = Double.parseDouble(s2);

            uitkomst = ingevoerdgetal + ingevoerdgetal2;
            Tekstvak.setText("" + uitkomst);
            Tekstvak1.setText("");

            repaint();
        }
    }

    class Aftrekken implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s1 = Tekstvak.getText();
            double ingevoerdgetal = Double.parseDouble(s1);

            String s2 = Tekstvak1.getText();
            double ingevoerdgetal2 = Double.parseDouble(s2);

            uitkomst = ingevoerdgetal - ingevoerdgetal2;
            Tekstvak.setText("" + uitkomst);
            Tekstvak1.setText("");

            repaint();
        }
    }


}


