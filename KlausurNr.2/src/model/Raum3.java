package model;

public class Raum3 extends Raum{
    
    public Raum3(String raumname, int personenanzahl, int schwierigkeitsgrad, String loesung, int dauer, int mindestalter){
        super(raumname, personenanzahl, schwierigkeitsgrad, loesung, dauer, mindestalter);
    }

    public String loesung(){
        if(getLoesung() == "Schlüssel ist in der schwarzen Maske"){
            return "Richtig Sie haben gewonnen";
        }
        else{
            return "Leider falsch!";
        }
    }

}
