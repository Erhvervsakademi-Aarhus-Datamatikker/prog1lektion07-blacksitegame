package Opgave05;

public class opgave05 {
    public static void main(String[] args) {
        int[] table = new int[10];
        for (int i = 0; i < table.length; i++) {
            table[i] = (int) (Math.random() * 1000);
        }

        int[] result = BubbleSort(table);

        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }
    }

    public static int[] BubbleSort(int[] table) {

        int[] result = new int[table.length];

        for (int i = 0; i < table.length; i++) {
            result[i]=table[i];
            for (int j = 0; j < table.length - 1 - i; j++) {
                if (table[j] > table[j + 1]) {
                    int temp = table[j];
                    table[j] = table[j + 1];
                    table[j + 1] = temp;

                    temp = result[j];

                }

                else {
                    result[j] = table[j];
                }
            }

        }
        return result;
    }
}
