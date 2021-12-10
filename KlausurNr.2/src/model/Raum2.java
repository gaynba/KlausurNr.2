package model;

public class Raum2 extends Raum{
    
    public Raum2(String raumname, int personenanzahl, int schwierigkeitsgrad, String loesung, int dauer, int mindestalter){
        super(raumname, personenanzahl, schwierigkeitsgrad, loesung, dauer, mindestalter);
    }

    public String loesung(){
        if(getLoesung() == "Schlüsselkarte in der Brust der Leiche"){
            return "Richtig Sie haben gewonnen";
        }
        else{
            return "Leider falsch!";
        }
    }


}
