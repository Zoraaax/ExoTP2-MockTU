package m2i.valentin.tp2.correction;

public abstract class Salarie {
    private final Salaire salaire;
    private final Identite identite;

    public Salarie(Salaire salaire, Identite identite) {
        this.salaire = salaire;
        this.identite = identite;
    }

    public void demenager(Adresse adresse) {
        this.identite.setAdresse(adresse);
    }

    public void augmenter(double pourcentage) {
        double augmentation = this.salaire.getTauxHoraire() * pourcentage / 100;
        double nouveauSalaire = this.salaire.getTauxHoraire() + augmentation;

        this.salaire.setTauxHoraire(nouveauSalaire);
    }

    public void travailler(double heures) {
        double salaire = this.salaire.payer(heures);
        System.out.println("Il a gagné " + salaire + "ce mois-ci");
    }

    public void travailler() {
        this.travailler(151.67);
    }
}
