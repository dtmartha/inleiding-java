package Hoofdstuk10;

/**
 * Created by gebruiker on 6-10-2016.
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Hoogste_getal extends Applet {

    int getal, getal1, getal2;

    TextField tekstvak, tekstvak1, tekstvak2;

    Label label;
    String tekst;
    String tekst1;
    String tekst2;


    public void init() {
        VakListener vl = new VakListener();

        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(vl);


        tekstvak1 = new TextField("", 5);
        tekstvak1.addActionListener(vl);


        tekstvak2 = new TextField("", 5);
        tekstvak2.addActionListener(vl);


        label = new Label("voer een getal en druk op enter");

        add(label);
        add(tekstvak);
        add(tekstvak1);
        add(tekstvak2);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
        g.drawString(tekst1, 50, 80);


    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst = tekstvak.getText();
            tekst1 = tekstvak1.getText();
            tekst2 = tekstvak2.getText();

            getal = Integer.parseInt(tekst);
            getal1 = Integer.parseInt(tekst1);
            getal2 = Integer.parseInt(tekst2);


            tekstvak.setText(tekst);
            tekstvak1.setText(tekst1);
            tekstvak2.setText(tekst2);


            if (getal > getal1 && getal > getal2) {
                tekst = getal + " Dit is het hoogste getal";
                repaint();
            }


            if (getal1 > getal && getal1 > getal2) {
                tekst = getal1 + " Dit is het hoogste getal";
                repaint();

            }

            if (getal2 > getal && getal2 > getal1) {
                tekst = getal2 + " Dit is het hoogste getal";
                repaint();
            }


            if (getal < getal1 && getal < getal2) {
                tekst1 = getal + " Dit is het laagste getal";
                repaint();
            }

            if (getal1 < getal && getal1 < getal2) {
                    tekst1 = getal1 + " Dit is het laagste getal";
                    repaint();
                }

            if (getal2 < getal && getal2 < getal1)  {
                    tekst1 = getal2 + " Dit is het laagste getal";
                    repaint();
                }


            }
        }
    }


















