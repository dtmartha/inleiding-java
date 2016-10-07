package Hoofdstuk10;

/**
 * Created by gebruiker on 7-10-2016.
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mick van Lijssel on 6-10-2016.
 */
public class Gemiddelde extends Applet {

    TextField tekstveld;
    Button knop;

    double invoer;
    double totaal;

    double gemiddelde;

    int aantalcijfers;
    Label titel;
    boolean geklikt;

    @Override
    public void init() {
        titel = new Label("Voer een cijfer in : ");
        tekstveld = new TextField("", 5);
        add(tekstveld);

        knop = new Button("Ok");
        add(knop);
        KnopListener kl = new KnopListener();
        tekstveld.addActionListener(kl);
        knop.addActionListener(kl);
    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 60;

        if (geklikt) {
            if(invoer >= 10.01){
                g.drawString(" Ongeldig cijfer",x,y);
            }
            if ( invoer < 5.5 && invoer <= 10) {
                g.drawString(" Het cijfer is onvoldoende ", x,y);
            } if (invoer > 5.5 && invoer <= 10) {
                g.drawString(" Het cijfer is voldoende ", x,y);
            }

            y = y + 20;
            g.drawString(" Gemiddelde" + gemiddelde, x,y);
        }


    }

    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstveld.getText();
            invoer = Double.parseDouble(s);
            if (invoer <= 10) {
                totaal += invoer;

                aantalcijfers++;

                tekstveld.setText("");
                gemiddelde = totaal / aantalcijfers;
                gemiddelde=gemiddelde*10;
                int gemiddelde2 = (int) gemiddelde;
                gemiddelde=gemiddelde2;
                gemiddelde=gemiddelde/10;
            }
            geklikt=true;

            repaint();

        }
    }
}
