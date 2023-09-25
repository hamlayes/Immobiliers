import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PieceParallelogrammeTest {
    @Test
    public void testSurface() {
        TypePiece typePiece = new TypePiece("", true, true);
        PieceParallelogramme piece = new PieceParallelogramme(typePiece, null, 6, 2);

        double test = 6*2;

        assertEquals(null, test,piece.surface(), 0.001);
    }
}
