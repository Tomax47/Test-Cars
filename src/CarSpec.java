public class CarSpec {

    private String bodyType;
    private String engineType;
    private String transmission;
    private String color;

    public CarSpec(String bodyType, String engineType, String transmission, String color) {
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.transmission = transmission;
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    public boolean matches(CarSpec otherSpec) {
        if (bodyType != "" && bodyType != otherSpec.getBodyType()) {
            return false;
        }
        if (engineType != " " && engineType != otherSpec.getEngineType()){
            return false;
        }
        if (transmission != " " && transmission != otherSpec.getTransmission()){
            return false;
        }
        if (color != " " && color != otherSpec.getColor()){
            return false;
        }
        return true;
    }

}
