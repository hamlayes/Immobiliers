import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PieceQuadrilatereTest {
    @Test
    public void testSurface() {
        TypePiece typePiece = new TypePiece("", true, true);
        PieceQuadrilatere piece = new PieceQuadrilatere(typePiece, null, 2, 2);

        double test = 2*2;

        assertEquals(null, test,piece.surface(), 0.001);

    }
}
