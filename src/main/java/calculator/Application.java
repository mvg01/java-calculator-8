package calculator;

import calculator.controller.CalculatorController;

/**
 * 계산기 프로그램을 실행하는 애플리케이션의 진입점입니다.
 */
public class Application {
    public static void main(String[] args) {
        CalculatorController controller = new CalculatorController();
        controller.run();
    }
}
