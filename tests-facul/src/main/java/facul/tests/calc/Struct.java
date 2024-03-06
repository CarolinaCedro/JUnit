package facul.tests.calc;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Struct {

    private String nome;
    private String sobrenome;

    public Struct() {
    }

    public Struct(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public static <T> T[] concatenarArrays(T[] arr1, T[] arr2) {
        T[] resultado = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2, 0, resultado, arr1.length, arr2.length);
        return resultado;
    }



     public static <T> T mesclarObjetos(T objeto1, T objeto2) {
        try {
            Class<?> clazz = objeto1.getClass();
            T mergedObject = (T) clazz.getDeclaredConstructor().newInstance();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                Object value1 = field.get(objeto1);
                Object value2 = field.get(objeto2);
                Object mergedValue = (value2 != null) ? value2 : value1;
                field.set(mergedObject, mergedValue);
            }
            return mergedObject;
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
