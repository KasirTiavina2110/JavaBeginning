package pkgLaboratoire2;

public class Temps {
    // Variables d'instance de la classe
    private int heure;
    private int minute;
    private int seconde;

    // Constructeurs
    public Temps() {
        // Par défaut, une nouvelle instance est initialisée à 00:00:00
        this.heure = 0;
        this.minute = 0;
        this.seconde = 0;
    }

    public Temps(int heure, int minute, int seconde) {
        setHeure(heure);
        setMinute(minute);
        setSeconde(seconde);
    }

    // Méthodes d'accès
    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        if (heure < 0 || heure > 24) {
            throw new TempsErreur("L'heure doit être comprise entre 0 et 24.");
        }
        this.heure = heure;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new TempsErreur("La minute doit être comprise entre 0 et 59.");
        }
        this.minute = minute;
    }

    public int getSeconde() {
        return seconde;
    }

    public void setSeconde(int seconde) {
        if (seconde < 0 || seconde >= 60) {
            throw new TempsErreur("La seconde doit être comprise entre 0 et 59.");
        }
        this.seconde = seconde;
    }

    // Méthodes de service publiques
    public String afficherHeureUniverselle() {
        return String.format("%02d:%02d:%02d", heure, minute, seconde);
    }

    public String afficherHeure12H() {
        int heure12H = (heure == 0 || heure == 12) ? 12 : heure % 12;
        String amPm = (heure < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", heure12H, minute, seconde, amPm);
    }

    // Méthode toString pour afficher tous les attributs
    @Override
    public String toString() {
        return "Heure : " + afficherHeureUniverselle();
    }
}
