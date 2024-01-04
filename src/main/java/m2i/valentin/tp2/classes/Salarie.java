package m2i.valentin.tp2.classes;

public abstract class Salarie {
    private Salaire salaire;
    private Identite identite;

    public Salaire getSalaire() {
        return this.salaire;
    }

    public void setSalaire(Salaire salaire) {
        this.salaire = salaire;
    }

    public Identite getIdentite() {
        return this.identite;
    }

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }

    /**
     * Déménage le salarié à une nouvelle adresse.
     * @param nouvelleAdresse
     */
    public void demenager(Adresse nouvelleAdresse) {
        this.getIdentite().setAdresse(nouvelleAdresse);
        System.out.println(this.getIdentite().getNom() + this.getIdentite().getPrenom() + "Déménage à " + nouvelleAdresse.getVille());
    }

    /**
     * Fait travailler le salarié.
     * @param heures
     */
    public void travailler(int heures) {
        System.out.println(this.getIdentite().getNom() + this.getIdentite().getPrenom() + "Travaille " + heures + " heures");
    }

    /**
     * Augmente le salaire du salarié.
     * @param pourcentage
     * @return double - salaire
     */
    public double augmenter(double pourcentage) {
        double salaire = this.getSalaire().getTauxHoraire();
        salaire += salaire * pourcentage / 100;
        this.getSalaire().setTauxHoraire(salaire);

        return salaire;
    }
}
