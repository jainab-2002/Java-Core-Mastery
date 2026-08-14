package Variables_Datatypes.Logical_Operators;

public class Question2 {
    public static void main(String[] args) {
        //Question
        // check whether the student is eligible to appear for an exam.
        // The student is eligible if they have a hall ticket or special permission,
        // and they are not banned.

        boolean hasHallTicket = false;
        boolean hasSpecialPermission = true;
        boolean isBanned = false;

        boolean isEligible = (hasHallTicket || hasSpecialPermission) && !isBanned;

        System.out.println("Is Eligible: " + isEligible);
    }
    
}