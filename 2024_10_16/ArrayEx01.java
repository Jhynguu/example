public class ArrayEx01 {
    public static void main(String[] args) {
        // 배열
        // 선언
        // 정수형 배열 arr1 선언
        int[] arr1;
        int arr2[];

        // 생성
        // 사용
        arr1 = new int[10];
        arr2 = new int[30];

        // 사용
        // 초기화
        // index 번호 - 0부터 시작
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[9] = 100;

        // runtime(실행 오류)
        // arr1[10] = 110;

        // 배열의 내용 출력
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[9]);

        // runtime(실행 오류)
        // System.out.println(arr1[12]);

        // 선언과 생성
        int[] arr3 = new int[3];
        arr3[0] = 10;
        arr3[1] = 20;
        arr3[2] = 30;

        System.out.println(arr3[0]);
    }
}