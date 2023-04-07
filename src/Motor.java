public class Motor {
    private String model;
    private int price;
    private int maxSpeed;
    private int fuelBurn;
    private int passengersNum;
    private CarSpec spec;

//    public Motor(String model, int price, CarSpec spec) {
//        super(model, price,spec);
//    }
    public Motor(String model, int price, int maxSpeed, int fuelBurn, int passengersNum, CarSpec spec) {
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelBurn = fuelBurn;
        this.passengersNum = passengersNum;
        this.spec = spec;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getFuelBurn() {
        return fuelBurn;
    }

    public int getPassengersNum(){
        return passengersNum;
    }

    public CarSpec getSpec() {
        return spec;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setFuelBurn(int fuelBurn) {
        this.fuelBurn = fuelBurn;
    }

    public void setPassengersNum(int passengersNum) {
        this.passengersNum = passengersNum;
    }

    public void setSpec(CarSpec spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "\nmodel= " + model + '\'' + "\n price= " + price +
                "\n maxSpeed=" + maxSpeed +
                "\n fuelBurn=" + fuelBurn +
                "\n passengersNum=" + passengersNum +
                "\n spec=" + spec;
    }
}
