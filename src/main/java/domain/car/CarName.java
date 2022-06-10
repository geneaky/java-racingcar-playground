package domain.car;

public class CarName {

    private final String carName;

    public CarName(String carName) {
        this.carName = carName;
    }

    public static void validateName(String carName) {
        if(carName.length()>5){
            throw new IllegalArgumentException();
        }
    }

    public String getValue() {
        return carName;
    }
}
