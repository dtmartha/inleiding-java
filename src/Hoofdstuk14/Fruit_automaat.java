package Hoofdstuk14;

import Demos.Geluid;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Fruit_automaat extends Applet {
    private Button knopspelen, knopkrediet;

    private Color groen = Color.green;
    private Color rood;

    private AudioClip sound, geluid;

    private int krediet, verdiensten;

    private Image[] foto = new Image[20];

    private int foto1 = (int) (Math.random() * 20);
    private int foto2 = (int) (Math.random() * 20);
    private int foto3 = (int) (Math.random() * 20);


    public void init() {
        setSize(500, 500);
        URL pad = Geluid.class.getResource("/Resources/");
        sound = getAudioClip(pad, "fruitmachine.wav");
        geluid = getAudioClip(pad, "losing.wav");

        rood = Color.red;

        knopspelen = new Button("spelen");
        knopkrediet = new Button("koop 10 krediet bij");

        knopspelen.addActionListener(new knopListener());
        knopspelen.setEnabled(true);
        add(knopspelen);

        knopkrediet.addActionListener(new knopListener1());
        knopkrediet.setEnabled(false);
        add(knopkrediet);

        krediet = 10;
        verdiensten = 0;

        for (int i = 0; i < foto.length; i++) {
            foto[i] = getImage(pad, "fruit_" + (i + 1) + ".jpg");


        }


    }

    public void paint(Graphics g) {
        knopspelen.setBackground(groen);
        knopkrediet.setBackground(rood);
        g.drawString("verdiende punten :" + verdiensten, 20, 300);
        g.drawString("krediet :" + krediet, 20, 350);
        g.drawImage(foto[foto1], 150, 50, this);
        g.drawImage(foto[foto2], 225, 50, this);
        g.drawImage(foto[foto3], 300, 50, this);

    }


    private class knopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            foto1 = (int) (Math.random() * 20);
            foto2 = (int) (Math.random() * 20);
            foto3 = (int) (Math.random() * 20);


            sound.play();
            krediet -= 1;

            verdiensten = 0;


            if (krediet == 0) {
                knopspelen.setEnabled(false);
                knopkrediet.setEnabled(true);
                knopkrediet.setBackground(rood);
            }
            if (foto1 == foto2) {
                krediet += 4;
                verdiensten = 4;
            }
            if (foto1 == foto3) {
                krediet += 4;
                verdiensten = 4;
            }
            if (foto2 == foto3) {
                krediet += 4;
                verdiensten = 4;
            }
            if (foto1 == foto2 && foto2 == foto3) {
                krediet += 20;
                verdiensten = 20;
            }

            repaint();
        }
    }

    private class knopListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            geluid.play();
            krediet += 10;

            if (krediet >= 1) {
                knopspelen.setEnabled(true);
                knopkrediet.setEnabled(false);
            }
            repaint();
        }


    }

}


