
public class Controller {

    public static int StartProgram() {
        int menu = View.ShowMenu();
        return menu;
    }

    public static int SelectMenu(int menu) {

        switch (menu) {
            case 1:
                System.out.println("Enter 1");
                return 1;

            case 2:
                System.out.println("Enter 2");
                return 2;
            case 3:
                System.out.println("Enter 3");
                return 2;
            case 4:
                System.out.println("Enter 4");
                return 2;
            case 5:
                System.out.println("Enter 5");
                return 2;
            case 6:
                System.out.println("Enter 6");
                return 2;
            case 7:
                System.out.println("Enter 7");
                break;
        }
        return menu;
    }

}