package m2i.valentin.tp2.correction;

public class Salaire {

    private static final double NOMBRES_HEURES_MENSUELLES_BASE = 151.67;
    private double tauxHoraire;

    public Salaire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public double payer(double nombresHeures) {
        if (nombresHeures < NOMBRES_HEURES_MENSUELLES_BASE) {
            return calculerSalaireSansMajoration(nombresHeures);
        }

        return (double) Math.round(calculerSalaireAvecMajoration(nombresHeures) + calculerSalaireSansMajoration(NOMBRES_HEURES_MENSUELLES_BASE) * 100) / 100;
    }

    private double calculerSalaireAvecMajoration(double nombresHeures) {
        double heuresExcendentaires = nombresHeures - NOMBRES_HEURES_MENSUELLES_BASE;
        return (double) Math.round(heuresExcendentaires * tauxHoraire * 1.25 * 100) / 100;
    }

    private double calculerSalaireSansMajoration(double nombresHeures) {
        return (double) Math.round(tauxHoraire * nombresHeures * 100) / 100 ;
    }

    public double payer() {
        return this.payer(NOMBRES_HEURES_MENSUELLES_BASE);
    }


}
