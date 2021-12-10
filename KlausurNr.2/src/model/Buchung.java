package model;

public class Buchung {
    
    String _zeitraum;
    int _gruppengroesse;
    Gruppenleiter gruppenleiter;
    Raum raum;
    int _alterdesjuengsten;

    public Buchung(String zeitraum, int gruppengroesse, Gruppenleiter gruppenleiter, Raum raum, int alterdesjuengsten){
        setZeitraum(zeitraum);
        setGruppengroesse(gruppengroesse);
        setAlterdesjuengsten(alterdesjuengsten);
    }



    public String getZeitraum() {
        return _zeitraum;
    }

    public void setZeitraum(String _zeitraum) {
        this._zeitraum = _zeitraum;
    }

    public int getGruppengroesse() {
        return _gruppengroesse;
    }

    public void setGruppengroesse(int _gruppengroesse) {
        this._gruppengroesse = _gruppengroesse;
    }

    public Gruppenleiter getGruppenleiter() {
        return gruppenleiter;
    }

    public int getAlterdesjuengsten() {
        return _alterdesjuengsten;
    }

    public void setAlterdesjuengsten(int _alterdesjuengsten) {
        this._alterdesjuengsten = _alterdesjuengsten;
    }






}
