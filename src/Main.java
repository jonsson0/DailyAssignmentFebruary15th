public class Main {


    public static void main(String[] args) {

        System.out.println(sumBetweenOneToN(-9));

    }


    public static int sumBetweenOneToN(int n) {
        int startPlace = 1;
        int sum = 0;

        if (n > startPlace) {
            for (int i = 2; i < n; i++) {
               int startPlaceTemp = startPlace*i;
                sum = sum + startPlaceTemp;
            }
        }
        if (n < startPlace) {
            for (int i = 0; i > n; i--) {
                int startPlaceTemp = startPlace*i;
                sum = sum - startPlaceTemp;
            }
            sum = -sum;
        }
        return sum;
    }
}