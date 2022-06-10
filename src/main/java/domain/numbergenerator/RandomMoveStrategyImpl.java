package domain.numbergenerator;

import domain.car.Position;
import domain.strategy.MoveStrategy;

public class RandomMoveStrategyImpl implements MoveStrategy {
    @Override
    public Position move(Position position, Integer times) {

        if(times > 4) {
            return new Position(position.getValue() + 1);
        }
        return position;
    }
}
