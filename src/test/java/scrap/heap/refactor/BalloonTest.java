package scrap.heap.refactor;

import org.junit.Assert;
import org.junit.Test;
import scrap.heap.refactor.constants.Color;
import scrap.heap.refactor.constants.Material;
import scrap.heap.refactor.domain.Balloon;
import scrap.heap.refactor.domain.BalloonBuilder;

public class BalloonTest {

    @Test
    public void testBalloon() {

        Balloon balloon = new BalloonBuilder()
                .withColor(Color.BLUE)
                .withMaterial(Material.LATEX)
                .withCount(12)
                .build();

        Assert.assertNotNull(balloon);
        Assert.assertEquals(balloon.getColor(), Color.BLUE);
        Assert.assertEquals(balloon.getMaterial(), Material.LATEX);
        Assert.assertEquals(balloon.getCount(), Integer.valueOf(12));

        Assert.assertNotEquals(balloon.getColor(), Color.RED);
        Assert.assertNotEquals(balloon.getMaterial(), Material.MYLAR);
        Assert.assertNotEquals(balloon.getCount(), Integer.valueOf(1));

        Balloon balloonInComplete = new BalloonBuilder()
                .withColor(Color.BLUE).withCount(6).build();
        Assert.assertEquals(balloonInComplete.getMaterial(), Material.EMPTY);
    }
}
