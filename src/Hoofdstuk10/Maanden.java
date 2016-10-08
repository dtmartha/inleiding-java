package Hoofdstuk10;

/**
 * Created by gebruiker on 6-10-2016.
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Maanden extends Applet {
    TextField tekstvak, tekstvak1;
    Label label;
    Label label1;
    String s, s1, tekst, tekst1;
    int maand;
    int jaartal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Maand");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        tekstvak1 = new TextField("", 20);
        label1 = new Label("Jaar");
        tekstvak1.addActionListener(new TekstvakListener());
        tekst1 = "";
        add(label);
        add(tekstvak);
        add(label1);
        add(tekstvak1);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
        g.drawString(tekst1, 50, 80);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            s1 = tekstvak1.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekst = "Januari, 31 dagen ";

                    break;
                case 2:
                    tekst = " Februari, 28 dagen ";

                    break;
                case 3:
                    tekst = " Maart, 31 dagen ";

                    break;
                case 4:
                    tekst = " April, 30 dagen";

                    break;
                case 5:
                    tekst = " Mei, 31 dagen";

                    break;
                case 6:
                    tekst = " Juni, 30 dagen";

                    break;
                case 7:
                    tekst = " Juli, 31 dagen";

                    break;
                case 8:
                    tekst = " Augustus, 31 dagen";

                    break;
                case 9:
                    tekst = " September, 30 dagen";

                    break;
                case 10:
                    tekst = " Oktober, 31 dagen";

                    break;
                case 11:
                    tekst = " November, 30 dagen";

                    break;
                case 12:
                    tekst = " December, 31 dagen";

                    break;
                default:
                    tekst = "";
                    break;
            }
            repaint();
            jaartal = Integer.parseInt(s1);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 && maand == 2) {
                tekst = "Februari, 29 dagen";
                tekst1 = "" + jaartal + " is een schrikkeljaar";
                repaint();

            } else {
                tekst1 = "" + jaartal + " is geen schrikkeljaar";



            }

            repaint();

        }
    }
}
