package stringhe;

public class Main {

    private final static String PUNTO = ".";
    private final static String SPAZIO = " ";
    private final static String CHIOCCIOLA = "@";

    public static void main(String [] args) {
        String psw = "Andrea";
        System.out.println(psw.toLowerCase());
    }

    private static boolean passwordValida(String password) {
        if(!password.contains(PUNTO)) {
            return false;
        }
        if(password.length() < 8) {
            return false;
        }
        if(!password.contains(SPAZIO)) {
            return false;
        }
        return true;
    }

    private static boolean emailValida(String email) {
        if(!inputEValido(email)) {
            return false;
        }
        if(!email.contains(CHIOCCIOLA)) {
            return false;
        }
        if(!email.contains(PUNTO)) {
            return false;
        }
        return true;
    }

    private static boolean inputEValido(String input) {
        boolean eVuoto = input.trim().isEmpty();
        return !eVuoto;
    }

    private static void stampaOrdineString(String a, String b) {
        if(a.compareTo(b) < 0) {
            System.out.println("Entro if");
            System.out.println(a);
            System.out.println(b);
        } else {
            System.out.println("Entro else");
            System.out.println(b);
            System.out.println(a);
        }
    }
}
