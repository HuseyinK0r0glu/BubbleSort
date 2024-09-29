import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,5,2,41,6,24,1,1431,23,3,12,323,51,24,64,2,14,7,8,796,67,667,9799,0};

        System.out.println(Arrays.toString(array));
        bubbleSort(array,array.length);
        System.out.println(Arrays.toString(array));
    }


    public static void bubbleSort(int[] array,int n){

        boolean swapped;

        // we iterate over array n-1 times to see all elements are in place
        // for the last element we don't need to look because it will already be in its place
        for(int i = 0;i<n-1;i++){

            swapped = false;

            // we iterate over the part we didn't sort yet and compare two adjacent elements
            for(int j = 0;j<n-i-1;j++){

                if(array[j] > array[j+1]){

                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            // if we don't have any element to swap their place it means they are already in place
            if(!swapped){
                break;
            }
        }
    }
}