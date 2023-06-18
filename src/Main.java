import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char r;
        int a=0;
        do {


            System.out.println("***************WELCOME TO LIBRARY MANAGEMENT SYSTEM**********");
            System.out.println("Press 1 input your Details ");
            System.out.println("Press 2 to add book");
            System.out.println("press 3 issue a book");
            System.out.println("Press 4 return a book");
            System.out.println("press 5 print complete issue details");
            System.out.println("press 6 to exit");
            Scanner obj1 = new Scanner(System.in);


            for (int i = 0; i < 100; i++) {
                try {
                    System.out.print("Enter any number= ");
                    a = obj1.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("\n--Input Mistake try again--");
                    obj1.nextLine();
                }
            }
            Student s1 = new Student();
            switch (a) {
                case 2:
                    library aa = new library();
                    aa.addBook();
                    break;
                case 3:
                    library bb = new library();
                    bb.issueBook();
                    break;
                case 4:
                    library cc = new library();
                    cc.returnBOOK();
                    break;
                case 5:
                    library is = new library();
                    is.detail();
                    break;
                case 6:
                    library end = new library();
                    end.exit();
                    break;
                case 1:
                    s1.getDetails();
                    break;

                default:
                    System.out.println("invalid number");
            }
            System.out.println("You want to select next option Y/N");
            r = obj1.next().charAt(0);
        }
        while (r == 'Y' || r == 'y');
        if (r == 'n' || r == 'N') {
            library z = new library();
            z.exit();
        }
    }
}

