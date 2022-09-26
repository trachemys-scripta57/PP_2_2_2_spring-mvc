package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private static int CAR_COUNT;

    private List<Car> cars;
    {
        cars = new ArrayList<>();

        cars.add(new Car(++CAR_COUNT, "VW", "wagon"));
        cars.add(new Car(++CAR_COUNT, "Audi", "coupe"));
        cars.add(new Car(++CAR_COUNT, "Nissan", "hatchback"));
        cars.add(new Car(++CAR_COUNT, "Лада", "седан"));
        cars.add(new Car(++CAR_COUNT, "УАЗ", "внедорожник"));
    }
    public List<Car> index() {
        return cars;
    }

    public Car show(int article) {
        return cars.stream().filter(car -> car.getArticle() == article)
                .findAny().orElse(null);
    }
}
