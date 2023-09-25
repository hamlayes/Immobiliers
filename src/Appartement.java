public class Appartement extends BienImmobilier{

    private String etage;
    private boolean ascenseur;
  
    public Appartement(String rue, String ville, String codePostal, Vendeur vendeur, String etage) {
        super(rue, ville, codePostal, vendeur);
        this.etage = etage;
    }

    public Appartement(String rue, String ville, String codePostal, Vendeur vendeur, String etage, boolean ascenseur) {
        super(rue, ville, codePostal, vendeur);
        this.etage = etage;
        this.ascenseur = ascenseur;
    }

    public String typeBien(){
        int nombreDePiecesComptabilisees = 0;
        
        for (Piece piece : getDesPieces() ) {
            TypePiece typePiece = piece.getTypePiece();
            if (typePiece.isPiece()) {
                nombreDePiecesComptabilisees++;
            }
        }

        if (nombreDePiecesComptabilisees <= 7) {
            return "T" + nombreDePiecesComptabilisees;
        } else {
            return "T7+";
        }

    }




    @Override
    public String toString(){
        String resultat ="";
        resultat = "Appartement de type "+ typeBien();
        if(ascenseur){
            resultat += " avec ascenseur ";
        }
        resultat += " situé au " + etage + " ";
        resultat += super.toString();
        return resultat;
    }
    
}
