package secondpart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class StringWraper implements Iterable<String> {

    /**
     * Этот класс предоставляет построчную итерацию по текстовому файлу.
     *   Метод итератора remove() генерирует UnsupportedOperatorException.
     *   Итератор перехватывает и генерирует IOExceptions как IllegalArgumentExceptions.
     */

        // Используется в TextFileIterator ниже
         String filename;

        public void TextFile(String filename) {
            this.filename = filename;
        }

        // Это единственный метод интерфейса Iterable
        public Iterator<String> iterator() {
            return new TextFileIterator();
        }

        // Этот не статический класс является реализацией итератора
        class TextFileIterator implements Iterator<String> {

            // Поток для чтения
            BufferedReader in;

            // Возвращает значение следующего вызова next()
            String nextline;

            public TextFileIterator() {
                // Открыть файл, прочитать и запомнить первую строку
                //   Выбрать строку наперед для использования функции hasNext()
                try {
                    in = new BufferedReader(new FileReader(filename));
                    nextline = in.readLine();
                } catch (IOException e) {
                    throw new IllegalArgumentException(e);
                }
            }

            // Если следующая строка не равна null, у нас есть следующая строка
            public boolean hasNext() {
                return nextline != null;
            }

            // Возвращает следующую строку, но сначала читает еще одну строку за ней
            public String next() {
                try {
                    String result = nextline;

                    // Если еще не достигли EOF ...
                    if (nextline != null) {
                        nextline = in.readLine();    // Читать еще одну строку
                        if (nextline == null)
                            in.close();                // Закрыть по достижению EOF
                    }

                    // Возвратить строку, прочитанную раннее
                    return result;

                } catch (IOException e) {
                    throw new IllegalArgumentException(e);
                }
            }

            // Файл только для чтения, мы не разрешаем удаление строк
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }
}
