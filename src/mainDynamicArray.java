public class mainDynamicArray {
    public static void main(String[] args) {
        dynamicArray dynamicArray = new dynamicArray(5);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        //dynamicArray.insert(0,"X");
        //dynamicArray.delete("A");
        //System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("Size: "+dynamicArray.size);
        System.out.println("Capacity: "+dynamicArray.capacity);
        System.out.println("Empty: "+ dynamicArray.isEmpty());



    }
}
