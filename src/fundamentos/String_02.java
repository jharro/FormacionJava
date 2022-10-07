package fundamentos;

public class String_02 {
    public static void main(String[] args) {
        //Métodos: equals, length, etc
        // https://open-bootcamp.com/cursos/java/metodos-de-la-clase-string

        String str = "Java Exercises!";
        System.out.println("Original String = " + str);
        // Get the character at positions 0 and 10.
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        // Print out the results.
        System.out.println("The character at position 0 is " +
                (char)index1);
        System.out.println("The character at position 10 is " +
                (char)index2);

        String hola="Hola mundo";
        System.out.println(hola.length());
    }
}
