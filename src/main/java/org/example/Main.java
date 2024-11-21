package org.example;

public class Main {
    public static void main(String[] args) {
        DinAra<Integer> list = new DinAraImpl<>();

        list.dobavitMana(3);
        list.dobavitMana(4);
        list.dobavitMana(5);
        System.out.println("Элементы:");
        for (int i = 0; i < list.rasmera(); i++){
            System.out.println(list.poluchitElementamana(i));
        }
        System.out.println("\n" + " Размер списка");
        System.out.println(list.rasmera());

        System.out.println("\n");
        list.udalitElementamana(2);
        System.out.println("Список после удаления одного элемента:");
        for (int i = 0; i < list.rasmera(); i++){
            System.out.println(list.poluchitElementamana(i));
        }

        System.out.println("\n");
        System.out.println("Проверка, пустой ли список: " +
                list.pustaIliNet());
    }
}