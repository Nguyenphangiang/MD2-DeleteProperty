import java.util.Scanner;

public class DeleteProperty {
    public static void main(String[] args) {
        int[] arr = {11,2,33,4,55,6,77,8,99,10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to delete: ");
        int index_del= sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==index_del){
                index_del = i;
            }
        }
        int []arr1 = deleteElement(arr,index_del);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
    }
    public static int[] deleteElement(int[]array,int index){
        int[] newArr = new int[array.length-1];
        for (int i = 0; i < array.length-1; i++) {
            newArr[i] = array[i];
        }
        for (int i = index; i <array.length-1 ; i++) {
            newArr[i] = array[i+1];
        } return newArr;
    }
}
