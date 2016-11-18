package Hoofdstuk13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gebruiker on 15-11-2016.
 */
public class Opdracht13_4 extends Applet {
    Color rood;
    Color grijs;
    Color wit;
    Button knop;
    Button knop1;
    Boolean bakstenen;
    Boolean betonblokken;


    public void init() {
        setSize(2000, 400);
        rood = Color.red;
        grijs = Color.gray;
        wit = Color.white;

        knop = new Button("Rode bakstenen");
        knop.addActionListener(new knoplistener1());
        add(knop);

        knop1 = new Button("Grijze betonblokken");
        knop1.addActionListener(new knoplistener2());
        add(knop1);
    }

    class knoplistener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bakstenen = true;
            betonblokken = false;
            repaint();


        }


    }

    class knoplistener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bakstenen = false;
            betonblokken = true;
            repaint();
        }


    }


    public void paint(Graphics g) {
        knop.setBackground(rood);
        knop1.setBackground(grijs);

        /**bakstenen muur*/
        if (bakstenen == true) {
            int y = 50;
            int x = 50;
            int breedte = 80, hoogte = 25, rij = 0, kolom = 0;

            for (kolom = 0; kolom < 50; kolom++) { //*eerste rij*//
                if (kolom < 50) {
                    g.setColor(rood);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;

            }
            int y1 = 50;
            int x1 = 50;


            for (kolom = 0; kolom < 50; kolom++) {  /*eerste rij*/
                if (kolom < 50) {
                    g.setColor(wit);
                    g.drawRect(x1, y1, breedte, hoogte);
                }
                x1 += breedte;
            }


            int y2 = 75;
            int x2 = 75;


            for (kolom = 0; kolom < 50; kolom++) {  /*tweede rij*/
                if (kolom < 50) {
                    g.setColor(rood);
                    g.fillRect(x2, y2, breedte, hoogte);
                }
                x2 += breedte;

            }
            int y3 = 75;
            int x3 = 75;


            for (kolom = 0; kolom < 50; kolom++) {  /*tweede  rij*/
                if (kolom < 50) {
                    g.setColor(wit);
                    g.drawRect(x3, y3, breedte, hoogte);
                }
                x3 += breedte;
            }

            int y4 = 100;
            int x4 = 100;


            for (kolom = 0; kolom < 50; kolom++) {  /*derde rij*/
                if (kolom < 50) {
                    g.setColor(rood);
                    g.fillRect(x4, y4, breedte, hoogte);
                }
                x4 += breedte;

            }
            int y5 = 100;
            int x5 = 100;
            for (kolom = 0; kolom < 50; kolom++) {  /*derde rij*/
                if (kolom < 50) {
                    g.setColor(wit);
                    g.drawRect(x5, y5, breedte, hoogte);
                }
                x5 += breedte;
            }
        }

                /**betonblokken muur*/
                if (betonblokken == true) {
                    int breedte = 80, hoogte = 50, rij = 0, kolom = 0;
                    int x1 = 50;
                    int y1 = 50;


                    for (kolom = 0; kolom < 50; kolom++) { //*eerste rij*//
                        if (kolom < 50) {
                            g.setColor(grijs);
                            g.fillRect(x1, y1, breedte, hoogte);
                        }
                        x1 += breedte;

                    }
                    int x2 = 50;
                    int y2 = 50;
                    for (kolom = 0; kolom < 50; kolom++) { //*eerste rij*//
                        if (kolom < 50) {
                            g.setColor(wit);
                            g.drawRect(x2, y2, breedte, hoogte);
                        }
                        x2 += breedte;

                    }
                    int x5 = 100;
                    int y5 = 100;


                    for (kolom = 0; kolom < 50; kolom++) {  /*tweede rij*/
                        if (kolom < 50) {
                            g.setColor(grijs);
                            g.fillRect(x5, y5, breedte, hoogte);
                        }
                        x5 += breedte;

                    }
                    int x6 = 100;
                    int y6 = 100;

                    for (kolom = 0; kolom < 50; kolom++) { //*tweede rij*//
                        if (kolom < 50) {
                            g.setColor(wit);
                            g.drawRect(x6, y6, breedte, hoogte);
                        }
                        x6 += breedte;

                    }
                    int y7 = 150;
                    int x7 = 150;


                    for (kolom = 0; kolom < 50; kolom++) {  /*derde rij*/
                        if (kolom < 50) {
                            g.setColor(grijs);
                            g.fillRect(x7, y7, breedte, hoogte);
                        }
                        x7 += breedte;

                    }
                    int y8 = 150;
                    int x8 = 150;

                    for (kolom = 0; kolom < 50; kolom++) { //*derde rij*//
                        if (kolom < 50) {
                            g.setColor(wit);
                            g.drawRect(x8, y8, breedte, hoogte);
                        }
                        x8 += breedte;

                    }


                }


            }
        }
















