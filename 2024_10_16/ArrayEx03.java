public class ArrayEx03 {
    public static void main(String[] args){
        // 배열의 속성
        // 방의 개수

        int[] arr1 = {10, 20, 30, 40, 50};  // 방의 개수 5개
        int[] arr2 = {10, 20, 30};          // 방의 개수 3개

        // . => 메모리 참조연산자
        System.out.println("개수 : " + arr1.length);
        System.out.println("개수 : " + arr2.length);

        int[] arr3 = new int[10];
        System.out.println("개수 : " + arr3.length);

        // 반복
        /*
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
        */

    
        // 전통적인 for
        // for (int i =0; i < arr1.length; i++) {
        //     System.out.println(arr1[i]);
        // }

        // 향상된 for
        for (int data : arr1) {
            System.out.println(data);
        }
    }
}