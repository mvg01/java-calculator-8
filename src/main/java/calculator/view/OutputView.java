package calculator.view;

/**
 * 결과 및 에러 메시지 출력을 담당하는 클래스입니다.
 */
public class OutputView {
    public OutputView() {
    }

    /**
     * 계산 결과를 출력합니다.
     * @param result 계산 결과
     */
    public void printResult(int result) {
        System.out.println("결과 : " + Integer.toString(result));
    }

    /**
     * 에러 메시지를 출력합니다.
     * @param message 에러 메시지
     */
    public void printError(String message) {
        System.out.println("에러 : " + message);
    }
}
