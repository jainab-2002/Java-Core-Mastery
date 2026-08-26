package exceptions.Exception_hierarchy;
class Question2 {
    public static void main(String[] args) {

        try {
            int arr[] = {10, 20, 30};

            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}