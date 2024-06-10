public class Stack {
    public static void main(String[] args) {
        //Stack   LAST IN FIRST OUT   LIFO
        java.util.Stack<String> stack = new java.util.Stack<>();

        //System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Halo");
        stack.push("LOL");

        //String myFavGame = stack.pop();
        //System.out.println(myFavGame);

        //System.out.println(stack);

        //System.out.println(stack.search("Minecraft"));

        System.out.println(stack.peek());

        //Se acaba la memoria con las pilas
        /*
        for(int i = 0; i < 10000000; i++){
            stack.push("Fallout 176");
        } */

        //


    }
}
