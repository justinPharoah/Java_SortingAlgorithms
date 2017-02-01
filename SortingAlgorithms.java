/**
 * Created by justinferrell on 1/24/17.
 */
public class SortingAlgorithms {
    public static void main(String[] args) {

    }
    public void insertionSort(int [] list) {
        for(int outer = 1; outer <= list.length - 1; outer++) {
            int pos = outer;
            int key = list[pos];
            while(pos > 0 && list[pos - 1] > key) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = key;
        }
    }

    public void bubbleSort(int [] list) {
        for(int outer = 0; outer < list.length - 1; outer++) {
            for(int inner = 0; inner < list.length - outer - 1; inner++) {
                if(list[inner] > list[inner + 1]) {
                    int temp = list[inner];
                    list[inner] = list[inner + 1];
                    list[inner + 1] = temp;
                }
            }
        }
    }

    public void selectionSort(int [] list) {
        int min, temp;
        for(int outer = 0; outer < list.length - 1; outer++) {
            min = outer;
            for(int inner = outer + 1; inner < list.length; inner++) {
                if(list[inner] < list[min]) {
                    min = inner; //a new smallest item is found
                }
            }
            //swap list[outer] and list[min]
            temp = list[outer];
            list[outer] = list[min];
            list[min] = temp;
        }

    }

}
