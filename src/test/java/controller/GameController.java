package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 메서드 별 15라인 넘기지 말기
// else 사용하지 말기
public class GameController {

    public List<Integer> generateRandomNumber(int count){
        // 인자 값 만큼 랜덤 숫자를 생성하는 메서드를 의미
        List<Integer> randomNumbers = new ArrayList<>(count);
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        for( int i = 0 ; i < count ; i++ ) {
            int randomNumber = random.nextInt(10);
            randomNumbers.add(i, randomNumber);
        }

        return randomNumbers;
    }



}
