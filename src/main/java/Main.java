import domain.car.CarFactory;
import domain.car.Cars;
import domain.judgement.Judgement;
import domain.numbergenerator.RandomGenerator;
import domain.numbergenerator.RandomMoveStrategyImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Scanner sc = new Scanner(System.in);
        String names = sc.next();
        System.out.println("시도할 회수는 몇회인가요?");
        int count = sc.nextInt();

        Runner runner = new Runner(
                new CarFactory(new RandomMoveStrategyImpl()),
                new Judgement(),
                new RandomGenerator()
        );

        runner.start(names,count);
    }
}
