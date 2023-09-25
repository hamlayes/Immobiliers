import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PieceTrapezoidaleTest {
    @Test
    public void testSurface() {
        TypePiece typePiece = new TypePiece("", true, true);
        PieceTrapezoidale piece = new PieceTrapezoidale(null, null, 5, 2, 4);

        double test = 1/2*4*(5*2);

        assertEquals(null, test,piece.surface(), 0.001);

    }
}
