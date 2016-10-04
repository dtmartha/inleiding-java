package Hoofdstuk8;

/**
 * Created by gebruiker on 29-9-2016.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Niurca on 16-9-2016.
 */
public class Staafdiagram_uitbreiding extends Applet {

    Color lijn;
    Color rood;
    Color oranje;

    int yas;
    int valerie;
    int hans;
    int jeroen;

    TextField tekstvak;
    TextField tekstvak2;
    TextField tekstvak3;

    Label label;
    Label label2;
    Label label3;

    int getal1;
    int getal2;
    int getal3;

    Button Update;

    String schermtekst;


    //een (lege) methode die de Applet initialiseert
    public void init() {
        lijn = Color.black;
        rood = Color.red;
        oranje = Color.orange;
        yas = 415;
        schermtekst = "";


        //

        valerie = 33 * 3 + 25;
        hans = 66 * 3 + 25;
        jeroen = 99 * 3 + 25;

        //

        tekstvak = new TextField("", 20);
        label = new Label("Valerie");
        add(label);
        add(tekstvak);

        tekstvak2 = new TextField("", 20);
        label2 = new Label("Hans");
        add(label2);
        add(tekstvak2);

        tekstvak3 = new TextField("", 20);
        label3 = new Label("Jeroen");
        add(label3);
        add(tekstvak3);

        Update = new Button();
        Update.setLabel("Wijzig waardes");

        knoplistener kl = new knoplistener ();
        Update.addActionListener(kl);

        knoplistener1 kl1 = new knoplistener1 ();
        Update.addActionListener(kl1);

        knoplistener2 kl2 = new knoplistener2 ();
        Update.addActionListener(kl2);


        add(Update);


    }

    //een methode die de inhoud van het scherm tekentg.drawString("60", b, 200);
    public void paint(Graphics g) {
        g.drawLine(40, 90, 40, 415);
        g.drawLine(45, 415, 190, 415);


        g.drawString("V", 50, 430);
        g.setColor(rood);
        g.drawString("J", 110, 430);
        g.setColor(oranje);
        g.drawString("H", 170, 430);

        g.setColor(lijn);
        g.drawString("100", 15, 100); /*Tabellen*/
        g.drawString("80", 25, 160);
        g.drawString("60", 25, 220);
        g.drawString("40", 25, 280);
        g.drawString("20", 25, 340);
        g.drawString("0", 25, 400);

        g.fillRect(40, yas - valerie, 40, valerie);

        g.setColor(rood);
        g.fillRect(100, yas - hans, 40, hans);

        g.setColor(oranje);
        g.fillRect(150, yas - jeroen, 40, jeroen);

    }
    class knoplistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.parseInt(tekstvak.getText());
            valerie = getal1 * 3 + 25;
            repaint();
        }
    }
    class knoplistener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal2 = Integer.parseInt(tekstvak2.getText());
            hans = getal2 * 3 + 25;
            repaint();
        }
    }
    class knoplistener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal3 = Integer.parseInt(tekstvak3.getText());
            jeroen = getal3 * 3 + 25;
            repaint();
        }
    }

}
























