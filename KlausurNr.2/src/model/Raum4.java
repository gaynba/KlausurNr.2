package model;

public class Raum4 extends Raum{
    

    public Raum4(String raumname, int personenanzahl, int schwierigkeitsgrad, String loesung, int dauer, int mindestalter){
        super(raumname, personenanzahl, schwierigkeitsgrad, loesung, dauer, mindestalter);
    }

    public String loesung(){
        if(getLoesung() == "Schlüssel ist im linken Schuh der Leiche auf dem Sofa"){
            return "Richtig Sie haben gewonnen";
        }
        else{
            return "Leider falsch!";
        }
    }

}
