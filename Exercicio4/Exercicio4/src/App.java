//Escreva um código que encontre os elementos em comum que existem em dois arrays e imprima no console quais são esses elementos, um a um.

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    class DuplicateFinder {
        private DuplicateFinder() {
        }

        public static List<String> find(String[] array1, String[] array2) {
            List<String> duplicateElements = new ArrayList<>();

            if (array1.length > array2.length) {
                for (int i = 0; i < array1.length; i++) {
                    for (int j = 0; j < array2.length; j++) {
                        if (Objects.equals(array1[i], array2[j])) {
                            duplicateElements.add(array1[i]);
                        }
                    }
                }
            } else {
                for (int i = 0; i < array2.length; i++) {
                    for (int j = 0; j < array1.length; j++) {
                        if (Objects.equals(array2[i], array2[j])) {
                            duplicateElements.add(array2[i]);
                        }
                    }
                }
            }

            return duplicateElements;
        }
    }

    public static void main(String[] args) {
        String[] array1 = { "Morango", "Banana", "Maçã", "Uva", "Caqui" };
        String[] array2 = { "Manga", "Caqui", "Morango", "Amora" };

        List<String> duplicatedElements = DuplicateFinder.find(array1, array2);

        logger.info("Elementos duplicados: \n" + duplicatedElements);
    }
}
