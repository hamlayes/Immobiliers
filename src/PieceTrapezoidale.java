public class PieceTrapezoidale extends Piece {
    private double grandeBase;
    private double base;
    private double hauteur;

    public PieceTrapezoidale(TypePiece typePiece, String niveau, double grandeBase, double base, double hauteur) {
        super(typePiece, niveau);
        this.grandeBase = grandeBase;
        this.base = base;
        this.hauteur = hauteur;
    }

     public double surface(){
        double calcul = 1/2*hauteur*(grandeBase*base);
        return calcul;
    }
}
