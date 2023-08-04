package model;

import java.util.*;

public class CarCollection {
    private final List<Car> cars;

    public CarCollection(List<Car> cars) {
        this.cars = cars;
    }

    public List<String> checkWinner() {
        // 구성된 Car의 position을 확인하고
        // 최대 position을 구해야 한다
        List<String> carNames = new ArrayList<>();
        Car maxCar = Collections.max(cars, this::compare);
        for (Car car : cars) {
            if( car.getPosition() == maxCar.getPosition() ){
                carNames.add(car.getName());
            }
        }
        return carNames;
    }

    public int compare(Car C1, Car c2) {
        return C1.getPosition() - c2.getPosition();
    }
}
