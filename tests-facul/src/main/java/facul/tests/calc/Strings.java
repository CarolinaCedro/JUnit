package facul.tests.calc;

public class Strings {
    public Strings() {
    }

    public static boolean validarEmail(String email) {
        String regex = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$";
        return email.matches(regex);
    }

    public static int contarCaracteres(String str) {
        return str.length();
    }

    public static String inverterString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String converterParaMaiusculas(String str) {
        return str.toUpperCase();
    }
}
