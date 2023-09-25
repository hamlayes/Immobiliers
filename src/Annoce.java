public class Annoce {
    private String reference;
    private String date;
    private String titre;
    private double prixM2Habitable;
    private BienImmobilier logement;
    private double COEF_NON_HABITABLE = 0.25;


    public Annoce(String reference, String date, String titre, double prixM2Habitable, BienImmobilier logement,
            double cOEF_NON_HABITABLE) {
        this.reference = reference;
        this.date = date;
        this.titre = titre;
        this.prixM2Habitable = prixM2Habitable;
        this.logement = logement;
        COEF_NON_HABITABLE = cOEF_NON_HABITABLE;
    }

    
}
