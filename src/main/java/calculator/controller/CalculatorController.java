package calculator.controller;

import calculator.model.Calculator;
import calculator.view.InputView;
import calculator.view.OutputView;

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
     */
    public void run() {

    }
}
