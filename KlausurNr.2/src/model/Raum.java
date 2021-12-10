package model;

public abstract class Raum {
    
    String _raumname;
    int _personenanzahl;
    int _schwierigkeitsgrad;
    String _loesung;
    int _dauer;
    int _mindestalter;


    public Raum(String raumname, int personenanzahl, int schwierigkeitsgrad, String loesung, int dauer, int mindestalter){
        setRaumname(raumname);
        setPersonenanzahl(personenanzahl);
        setSchwierigkeitsgrad(schwierigkeitsgrad);
        setLoesung(loesung);
        setDauer(dauer);
        setMindestalter(mindestalter);
    }

    public abstract String loesung();

    public int getDauer() {
        return _dauer;
    }

    public void setDauer(int _dauer) {
        this._dauer = _dauer;
    }

    public String getLoesung() {
        return _loesung;
    }

    public void setLoesung(String _loesung) {
        this._loesung = _loesung;
    }

    public int getMindestalter() {
        return _mindestalter;
    }

    public void setMindestalter(int _mindestalter) {
        this._mindestalter = _mindestalter;
    }

    public int getPersonenanzahl() {
        return _personenanzahl;
    }

    public void setPersonenanzahl(int _personenanzahl) {
        this._personenanzahl = _personenanzahl;
    }

    public String getRaumname() {
        return _raumname;
    }

    public void setRaumname(String _raumname) {
        this._raumname = _raumname;
    }

    public int getSchwierigkeitsgrad() {
        return _schwierigkeitsgrad;
    }

    public void setSchwierigkeitsgrad(int _schwierigkeitsgrad) {
        this._schwierigkeitsgrad = _schwierigkeitsgrad;
    }

}
