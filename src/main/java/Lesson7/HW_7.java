package Lesson7;

public class HW_7 {
    public static int[] addValuesToArray(int[] array, int element, int position) {

        int[] newArray = new int[array.length + 1];
        for (int a = 0; a < newArray.length; a++) {
            if (a < position) {
                newArray[a] = array[a];
            } else if (a == position) {
                newArray[a] = element;
            } else {
                newArray[a] = array[a - 1];
            }
        }
        return newArray;
    }

    public static int[] addValuesToArray(int[] array, int element) {
        return addValuesToArray(array, element,0);
    }
}


