/* Switch Statements / Оператор switch -
переключатель, который позволяет выбрать между несколькими вариантами.
Пример:

int role = 2;

switch (role) {
    case 1:
        // do something
        break;
     case 2:
        // do something
        break;
     default:
        // do something
}
* */

public class F024_SwitchStatements {
    public static void main(String[] args) {
        String role = "admin";

//        if (role == "admin")
//            System.out.println("Hello, admin!");
//        else if (role == "user")
//            System.out.println("Hello, user!");
//        else if (role == "guest")
//            System.out.println("Hello, guest!");

        // или
        switch (role) {
            case "admin":
                System.out.println("Hello, admin!");
                break;

            case "user":
                System.out.println("Hello, user!");
                break;

            default: // role == "guest":
                System.out.println("Hello, guest!");
        }


    }
}
