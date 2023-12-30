package algorithm;

import java.util.Random;

import static java.lang.System.out;

public class quicksort_originalCode {

    public static void main(String[] args){

        //generate an array of 10 Intergers randomly between 0~99
        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0;i < numbers.length;i++){
            numbers[i] = rand.nextInt(100);
        }

        //print out the array generated randomly
        out.println("Before:");
        printArray(numbers);

        quicksort(numbers, 0, numbers.length-1);

        out.println("After:");
        printArray(numbers);
    }

    private static void quicksort(int[] array, int lowIndex, int highIndex){

        //only one element left and it has been sorted
        if(lowIndex >= highIndex){
            return;
        }

        //pick the last element in the array=highIndex
        int pivot = array[highIndex];

        //walking through the array a single element at a time until we find an element that is larger than the pivot
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        //leftPointer goes right and rightPointer goes left, and they swap elements until they meet
        while (leftPointer < rightPointer){

            //the element leftPointer pointing to is greater than pivot
            while (array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            //the element rightPointer pointing to is less than pivot
            while (array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        swap(array,leftPointer,highIndex);

        //left side quicksort
        quicksort(array,lowIndex,leftPointer-1);

        //right side quicksort
        quicksort(array,leftPointer+1,highIndex);
    }


    private static void swap(int[] array, int index1, int index2){

        //swap each other's elements
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
