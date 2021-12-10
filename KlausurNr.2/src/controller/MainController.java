package controller;

import model.*;
import view.*;
import java.util.ArrayList;

public class MainController {
    
    ArrayList<Buchung> buchungen = new ArrayList<Buchung>();
    ArrayList<Raum> raeume = new ArrayList<Raum>();

    public void Demodata(){

        Raum1 b = new Raum1("Breaking Bad", 4, 1, "Schlüssel steckt im Zündschloss", 90, 12);
        Raum2 w = new Raum2("Walking Dead", 6, 3, "Schlüsselkarte in der Brust der Leiche", 120, 14);
        Raum3 s = new Raum3("Squid Game", 4, 2, "Schlüssel ist in der schwarzen Maske", 90, 18);
        Raum4 ahs = new Raum4("American Horror Story", 6, 2, "Schlüssel ist im linken Schuh der Leiche auf dem Sofa", 140, 18);

        Gruppenleiter g1 = new Gruppenleiter("Hans", "Wurst");
        Gruppenleiter g2 = new Gruppenleiter("Peter", "Vogel");
        Gruppenleiter g3 = new Gruppenleiter("Harald", "Kopfnuss");
        Gruppenleiter g4 = new Gruppenleiter("Paul", "Kaffeemaschine");



        Buchung a1 = new Buchung("13.09.2021, 12 Uhr", 4, g1, b, 11);
        Buchung a2 = new Buchung("14.09.2021, 15 Uhr", 4, g1, b, 13);
        Buchung b1 = new Buchung("17.10.2021, 14 Uhr", 6, g2, w, 15);
        Buchung b2 = new Buchung("28.10.2021, 16 Uhr", 6, g2, w, 16);
        Buchung c1 = new Buchung("15.12.2021, 21 Uhr", 4, g3, s, 19);
        Buchung c2 = new Buchung("17.11.2021, 22 Uhr", 4, g3, s, 69);
        Buchung d1 = new Buchung("16.12.2021, 17 Uhr", 6, g4, ahs, 17);
        Buchung d2 = new Buchung("17.10.2021, 18 Uhr", 6, g4, ahs, 24);
        
        Output o = new Output();

        for(Raum raum : raeume){
            o.printData(raum.loesung());
        }

        int minalter = 12;
        for(Buchung a : buchungen){
            if(a.getAlterdesjuengsten() > minalter){
                System.out.println(a);
            }
        }
        
        /*int mindestalter = 14;
        for(Buchung b : buchungen){
            if(b.getAlterdesjuengsten() > minalter){
                System.out.println(b);
            }
        }

        int mindestalter = 14;
        for(Buchung c : buchungen){
            if(c.getAlterdesjuengsten() > minalter){
                System.out.println(c);
            }
        }


        int mindestalter = 18;
        for(Buchung d : buchungen){
            if(d.getAlterdesjuengsten() > minalter){
                System.out.println(d);
            }
        }
        */
    }

}
