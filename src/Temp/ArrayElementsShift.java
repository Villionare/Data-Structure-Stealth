package Temp;

class ArrayInsert {
    void insertElement(char[] arr, int pos, char a){
        for (int i = arr.length - 1; i >= pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = a;
    }
}

public class ArrayElementsShift {
    public static void main(String[] args) {
        char[] arr = new char[6];
        arr[0] = 'A';
        arr[1] = 'B';
        arr[2] = 'C';
        arr[3] = 'D';
        arr[4] = 'E';

        //so now we have to push an 'J' at position 3
        ArrayInsert ins = new ArrayInsert();
        ins.insertElement(arr, 2, 'J');
    for (char i : arr){
        System.out.println(i);
    }
    }
}
