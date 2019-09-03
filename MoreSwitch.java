package controlflow;

public class MoreSwitch {
    public static void main(String[] args) {
        int month=15;   // we know month has same types of values
                       // In order to check what month 8 is, we can use use statement
                       // if we don;t use Break, then it will execute the next block of codes as well. So its better to use break
                       // The default keyword specifies some code to run if there is no case match:
                       // change the value of month and see the outputs
                       // If we dont put Break statement, it will execute rest of the block of codes even if it finds a case match.

        switch(month) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("SeptemBEEEEEEEEEEEEr");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("You are on vacation");

        }
    }


}