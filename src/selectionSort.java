public class selectionSort {
    public static void main(String[] args) {
        int[] array = {8,7,9,2,3,1,5,4,6};

        selectionsort(array);

        for (int i: array
             ) {
            System.out.print(i + " ");

        }
    }

    private static void selectionsort(int[] array) {
        for (int i = 0; i < array.length; i++){
            int min = i;
            for (int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]) {
                    min = j;

                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

    }
}
