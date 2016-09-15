package Hoofdstuk5;

import java.applet.Applet;

/**
 * Created by Niurca on 15-9-2016.
 */
public class Staafdiagram {
    /*

@(#)Staafdiagram.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

    //een klasse met de naam Staafdiagram van het type Applet
    private class Staadiagram extends Applet {




        //een (lege) methode die de Applet initialiseert
        public void init() {

        }

        //een methode die de inhoud van het scherm tekent
        public void paint(Graphics g) {
            g.drawstring("Welcome to Java!!", 50, 60);
        }

    }


}
