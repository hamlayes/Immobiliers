public class PieceCirculaire extends Piece {
    private double rayon;

    public PieceCirculaire(TypePiece typePiece, String niveau, double rayon) {
        super(typePiece, niveau);
        this.rayon = rayon;
    }

    public double surface(){
        double calcul = Math.PI*Math.pow(rayon, 2);
        return calcul;
    }
}
