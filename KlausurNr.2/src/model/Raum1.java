package model;

public class Raum1 extends Raum{
    

    public Raum1(String raumname, int personenanzahl, int schwierigkeitsgrad, String loesung, int dauer, int mindestalter){
        super(raumname, personenanzahl, schwierigkeitsgrad, loesung, dauer, mindestalter);
    }

    public String loesung(){
        if(getLoesung() == "Schlüssel steckt im Zündschloss"){
            return "Richtig Sie haben gewonnen";
        }
        else{
            return "Leider falsch!";
        }
    }


}
