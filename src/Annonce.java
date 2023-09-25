import java.text.DecimalFormat;

public class Annonce {
    private String reference;
    private String date;
    private String titre;
    private double prixM2Habitable;
    private BienImmobilier logement;
    private double COEF_NON_HABITABLE = 0.25;


   
    
    public Annonce(String reference, String date, String titre, double prixM2Habitable, BienImmobilier logement) {
        this.reference = reference;
        this.date = date;
        this.titre = titre;
        this.prixM2Habitable = prixM2Habitable;
        this.logement = logement;
    }

    public double prix(){
        double resultat;
        resultat = logement.surfaceHabitable() * prixM2Habitable + logement.surfaceNonHabitable()*prixM2Habitable*COEF_NON_HABITABLE;
        return resultat;
    }

    @Override
    public String toString(){
        DecimalFormat numberFormat = new DecimalFormat("#.00&");
        return titre +"\n " + "Annonce " + reference + " du " +date+ "\n Appartement "+logement.toString() + "\n"
        + "- Prix du m2 habitable : "+ prixM2Habitable+" euros\n" 
        + "- Prix du m2 non habitable : "+ prixM2Habitable*COEF_NON_HABITABLE+" euros"
        + "\nValeur du bien : " + numberFormat.format(prix()) + "\n"
        + "Contact :" + logement.getVendeur().getEmail() + " / " + logement.getVendeur().getNumeroTelephone();
    }
    
}
