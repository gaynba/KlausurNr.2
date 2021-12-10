import controller.*;

public class App {
    public static void main(String[] args) throws Exception {
        MainController mc = new MainController();

        mc.Demodata();
    }

    /*
        Erklärung des Codes: 
        Also erstmal haben wir ein MVC-pattern erstellt. D.h., dass wir einen Controller haben, in dem die Demoobjekte der Klassen stehen und auch der Code für die Ausgabe stattfindet. Das "model" ist der Ordner, in dem die ganzen Klassen untergebracht sind. Zum Schluss haben wir noch den Ordner view, mit dem Output, über den die Ausgabe in der Konsole stattfindet. 
        In App.java importiert man den MainController. 
        Im Output erstellt man die Datenausgabe für die Dienstleistungsmethoden.
        Zudem haben wir in dem Ordner Model eine Oberklasse "Raum". Die Objekte "Raum1" - "Raum4" erben von dieser Oberklasse und werden somit eine Unterklasse der Klasse "Raum".
        In den Klassen stehen die Klassenvariablen, bzw. Eigenschaften, die diese Klasse hat. Eine Oberklasse vererbt wie bereits erwähnt diese Eigenschaften an ihre Unterklassen.
        Im MainController werden die Demoobjekte erstellt und die Dienstleistungsmethoden programmiert. Eine Dienstleistungsmethode gibt z.B. etwas aus oder zählt etwas, oder man kann etwas überprüfen. In diesem Code hier wird z.B. das Mindestalter einer Person überprüft, damit die Gruppe, die eine Buchung machen will keine Person dabei hat, die zu Jung für den Escaperoom ist. 
        Auch wird eine Ausgabe erstellt, die überprüft, ob die Lösung die angegeben wird auch die richtige für den jeweiligen Escaperoom ist. Wenn die Lösungsantwort richtig ist, dann hat man den Escaperoom geschafft und gewonnen. Die Lösung wird programmiert mit einer abstrakten Methode.
        
    */



}
