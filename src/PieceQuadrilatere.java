public class PieceQuadrilatere extends Piece{
    private double val1;
    private double val2;

    public PieceQuadrilatere(TypePiece typePiece, String niveau, double val1, double val2) {
        super(typePiece, niveau);
        this.val1 = val1;
        this.val2 = val2;
    }

    public double surface(){
        double calcul = val1*val2;
        return calcul;
    }
}
