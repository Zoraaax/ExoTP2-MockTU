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
     * Fait travailler le salarié et le paie pour son travail.
     * @param heures
     */
    public void travailler(double heures) {
        double paye = salaire.payer(heures);
        System.out.println("Le salarié a travaillé " + heures + " heures " + "et a été payé " + paye + "€");
    }

    /**
     * Fait travailler le salarié et le paie sur une base de 151.67 heures pour son travail.
     */
    public void travailler() {
        this.travailler(151.67);
        System.out.println("Le salarié " + this.getIdentite().getNom() + this.getIdentite().getPrenom() + "a travaillé 151.67 heures et a été payé " + salaire.payer(151.67) + "€");
    }

    /**
     * Augmente le salaire du salarié.
     * @param pourcentage
     * @return double - salaire
     */
    public double augmenter(double pourcentage) {
        double nouveauTauxHoraire = this.getSalaire().getTauxHoraire() * (1 + pourcentage / 100);
        this.getSalaire().setTauxHoraire(nouveauTauxHoraire);

        return nouveauTauxHoraire;
    }
}
