package Variables_Datatypes.Logical_Operators;

public class Question1 {
    public static void main(String[] args) {
        //Question
        // Declare two boolean variables and perform logical operations
        // such as AND, OR, and NOT on them. Print the result of each operation.
        boolean isRaining = true;
        boolean isSunny = false;

        boolean andResult = isRaining && isSunny;
        boolean orResult = isRaining || isSunny;
        boolean notResult = !isRaining;

        System.out.println("AND Result: " + andResult);
        System.out.println("OR Result: " + orResult);
        System.out.println("NOT Result: " + notResult);
    }
    
}