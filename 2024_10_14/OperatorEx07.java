public class OperatorEx07 {
    public static void main(String[] args) {
        // 비교연산자 => 제어문
        // >, <, >=, <=, ==, !=
        // 논리값(true / false)
        
        System.out.println(10 == 5);
        System.out.println(10 != 5);
        
        System.out.println(10 < 5);
        System.out.println(10 > 5);

        // 비교의 연결
        // 논리연산자

        // 논리합(|| : pipe)
        // 둘 중에 한 개가 참이면 참
        // true || ture => true 
        // false || false => false

        // 논리곱(&&)
        // 둘 중에 모두 참이면 참
        // true && true => true
        // true && false => false

        boolean bool1 = (10 > 3); // true
        boolean bool2 = (3 > 10); // false

        System.out.println( bool1 || bool2);
        System.out.println( bool1 && bool2);
    }
}