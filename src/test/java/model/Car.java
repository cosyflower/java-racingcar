package model;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현하는 구간
    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
    // 앞으로 전진한다
    public void moveForward(){
        this.position++;
    }

    // 멈춘다 ( 전진하지 않는 경우라고 생각해서 메서드를 따로 추가하지는 않았다 )
}
