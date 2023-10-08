package org.example;
/**
 * Класс контейнер со свойствами <b>size</b> и <b>array</b>.
 * * @autor Рогова Виктория
 */
public class Container {
    /**
     * Поле количество элементов
     */
    private int size = 0;
    /**
     * Поле массив строк
     */
    private String[] array = new String[5];

    /**
     * Функция получения значения поля {@link Container#size}
     * @return возвращает количество элементов в массиве
     */
    public int getSize() {
        return size;
    }

    /**
     * Функция получения значения элемента поля {@link Container#array}
     *  @param index - индекс массива
     * @return возвращает элемент массива по индексу
     */
    public String get(int index) {

        return array[index];
    }

    /**
     * Функция добавления в массив  {@link Container#array}
     * @param element - элементы/элемент массива
     * @return возвращает массив строк
     */
    public String[] add(String... element) {
        for (String f : element) {
            array[size] = f;
            size++;
            if (size == array.length) {
                String[] newArray = new String[array.length * 2];
                System.arraycopy(array, 0, newArray, 0, array.length);
                array = newArray;
            }
        }
        return array;
    }

    /**
     * Функция удаления элемента массива по индексу {@link Container#array}
     * @param index - индекс массива
     */
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    /**
     * Функция удаления элемента массива  {@link Container#array}
     * @param element - строка
     */
    public void remove(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                remove(i);
                return;
            }
        }
    }
}
