import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PieceTriangulaireTest {
    @Test
    public void testSurface() {
         TypePiece typePiece = new TypePiece("", true, true);
        PieceTriangulaire piece = new PieceTriangulaire(typePiece, null, 3, 6);

        double test = 3*6*0.5;

        assertEquals(null, test,piece.surface(), 0.001);

    }
}
