package org.example;


public class Main {
public static void main(String[] args) {
        Container array = getEmployee();
        print(array);
        }

private static Container getEmployee() {
        Container array1 = new Container();
        array1.add("Mike", "Austen", "Harry");
        array1.remove("Austen");
        array1.remove(0);
        return array1;
        }

private static void print(Container array) {
        for (int i = 0; i < array.getSize(); i++) {
        System.out.println(array.get(i));
        }
        }
}