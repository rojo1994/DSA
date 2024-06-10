public class linearSearch {
    public static void main(String[] args) {
        // Linear search : Un elemento a la vez

        //Desventajas
        //Lento para largos bancos de datos

        //Ventajas
        //Rapido para pequenos y medianos bancos de datos
        //No necesita ser ordenada
        //Sirve para estructura de datos que no tienen acceso random


        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        int index = linearSearch(array, 10);

        if (index != -1){
            System.out.println("Element found at index: "+ index);
        }else{
            System.out.println("Element not found");
        }

            System.out.println();


    }

    private static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
