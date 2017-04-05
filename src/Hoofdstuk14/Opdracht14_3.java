package Hoofdstuk14;

/**
 * Created by gebruiker on 1-1-2017.
 */

import Demos.Geluid;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class Opdracht14_3 extends Applet {
    private TextField tekstvak;

    private String invoer_speler, schermtekst, schermtekst1;

    private Button knopspelen;

    int verlaging, stenen, invoer_conv;

    private Color groen = Color.green;
    private Color rood = Color.red;
    private Color zwart = Color.black;


    private URL pad;

    Boolean winning;

    private Image krabs, kermit;

    private Label label;

    public void init() {
        setSize(1000, 500);

        knopspelen = new Button("Spelen");
        knopspelen.addActionListener(new knopListener());
        add(knopspelen);

        tekstvak = new TextField(10);
        add(tekstvak);

        invoer_speler = "";
        schermtekst = "";

        stenen = 23;

        verlaging = 0;

        label = new Label("Voer een getal tot en met 3 in");
        add(label);

        pad = Opdracht14_3.class.getResource("/Resources/");
        krabs = getImage(pad, "krabs.jpg");
        kermit = getImage(pad, "kermit.png");

        winning = true;


    }

    public void paint(Graphics g) {
        knopspelen.setBackground(groen);

        int x2 = 50;
        int y2 = 35;

        for (int i = 0; i < stenen; i++) {
            if (i % 4 == 0) {
                x2 = 50;
                y2 += 50;


            }
            if (winning) {
                g.drawImage(kermit, x2, y2, 50, 50, this);
            } else {
                g.drawImage(krabs, x2, y2, 50, 50, this);
            }
            x2 += 50;
        }
        g.drawString("Verlaagd met :" + verlaging, 20, 425);
        g.drawString("Aantal stenen :" + stenen, 20, 450);
        g.setColor(rood);
        g.drawString(schermtekst, 20, 475);
        g.setColor(zwart);
        g.drawString(schermtekst1, 20, 500);


    }

    private class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invoer_speler = tekstvak.getText();
            invoer_conv = Integer.parseInt(invoer_speler);

            if (invoer_conv > 0 && invoer_conv <= 3) { //bekijkt of de invoer geldig is//
                schermtekst = "";
            }
            if (invoer_conv > 3 || invoer_conv == 0) {
                schermtekst = "Ongeldige invoer";
            }
            update_spel();
            repaint();


        }
    }

    public void update_spel() {
        if (invoer_conv == 1) { //verlaagd het aantal stenen met de invoer van de gebruiker//
            stenen = stenen - 1;

        } else if (invoer_conv == 2) {
            stenen = stenen - 2;

        } else if (invoer_conv == 3) {
            stenen = stenen - 3;

        }

        //start van het spel tegen de computer//

        if (stenen == 22 || stenen == 18 || stenen == 14 || stenen == 10 || stenen == 6 || stenen == 2) {
            winning = false;
            verlaging = 1;
            stenen -= 1;
        }
        if (stenen == 19 || stenen == 15 || stenen == 11 || stenen == 7 || stenen == 3) {
            winning = false;
            verlaging = 2;
            stenen -= 2;


        }
        if (stenen == 1) {
            verlaging = 1;
            stenen -= 1;
        }


        if (stenen == 20 || stenen == 16 || stenen == 12 || stenen == 8 || stenen == 4) {
            winning = false;
            verlaging = 3;
            stenen -= 3;


        }
        if (stenen == 21 || stenen == 17 || stenen == 13 || stenen == 9 || stenen == 5) {
            int random = new Random().nextInt(3) + 1;
            verlaging = random;
            stenen -= verlaging;
        }
        if (stenen == 0 && winning == true) {
            schermtekst1 = "U heeft gewonnen !";

        }
        if (stenen == 0 && winning == false) {
            schermtekst1 = "U heeft verloren :(";
        }


    }


}


