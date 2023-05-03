package acces_modifiers.our_safe_array;

import java.time.chrono.MinguoDate;

public class SafeArray {
    private int[] array; //ссылка на наш массив
    private int errorValue;
    public int length;

    public SafeArray(int length, int errorValue) {
        array = new int[length];
        this.errorValue = errorValue;
        this.length = length;


    }

    public int get(int index) {
        if (indexGood(index)) return array[index];
        return errorValue;
    }

    //записывает значение жлементов по индексу. Возв-ет false в случае неудачи
    public boolean put(int index, int value) {
        if (indexGood(index)) {
            array[index] = value;
            return true;
        }
        return false;
    }
    private boolean indexGood(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}
