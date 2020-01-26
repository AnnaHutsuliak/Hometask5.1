package epam.com;
import java.util.Arrays;
public class Task {
    public static void main(String[] args) {
        double[] firstArray = new double[]{Math.random() * 100, 2, 15, 10, 35, 12, Math.random() * 100};
        System.out.println("перший масив = " + Arrays.toString(firstArray));

        double[] secondArray = new double[7];
        secondArray[0] = 10;
        secondArray[1] = 0;
        secondArray[2] = 1;
        secondArray[3] = 100;
        secondArray[4] = 5;
        secondArray[5] = -1;
        secondArray[6] = -10;
        System.out.println("другий масив = " + Arrays.toString(secondArray));

        int[] thirdArray = new int[7];
        for (int i = 0; i < thirdArray.length; i++)
            thirdArray[i] = (int) firstArray[i] + (int) secondArray[i];
        System.out.println("сума = " + Arrays.toString(thirdArray));
    }
}
