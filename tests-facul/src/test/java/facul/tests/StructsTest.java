package facul.tests;

import facul.tests.calc.Struct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StructsTest {

    @Test
    void testConcatenarArrays() {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {4, 5, 6};
        Integer[] resultado = Struct.concatenarArrays(arr1, arr2);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6}, resultado);
    }

    @Test
    void testMesclarObjetos() {
        Objeto obj1 = new Objeto("nome1", "sobrenome1");
        Objeto obj2 = new Objeto("nome2", "sobrenome2");
        Objeto mergedObjeto = Struct.mesclarObjetos(obj1, obj2);
        System.out.println("combinou"+ mergedObjeto);
        assertNotNull(mergedObjeto);
        assertEquals("nome2", mergedObjeto.getNome());
        assertEquals("sobrenome1", mergedObjeto.getSobrenome());
    }

    // Classe de exemplo para uso nos testes de mesclarObjetos
    static class Objeto {
        private String nome;
        private String sobrenome;

        public Objeto(String nome, String sobrenome) {
            this.nome = nome;
            this.sobrenome = sobrenome;
        }

        public Objeto() {
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSobrenome() {
            return sobrenome;
        }

        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }
    }
}
