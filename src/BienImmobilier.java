import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class BienImmobilier {
    
    private String rue;
    private String ville;
    private String codePostal;
    private Vendeur vendeur;
    private ArrayList<Piece> desPieces;


    public BienImmobilier(String rue, String ville, String codePostal, Vendeur vendeur) {
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.vendeur = vendeur;
        this.desPieces = new ArrayList<>();
    }

    public ArrayList<Piece> getDesPieces() {
        return desPieces;
    }

    public double surfaceHabitable(){
        
      double surfaceTotale = 0.0;
        for (Piece piece : desPieces) {
            if (piece.getTypePiece().isSurfaceHabitable() ) {
            surfaceTotale += piece.surface();
            }
        }
        return surfaceTotale;
    }
     public double surfaceNonHabitable(){
        double surfaceTotale = 0.0;
        for (Piece piece : desPieces) {
            if (piece.getTypePiece().isSurfaceHabitable() ) {
            surfaceTotale += piece.surface();
            }
        }
        return surfaceTotale;
    }
    
    public void ajouterPiece(Piece piece){
        desPieces.add(piece);
    }

    @Override
    public String toString(){
        DecimalFormat numberFormat = new DecimalFormat("#.00&");
         return "\nLocalisation : " +rue + " " + codePostal+ " " + ville +
        "\n \n Description du bien : \n" +
        desPieces.toString() + 
        "\nPour une surface habitable de : " +
        numberFormat.format(surfaceHabitable())+
        "m2 et une surface non habitable de : " +
        numberFormat.format(surfaceNonHabitable())+" m2.";
    }

    public Vendeur getVendeur() {
        return vendeur;
    }


    
}
