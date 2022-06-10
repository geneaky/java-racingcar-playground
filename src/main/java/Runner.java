import domain.car.Car;
import domain.car.CarFactory;
import domain.car.Cars;
import domain.judgement.Judgement;
import domain.numbergenerator.RandomMoveStrategyImpl;
import domain.strategy.Generator;

public class Runner {
     private final CarFactory carFactory ;
     private final Judgement judgement;
     private final Generator randomGenerator;

    public Runner(CarFactory carFactory, Judgement judgement, Generator randomGenerator) {
        this.carFactory = carFactory;
        this.judgement = judgement;
        this.randomGenerator = randomGenerator;
    }

    public void start(String names, int count) {
        System.out.println("실행 결과");
        Cars cars = carFactory.generateCars(names);

        for(int i = 0; i < count; i++){
            for(Car car : cars.getValue()) {
                car.move(randomGenerator.generate());
                System.out.println(car.print("-"));
            }
            System.out.println();
        }

        System.out.println(judgement.judge(cars));
    }
}
