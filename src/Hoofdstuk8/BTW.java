package Hoofdstuk8;

/**
 * Created by gebruiker on 26-9-2016.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BTW extends Applet {
    TextField tekstVak;
    Button knop;
    Label label;
    double uitkomst;


    public void init() {
        knop = new Button("");
        knop.setLabel("Ok");
        knop.addActionListener(new KnopListener());
        tekstVak = new TextField("", 30);
        label = new Label("Type hier uw bedrag");
        tekstVak.addActionListener(new KnopListener());
        add(label);
        add(tekstVak);
        add(knop);

    }


    public void paint(Graphics g) {

        g.drawString("€" + uitkomst + " Euro", 160, 80);
        g.drawString("Prijs inclusief BTW", 50, 80);
    }


    class KnopListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstVak.getText();
            uitkomst = Double.parseDouble(s);
            uitkomst = (uitkomst / 100) * 21 + uitkomst;
            repaint();
            tekstVak.setText("");

        }
    }


}

