package view;

import car.Car;
import java.util.List;

public class OutputView {

    private static final String MOVE_SYMBOL = "-";
    private static final String NULL_CHARACTER = "\0";
    private static final String FINAL_WINNERS = "가 최종 우승했습니다.";
    private static final String COLON = " : ";
    private static final String ROUND_RESULT = "실행 결과";
    private static final String ERROR_RESULT = "올바른 값을 입력하여 주십시오.";
    private static final String CAR_NAME_GUIDE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String REPEAT_GUIDE = "시도할 회수는 몇회인가요?.";

    public void roundStart() {
        System.out.println(ROUND_RESULT);
    }

    public void errorPrint() {
        System.out.println(ERROR_RESULT);
    }

    public void carNameGuidePrint() {
        System.out.println(CAR_NAME_GUIDE);
    }

    public void repeatGuidePrint() {
        System.out.println(REPEAT_GUIDE);
    }

    public void printResult(List<Car> cars) {
        for (Car car : cars) {
            String movedDistance = repeat(car.getPosition());
            System.out.println(car.getName() + COLON + movedDistance);
        }

        System.out.println();
    }

    private String repeat(int times) {
        return new String(new char[times]).replace(NULL_CHARACTER, MOVE_SYMBOL);
    }

    public void printWinner(String winnerName) {
        System.out.println(winnerName + FINAL_WINNERS);
    }

}
