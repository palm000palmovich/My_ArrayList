package org.example;

public interface DinAra<Type> {
    //Добавление элемента
    void dobavitMana(Type element);

    //Вывод элемента по индексу
    Type poluchitElementamana(int index);

    //Удаление элемента по индексу
    void udalitElementamana(int index);

    //Размер листа
    int rasmera();

    //Проверка на пустоту
    boolean pustaIliNet();

    //Динамическое расширение массива
    void ensureCapacity();
}
