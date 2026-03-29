import java.util.Scanner;
public class Main {
    private static int manualMultiplicationRecursion(int num1, int count){
        if (count==0) return 0;
        return num1+manualMultiplicationRecursion(num1, count-1);
    }
    private static int manualDivisionRecursion(int num2, int dividedBy){
        if(num2<dividedBy) return 0;
        return 1+ manualDivisionRecursion(num2-dividedBy, dividedBy);
    }
    //main method
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("HI SO WE ARE MULTIPLYING AND DIVIDING NUMBERS MANUALLY"); //instead of using * and /, we are manually adding and subtracting the numbers.
        //user input
        int userChoice;
        do{
            System.out.print("\n\n1. Manual Multiplication(No use of * operator)\n2. Manual Division(No use of / operator\n3. Exit\nYour choice: ");
            userChoice= scanner.nextInt();
            switch (userChoice){
                case 1:
                    System.out.print("Enter a number: "); int num1= scanner.nextInt();
                    System.out.print("Multiplied by: "); int count= scanner.nextInt();
                    System.out.printf("\nProduct: %d", manualMultiplicationRecursion(num1, count));
                    break;
                case 2:
                    System.out.print("Enter a number: "); int num2= scanner.nextInt();
                    System.out.print("Divided by: "); int dividedBy= scanner.nextInt();
                    System.out.printf("\nQuotient: %d", manualDivisionRecursion(num2, dividedBy));
                    break;
                case 3: System.out.println("Successfully closed the program.");
                    break;
                default : System.out.println("Invalid answer!");
            }
        }while(userChoice!=3);
        scanner.close();
    }
}