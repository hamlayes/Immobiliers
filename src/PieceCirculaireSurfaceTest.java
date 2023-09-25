import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PieceCirculaireSurfaceTest {
    @Test
    public void testSurface() {
        TypePiece typePiece = new TypePiece("", true, true);
        PieceCirculaire piece = new PieceCirculaire(null, null, 5);

        double test = Math.PI * Math.pow(5, 2);

        assertEquals(null, test,piece.surface(), 0.001);
    }
}
