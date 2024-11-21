package org.example;
import org.example.Exception.TiSovsemEbanutiyTakieDannieVvoditException;

import java.util.Arrays;



public class DinAraImpl<Type> implements DinAra<Type> {
    private Object[] elements;
    private int size;
    private final int DEFAULT_Capacity = 10;

    public DinAraImpl(){
        elements = new Object[DEFAULT_Capacity];
        size = 0;
    }

    //Добавление элемента
    @Override
    public void dobavitMana(Type element){
        ensureCapacity();
        elements[size++] = element;
    }

    //Вывод элемента по индексу
    @Override
    public Type poluchitElementamana(int index){
        if (index < 0 || index >= size){
            throw new TiSovsemEbanutiyTakieDannieVvoditException("Ты совсем ишак? Давай нормальные данные введи!");
        }
        ensureCapacity();
        return (Type) elements[index];
    }

    //Удаление элемента по индексу
    @Override
    public void udalitElementamana(int index){
        if (index < 0 || index > size){
            throw new TiSovsemEbanutiyTakieDannieVvoditException("Ты совсем ишак? Давай нормальные данные введи!");
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null; // Удаляем ссылку на объект для сборщика мусора
    }

    //Размер листа
    @Override
    public int rasmera(){
        return size;
    }

    //Проверка на пустоту
    @Override
    public boolean pustaIliNet(){
        return size==0;
    }

    //Динамическое расширение массива
    @Override
    public void ensureCapacity(){
        if (size == elements.length){
            int newCapacity = elements.length*2; //Когда носик приблизился к жопке, мы динамически
            //Увеличиваем расстояние между ними в 2 раза
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
}

