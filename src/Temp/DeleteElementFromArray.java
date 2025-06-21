package Temp;

//this program will delete an element from a specific position from an array
public class DeleteElementFromArray {
    void deleteElement(char[] arr,int pos){
        for (int i = pos-1; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = '0';
    }

    public static void main(String[] args) {
        char[] arr = new char[6];
        arr[0]='A';
        arr[1]='B';
        arr[2]='J';
        arr[3]='C';
        arr[4]='D';
        arr[5]='E';

        DeleteElementFromArray obj = new DeleteElementFromArray();

        obj.deleteElement(arr,3);

        for (char i : arr){
            System.out.println(i);
        }
    }
}
