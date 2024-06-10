import java.util.Random;

public class mergeSort2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100000];


        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(10000000);
        }

        System.out.println("Before:");
        for (int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        mergesort(numbers);


        System.out.println("After!");
        for (int i =0; i< numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }



    }

    private static void mergesort(int[] numbers) {
        int inputLength = numbers.length;

        if(inputLength < 2){
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];


        //Llenas los arrays de izquiera y derecha con los valores del array original
        for (int i =0; i < midIndex; i++){
            leftHalf[i] = numbers[i];
        }
        for (int i = midIndex; i < inputLength; i++){
            rightHalf[i - midIndex] = numbers[i];
        }

        mergesort(leftHalf);
        mergesort(rightHalf);

        merge(numbers, leftHalf, rightHalf);



    }

    private static void merge(int[] inputArray, int[]leftHalf, int[]righthalf){
        int leftSize = leftHalf.length;
        int righSize = righthalf.length;

        int i =0, j=0, k=0;

        while(i < leftSize && j < righSize){
            if(leftHalf[i] <= righthalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            }else{
                inputArray[k] = righthalf[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j < righSize){
            inputArray[k] = righthalf[j];
            j++;
            k++;
        }




    }
}
