package calculator.controller;

import calculator.model.Calculator;
import calculator.view.InputView;
import calculator.view.OutputView;

import java.util.NoSuchElementException;

/**
 * 계산기 프로그램의 흐름을 제어하는 컨트롤러 클래스입니다.
 */
public class CalculatorController {

    private final InputView inputView;
    private final OutputView outputView;
    private final Calculator calculator;

    public CalculatorController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.calculator = new Calculator();
    }

    /**
     * 계산기 프로그램을 실행합니다.
     * 사용자로부터 입력을 받고 결과를 출력합니다.
     * @throws NoSuchElementException 콘솔 입력이 존재하지 않을 경우 발생
     */
    public void run() {
        try {
            String input = inputView.readInput();

            // '\n' 문자열을 실제 개행 문자로 변환
            input = input.replace("\\n", "\n");

            int result = calculator.calculate(input);
            outputView.printResult(result);

        } catch (NoSuchElementException e) {
            outputView.printResult(0);
        }
    }
}
