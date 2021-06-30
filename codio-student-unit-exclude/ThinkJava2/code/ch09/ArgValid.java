/**
 * Example of argument validation.
 */
public class ArgValid {

       //Old version of the method
//     public static boolean isCapitalized(String str) {
//       return Character.isUpperCase(str.charAt(0));
//     }
  
    //New version
    public static boolean isCapitalized(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return Character.isUpperCase(str.charAt(0));
    }

    public static void main(String[] args) {
        System.out.println(isCapitalized("Hi!"));
        System.out.println(isCapitalized("bye"));
        System.out.println(isCapitalized(""));
        System.out.println(isCapitalized(null));
    }

}
