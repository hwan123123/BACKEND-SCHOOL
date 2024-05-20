package ch02;

//class ListPrimes {
//    public static void main(String[] args) {
//        int divisionCount = 0; // 나눗셈 연산 횟수 카운터
//        for (int num = 2; num <= 1000; num++) {
//            boolean isPrime = true; // 소수 여부를 판단할 변수, 초기값은 true
//            for (int divisor = 2; divisor < num; divisor++) {
//                divisionCount++;
//                if (num % divisor == 0) { // 나누어 떨어지면 소수가 아님
//                    isPrime = false; // 소수가 아니라고 표시
//                    break; // 더 이상의 검사는 불필요하므로 반복 중단
//                }
//            }
//            if (isPrime) { // 소수인 경우 출력
//                System.out.println(num);
//            }
//        }
//        System.out.println("나눗셈 연산을 수행한 횟수: " + divisionCount);
//    }
//}
public class ListPrimes {
    public static void main(String[] args) {
        int divisionCount = count(2, 1000);
        System.out.println("나눗셈 연산을 수행한 횟수: " + divisionCount);
    }

    static int count(int start_num, int end_num) {
        int divisionCount = 0;
        for (int num = start_num; num <= end_num; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
            divisionCount++;
        }
        return divisionCount;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}