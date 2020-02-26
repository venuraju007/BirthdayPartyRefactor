package scrap.heap.refactor;

import org.junit.Assert;
import org.junit.Test;
import scrap.heap.refactor.constants.*;
import scrap.heap.refactor.domain.*;

public class OrderTest {

    @Test
    public void testOrder() {
        Order order = new Order();
        Assert.assertNull(order.getBalloon());
        Assert.assertNull(order.getCake());

        Balloon balloon = new BalloonBuilder()
                .withColor(Color.RED)
                .withMaterial(Material.MYLAR)
                .withCount(5).build();

        Cake cake = new CakeBuilder()
                .withFlavor(Flavor.VANILLA)
                .withFrostingFlavor(FrostingFlavor.VANILLA)
                .withShape(Shape.CIRCLE)
                .withSize(Size.SMALL)
                .withColor(Color.YELLOW)
                .build();
        order.addBalloon(balloon);
        order.addCake(cake);

        Assert.assertNotNull(order.getBalloon());
        Assert.assertNotNull(order.getCake());

        Assert.assertEquals(order.getBalloon().getColor(), Color.RED);
        Assert.assertEquals(order.getBalloon().getMaterial(), Material.MYLAR);
        Assert.assertEquals(order.getBalloon().getCount(), Integer.valueOf(5));

        Assert.assertEquals(order.getCake().getFlavor(), Flavor.VANILLA);
        Assert.assertEquals(order.getCake().getFrostingFlavor(), FrostingFlavor.VANILLA);
        Assert.assertEquals(order.getCake().getShape(), Shape.CIRCLE);
        Assert.assertEquals(order.getCake().getSize(), Size.SMALL);
        Assert.assertEquals(order.getCake().getColor(), Color.YELLOW);
    }
}
