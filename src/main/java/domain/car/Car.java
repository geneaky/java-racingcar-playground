package domain.car;

import domain.strategy.MoveStrategy;

public class Car {

    private final MoveStrategy moveStrategy;
    private final CarName carName;
    private Position position;

    public Car(CarName carName, MoveStrategy moveStrategy) {
        this.carName = carName;
        this.moveStrategy = moveStrategy;
        this.position = new Position(1);
    }

    public String getCarName() {
        return carName.getValue();
    }

    public Integer getPosition() {
        return position.getValue();
    }


    public String print(String presentation) {
        String ret =  getCarName() + " : ";
        ret = presentPositionBy(ret);
        return ret;
    }

    private String presentPositionBy(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        for(int i = 0; i < getPosition(); i++) {
            strBuilder.append("-");
        }
        return strBuilder.toString();
    }

    public void move(Integer times) {
        this.position = moveStrategy.move(position, times);
    }
}
