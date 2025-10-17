package calculator.model;

/**
 * 문자열을 입력받아 덧셈 계산을 수행하는 클래스입니다.
 */
public class Calculator {
    public Calculator() {
    }

    /**
     * 입력 문자열을 파싱하여 합산 결과를 반환.
     * @param input 계산식 문자열
     * @return 계산된 정수 합
     * @throws IllegalArgumentException 잘못된 형식, 음수 입력, 잘못된 구분자 등이 존재할 때 발생
     */
    public int calculate(String input) {
        int result = 0;

        if (input == null || input.isEmpty()) {
            return 0;
        }

        String regex = "[,:]";

        if(input.startsWith("//")) {
            int newLineIndex=input.indexOf("\n");
            if (newLineIndex > 2) {
                String custom = input.substring(2, newLineIndex);
                regex = "[,:" + custom + "]";
                input = input.substring(newLineIndex + 1);
            } else {
                throw new IllegalArgumentException("잘못된 커스텀 구분자 입력");
            }
        }

        String []splitted = input.split(regex);

        for (String s: splitted) {
            if (s.startsWith("-")) {
                throw new IllegalArgumentException("음수는 허용되지 않는다." + Integer.parseInt(s));
            }
            else if(s.isEmpty()) {
                throw new IllegalArgumentException("연속적으로 등장한 구분자 에러");
            }
            else {
                result += Integer.parseInt(s);
            }
        }
        return result;
    }
}
