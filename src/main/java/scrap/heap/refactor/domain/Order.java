package scrap.heap.refactor.domain;

public class Order {

    private Balloon balloon;
    private Cake cake;

    public void addBalloon(Balloon balloon) {
        this.balloon = balloon;
    }

    public Balloon getBalloon() {
        return balloon;
    }

    public void addCake(Cake cake) {
        this.cake = cake;
    }

    public Cake getCake() {
        return cake;
    }

    public void order() {
        System.out.println("======= Order Details =======");
        System.out.println(this.balloon.toString());
        System.out.println(this.cake.toString());
        System.out.println();
    }
}
