package m2i.valentin.tp2.classes.salaire;

public class Salaire {

    /**
     * Base de 151 heures travaillées.
     */
    public static final double HEURES_TRAVAILLEES_MENSUEL_BASE = 151.67;
    /**
     * Seuil minimum de paiement pour le taux horaire.
     */
    public static final double TAUX_HORAIRE_MINIMUM = 8.8;
    public static final double PAIEMENT_HEURES_SUPPLEMENTAIRES = 1.25;
    private double tauxHoraire;

    public double getTauxHoraire() {
        return this.tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) throws IllegalArgumentException {

        if (tauxHoraire < TAUX_HORAIRE_MINIMUM) {
            throw new IllegalArgumentException("On est pas esclave non plus");
        }

        this.tauxHoraire = tauxHoraire;
    }

    /**
     * Paie le salarié en fonction de son temps temps de travail.
     * @param heureTravaillees
     * @return double - heuresTravaillees
     * @throws IllegalArgumentException
     */
    public double payer(double heureTravaillees) throws IllegalArgumentException {
        if (heureTravaillees < 0) {
            throw new IllegalArgumentException("Faut virer Michel il branle rien");
        }

        return calculerSalaire(heureTravaillees);
    }

    /**
     * Calcule le salaire en fonction du temps travaillé.
     * Applique un taux spécifique en cas de dépassement des 151 heures de base.
     * @param heuresTravaillees
     * @return double - heuresTravaillees
     */
    private double calculerSalaire(double heuresTravaillees) {
        if (heuresTravaillees > HEURES_TRAVAILLEES_MENSUEL_BASE) {
            double salaire = 0;
            salaire += HEURES_TRAVAILLEES_MENSUEL_BASE * this.tauxHoraire;
            salaire += (heuresTravaillees - HEURES_TRAVAILLEES_MENSUEL_BASE) * this.tauxHoraire * PAIEMENT_HEURES_SUPPLEMENTAIRES;

            return salaire;
        }

        return heuresTravaillees * this.tauxHoraire;
    }
}
