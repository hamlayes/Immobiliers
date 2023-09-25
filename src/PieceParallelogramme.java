public class PieceParallelogramme extends Piece {
    private double base;
    private double hauteur;

    public PieceParallelogramme(TypePiece typePiece, String niveau, double base, double hauteur) {
        super(typePiece, niveau);
        this.base = base;
        this.hauteur = hauteur;
    }

     public double surface(){
        double calcul = base*hauteur;
        return calcul;
    }
    
}
