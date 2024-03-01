public class CyclicRotation {

    public int[] solution(int[] A, int K) {

        for (int j = 0; j < K; j++) {
            int lastElement = A[A.length - 1];
            for (int i = A.length - 2; i >= 0; i--) {
                A[i + 1] = A[i];
            }
            A[0] = lastElement;
        }
        return A;
    }
}
