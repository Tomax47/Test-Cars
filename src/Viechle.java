public abstract class Viechle {
    private String model;
    private int price;
    private CarSpec spec;

    public Viechle(String model, int price, CarSpec spec) {
        this.model = model;
        this.price = price;
        this.spec = spec;
    }

    public CarSpec getSpec(){
        return spec;
    }
}
