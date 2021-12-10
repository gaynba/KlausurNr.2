package model;

public class Gruppenleiter {
    
    String _vorname;
    String _nachname;


    public Gruppenleiter(String vorname, String nachname){
        setVorname(vorname);
        setNachname(nachname);
    }


    public String getVorname() {
        return _vorname;
    }

    public void setVorname(String _vorname) {
        this._vorname = _vorname;
    }

    public String getNachname() {
        return _nachname;
    }

    public void setNachname(String _nachname) {
        this._nachname = _nachname;
    }

}
