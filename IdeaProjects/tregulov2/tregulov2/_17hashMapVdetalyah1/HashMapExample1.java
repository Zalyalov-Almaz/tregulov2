package _17hashMapVdetalyah1;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

    public static void main(String[] args) {
        Map <Integer, String> map = new HashMap<>(16, 0.75f); //intialCapacity - размер массива закладываемого в основу создаваемого HashMap
                                                                                    //loadFactor - порог увеличния вышеописанного массива (16 * 0,75 = 12), значит после того, как
                                                                                    //в map будет помещено 12 элементов, массив будет увеличен вдвое (32), все элементы будут рехешированы
                                                                                    //и переразмещеные на другие индексы
    }


}
// В основе HashMap лежит массив. Элементами данного массива являются структуры LinkedList. Данные структуры LinkedList и заполняются элементами, которые мы добавляем в HashMap
//