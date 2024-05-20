package ch02;

public class TwoDimensionalArrayInitialization {
    public static void main(String[] args) {
        // 3명의 학생과 각 학생의 4과목 점수를 초기화하면서 2차원 배열 선언
        int[][] scores = {
                {90, 80, 70, 60}, // 첫 번째 학생의 점수
                {80, 70, 60, 50}, // 두 번째 학생의 점수
                {70, 60, 50, 40} // 세 번째 학생의 점수
        };

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            int average = 0;
            System.out.println("====" + (i+1) + "번째 학생의 점수====");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println((j+1) +"번째 과목의 점수 : " + scores[i][j]);
                sum += scores[i][j];
                average = sum / scores[i].length;
            }
            System.out.println("총점 : " + sum + "점");
            System.out.println("평균 : " + average + "점");
            System.out.println();
        }
    }
}
