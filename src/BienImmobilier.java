import java.util.ArrayList;

public class BienImmobilier {
    
    private String rue;
    private String ville;
    private String codePostal;
    private Vendeur vendeur;
    private ArrayList Piece;

    
    public BienImmobilier(String rue, String ville, String codePostal, Vendeur vendeur, ArrayList piece) {
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.vendeur = vendeur;
        Piece = piece;
    }

    
}
