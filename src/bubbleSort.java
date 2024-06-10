public class bubbleSort {
    public static void main(String[] args) {
        int[] array = {1,8,9,2,7,3,6,4,5};

        bubblesort(array);

        for (int i :array
             ) {
            System.out.print(i + " ");
        }

    }

    private static void bubblesort(int[] array) {
        for (int i = 0; i< array.length - 1; i++){
            for (int j = 0; j<array.length - i - 1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
        }

    }


}
