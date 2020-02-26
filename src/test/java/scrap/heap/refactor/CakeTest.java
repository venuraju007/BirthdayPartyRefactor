package scrap.heap.refactor;

import org.junit.Assert;
import org.junit.Test;
import scrap.heap.refactor.constants.*;
import scrap.heap.refactor.domain.Cake;
import scrap.heap.refactor.domain.CakeBuilder;

public class CakeTest {

    @Test
    public void testCake() {

        Cake cake = new CakeBuilder()
                .withFlavor(Flavor.VANILLA)
                .withFrostingFlavor(FrostingFlavor.VANILLA)
                .withShape(Shape.CIRCLE)
                .withSize(Size.SMALL)
                .withColor(Color.YELLOW)
                .build();

        Assert.assertNotNull(cake);
        Assert.assertEquals(cake.getFlavor(), Flavor.VANILLA);
        Assert.assertEquals(cake.getFrostingFlavor(), FrostingFlavor.VANILLA);
        Assert.assertEquals(cake.getShape(), Shape.CIRCLE);
        Assert.assertEquals(cake.getSize(), Size.SMALL);
        Assert.assertEquals(cake.getColor(), Color.YELLOW);

        Assert.assertNotEquals(cake.getFlavor(), Flavor.CHOCOLATE);
        Assert.assertNotEquals(cake.getFrostingFlavor(), FrostingFlavor.CHOCOLATE);
        Assert.assertNotEquals(cake.getShape(), Shape.SQUARE);
        Assert.assertNotEquals(cake.getSize(), Size.MEDIUM);
        Assert.assertNotEquals(cake.getColor(), Color.BLUE);

    }
}
