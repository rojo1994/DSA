public class mergeSort {
    public static void main(String[] args) {
        int[] array = {8,2,5,3,4,7,6,1};

        mergesort(array);

        for (int i:array
             ) {
            System.out.print(i + " ");
        }
    }
    private static void mergesort(int[] array) {
        int length = array.length;
        if(length <= 1)return;

        int middle = length / 2;
        int[] leftarray = new int[middle];
        int[] rightarray = new int[length - middle];

        int i = 0; //left
        int j =0; //right

        for (;i < length;i++){
            if (i < middle){
                leftarray[i] = array[i];
            }else{
                rightarray[j] = array[i];
                j++;
            }
        }

        mergesort(leftarray);
        mergesort(rightarray);
        merge(leftarray, rightarray, array);

    }

    private static void merge(int[]leftarray, int[] rightarray, int[] array){

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

        //Check the conditions for merging

        while(l < leftSize && r < rightSize){
            if(leftarray[l] < rightarray[r]){
                array[i] = leftarray[l];
                i++;
                l++;
            }else{
                array[i] = rightarray[r];
                i++;
                r++;
            }
        }

        while (l < leftSize) {
            array[i] = leftarray[l];
            i++;
            l++;

        }

        while(r < rightSize){
            array[i] = rightarray[r];
            i++;
            r++;
        }
    }


}
