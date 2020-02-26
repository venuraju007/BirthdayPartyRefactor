package scrap.heap.refactor.domain;

/**
 * Builder for Order object
 * Takes in a Balloon object and Cake object
 */
public class OrderBuilder {

    private Balloon balloon;
    private Cake cake;

    public OrderBuilder withBalloon(Balloon balloon) {
        this.balloon = balloon;
        return this;
    }

    public OrderBuilder withCake(Cake cake) {
        this.cake = cake;
        return this;
    }

    public Order build() {
        Order order = new Order();
        order.addBalloon(this.balloon);
        order.addCake(this.cake);
        return order;
    }
}
