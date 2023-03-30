import java.io.*;
import java.util.Arrays;


public class Yandex {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = reader.readLine();
        int width = Integer.parseInt(line);

        String[] inputs = reader.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        double[] heights = new double[n];

        for (int i = 0; i < n; i++) {
            String[] picture = reader.readLine().split("x");
            int w = Integer.parseInt(picture[0]);
            int h = Integer.parseInt(picture[1]);

            double newHeight = (h * width * 1.0) / w;
            heights[i] = newHeight;
        }

        Arrays.sort(heights);

        double min = sumBetween(heights, 0, k - 1);
        double max = sumBetween(heights, heights.length - k, heights.length - 1);

        writer.write(String.valueOf(Math.round(min)));
        writer.newLine();
        writer.write(String.valueOf(Math.round(max)));

        reader.close();
        writer.close();
    }

    private static double sumBetween(double[] array, int from, int to) {
        double sum = 0;

        for (int i = from; i <= to; i++) {
            sum += array[i];
        }

        return sum;
    }


}
