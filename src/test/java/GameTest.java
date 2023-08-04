import controller.GameController;
import model.Car;
import model.CarCollection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class GameTest {

    GameController gc = new GameController();

    @Test
    @DisplayName("난수가_제대로_생성되는지를_확인")
    void makeRandomNumbers() {
        List<Integer> integers = gc.generateRandomNumber(5);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        // 0-9 범위에 맞는 수들로 구성되어있는지 확인하는 테스트 코드가 필요하다
//        Assertions.assertThat(integers).

    }

    @Test
    @DisplayName("우승자를_확인합니다")
    void checkWinner() {
        List<Car> cars = Arrays.asList(new Car("pobi"),
                new Car("woni"),
                new Car("jun"));

        cars.get(0).moveForward();
        cars.get(0).moveForward();
        cars.get(2).moveForward();

        CarCollection carCollection = new CarCollection(cars);
        List<String> winners = carCollection.checkWinner();

        assertThat(winners).containsExactly(cars.get(0).getName(),
                cars.get(1).getName(), cars.get(2).getName());
        // 0-9 범위에 맞는 수들로 구성되어있는지 확인하는 테스트 코드가 필요하다
//        Assertions.assertThat(integers).

    }


}
