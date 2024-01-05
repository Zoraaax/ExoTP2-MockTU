package m2i.valentin.tp2.correction;

public class Adresse {
    private int voie;
    private String rue;
    private int codePostal;
    private String ville;
    private String pays;

    public Adresse(int voie, String rue, int codePostal, String ville, String pays) {
        this.voie = voie;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

    public int getVoie() {
        return this.voie;
    }

    public void setVoie(int voie) {
        this.voie = voie;
    }

    public String getRue() {
        return this.rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return this.codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return this.ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return this.pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}

