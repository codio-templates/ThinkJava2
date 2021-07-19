public class Strings5 {

    public static void main(String[] args) {
      
        String fruit = "banana";
        int index = fruit.indexOf('a');
        int index2 = fruit.indexOf('a', 2);

        // Substrings

        System.out.println(fruit.substring(0, 3));
        System.out.println(fruit.substring(2, 5));
        System.out.println(fruit.substring(6, 6));

        System.out.println(fruit.substring(0));
        System.out.println(fruit.substring(2));
        System.out.println(fruit.substring(6));

    
    }


}
