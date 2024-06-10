public class interpolationSearch {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};

        int index = interpolationsearch(array, 8);

        if (index != -1){
            System.out.println("Element found at: index : "+ index);
        }else{
            System.out.println("Element not found");
        }
    }

    private static int interpolationsearch(int[] array, int target) {
        int high = array.length -1;
        int low = 0;

        while (target >= array[low] && target <= array[high] && low <= high) {

            int probe = low + (high - low) * (target - array[low]) /
                    (array[high] - array[low]);

            System.out.println("Probe: " + probe);

            if(array[probe] == target){
                return probe;
            }else if(array[probe] < target){
                low = probe +1;
            }else{
                high = probe -1;
            }
        }

        return -1;
    }
}
