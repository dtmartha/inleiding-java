package Hoofdstuk14;

import Demos.Geluid;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.util.Random;
import java.net.URL;


public class Opdracht14_2 extends Applet {

    String[] kleuren = {"Harten", "Ruiten", "Klaver", "Schoppen"};
    String[] Waardes = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "heer", "vrouw", "aas"};
    String[] deck, speler1, speler2, speler3, speler4;
    String kleur, waardes1;
    int index, x, y;
    Color groen;
    Color rood;
    Color zwart;

    private URL pad;
    private AudioClip sound;
    private AudioClip geluid;



    public void init() {
        groen = Color.green;
        rood = Color.red;
        zwart = Color.black;
        setSize(1000, 500);
        index = 0;
        y = 45;
        x = 40;
        deck = new String[52];
        speler1 = new String[13];
        speler2 = new String[13];
        speler3 = new String[13];
        speler4 = new String[13];

        for (int i = 0; i < kleuren.length; i++) {
            kleur = kleuren[i];

            // Kaarten
            for (int j = 0; j < Waardes.length; j++) {
                waardes1 = Waardes[j];

                deck[index] = kleur + " " + waardes1;
                index++;
            }
        }

        for (int i = 0; i < 13; i++) {
            speler1[i] = deelKaart();
            speler2[i] = deelKaart();
            speler3[i] = deelKaart();
            speler4[i] = deelKaart();
        }
        pad = Geluid.class.getResource("/Resources/");
        sound = getAudioClip(pad, "shufflecards.wav");


    }

    public void paint(Graphics g) {
        g.setColor(rood);
        g.drawString("speler 1", x, y + 60);
        g.setColor(groen);
        g.drawString("speler 2", x + 160, y + 60);
        g.setColor(rood);
        g.drawString("speler 3", x + 320, y + 60);
        g.setColor(groen);
        g.drawString("speler 4", x + 480, y + 60);
        g.setColor(zwart);

        for (int i = 0; i < 13; i++) {
            g.drawString(speler1[i], x, y + 80);
            g.drawString(speler2[i], x + 160, y + 80);
            g.drawString(speler3[i], x + 320, y + 80);
            g.drawString(speler4[i], x + 480, y + 80);
            y += 20;


        }
        sound.play();
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }


}
