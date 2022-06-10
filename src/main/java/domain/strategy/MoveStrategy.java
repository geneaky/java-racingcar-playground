package domain.strategy;

import domain.car.Position;

@FunctionalInterface
public interface MoveStrategy {

    Position move(Position position, Integer times);
}
