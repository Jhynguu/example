public class OperatorEx04 {
    public static void main(String[] args) {
        // 기본자료형 : + => 산술 
        // 문자열 : + => 문자열 연결 연산자

        // 문자열 - 문자열 연결 +
        System.out.println("1" + "1");
        // 숫자 - 산술 +
        System.out.println(1 + 1);

        // 결과 예상 => () 연산자 우선순위
        // 누구나 쉽게 읽을 수 있게
        // 111
        System.out.println("1" + (1 + 1));
        // 111
        System.out.println(1 + "1" + 1);
        // 21
        System.out.println(1 + 1 + "1");
    }
}