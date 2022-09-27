package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Component
public class CarDAO {

    private static List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "VW", "wagon"));
        cars.add(new Car(2, "Audi", "coupe"));
        cars.add(new Car(3, "Nissan", "hatchback"));
        cars.add(new Car(4, "Лада", "седан"));
        cars.add(new Car(5, "УАЗ", "внедорожник"));
    }

    public List<Car> index() {

        return cars;
    }

    public Car show(int article) {
        return cars.stream().filter(car -> car.getArticle() == article)
                .findAny().orElse(null);
    }
}
