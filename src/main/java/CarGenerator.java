import java.util.ArrayList;
import java.util.List;

public class CarGenerator {

    public Cars generate(String names) {

        String[] nameList = names.split(",");
        List<Car> carList = new ArrayList<>();

        for(String name : nameList) {
            if(name.length() >= 5) {
                throw new IllegalArgumentException();
            }

            carList.add(new Car(name));
        }

        return new Cars(carList);
    }
}
