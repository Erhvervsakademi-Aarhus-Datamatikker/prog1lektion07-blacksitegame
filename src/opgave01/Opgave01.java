package opgave01;

public class Opgave01 {
    public static void main(String[] args) {
        int[] integerArray = getIntegerArray();

        System.out.println("Opgave A: ");
        OpgaveA(integerArray);
        System.out.println();

        System.out.println("Opgave B: ");
        System.out.println(OpgaveB(integerArray));
        System.out.println();

        System.out.println("Opgave C: ");
        System.out.println(OpgaveC(integerArray));
        System.out.println();

        System.out.println("Opgave D: ");
        int [] resultD = OpgaveD(integerArray);
        OpgaveA(resultD);
        System.out.println();

        System.out.println("Opgave E: ");
        int [] resultE = OpgaveE(integerArray);
        OpgaveA(resultE);





    }

    private static int[] getIntegerArray() {
        int[] integerArray =  { 1095, 12, 9065, 387, 700, 20, 5, 2065, 97654, 103, 789, 50, 1972, 200, 35, 98, 1002 };
        return integerArray;
    }

    public static void OpgaveA (int [] array) {
        for (int i = 0; i < array.length; i++ ){
            System.out.println(array[i]);
        }
    }

    public static int OpgaveB (int [] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum+=array[i];
        }

        return sum;
    }

    public static double OpgaveC (int [] array){
        double sum = 0;
        double average=0;
        for (int i = 0; i < array.length; i++){
            sum+=array[i];
            average=i;
        }
        double average_result = sum/(average+1);
        return average_result;
    }

    public static int[] OpgaveD (int [] array){

        int sum=0;
        int extracted_number;

        for (int i = 0; i < array.length; i++){

                while (array[i] > 0) {
                    extracted_number = array[i] % 10;

                    sum += extracted_number;

                    array[i] /= 10;

                }
                array[i]=sum;
                sum=0;
        }

        return array;
    }

    static public int[] OpgaveE(int [] array) {
        int sum=0;
        int extracted_number;

        for (int i = 0; i < array.length; i++){

            while (array[i] > 0) {
                extracted_number = array[i] % 10;

                sum += extracted_number;

                array[i] /= 10;

            }
            array[i]=sum;
            sum=0;
            while (array[i]>0){
                extracted_number = array[i] % 10;

                sum += extracted_number;

                array[i] /= 10;
            }
            array[i]=sum;
            sum=0;


        }
        return array;
    }
}

