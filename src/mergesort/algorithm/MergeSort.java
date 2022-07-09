package mergesort.algorithm;

import java.util.Arrays;

public class MergeSort {
    private int[] dataArray;
    public static void main(String[] args) {
        int[] dataArray = {5,3,6,4,8,2,7,1,9};
        int lengthOfDataArary = dataArray.length;
        MergeSort ms = new MergeSort();
        ms.mergeSortMethod(dataArray,lengthOfDataArary);
    }
    void mergeSortMethod(int[] dataArray, int lengthOfDataArray){
        if(lengthOfDataArray<2)
            return;
        int midIndex = lengthOfDataArray/2;
        int[] leftDataArray = new int[midIndex];
        int[] righDataArray = new int[lengthOfDataArray-midIndex];

        // fill left array
        for(int i = 0; i < midIndex;i++){
            leftDataArray[i] = dataArray[i];
        }
//        fill right array
        for(int i = 0; i<(lengthOfDataArray-midIndex);i++){
            righDataArray[i] = dataArray[i+midIndex];
        }

//        recursive for left array
//        System.out.println("recursive for left array "+ Arrays.toString(leftDataArray));
        mergeSortMethod(leftDataArray,midIndex);
//        System.out.println("recursive for right array "+ Arrays.toString(righDataArray));
        mergeSortMethod(righDataArray,lengthOfDataArray-midIndex);
        this.dataArray = new int[dataArray.length];
        gatheredAndSort(dataArray,leftDataArray,righDataArray,midIndex,lengthOfDataArray-midIndex);
        System.out.println(Arrays.toString(dataArray));
    }
    void gatheredAndSort(int[] dataArray,int[] leftDataArray,int[] rightDataArray,int sumOfLeftDataArray,int sumOfRightDataArray){
        int leftIndex = 0;
        int rightIndex = 0;
        int k = 0;
//        int sumOfLeftDataArray = leftDataArray.length;
//        int sumOfRightDataArray = rightDataArray.length;

        while(leftIndex < sumOfLeftDataArray && rightIndex < sumOfRightDataArray){
            if(leftDataArray[leftIndex] <= rightDataArray[rightIndex]){
                dataArray[k++] = leftDataArray[leftIndex++];
            }else{
                dataArray[k++] = rightDataArray[rightIndex++];
            }
        }
        while (leftIndex<sumOfLeftDataArray){
            dataArray[k++] = leftDataArray[leftIndex++];
        }
        while (rightIndex<sumOfRightDataArray){
            dataArray[k++] = rightDataArray[rightIndex++];
        }
    }
    void getResult(){
        System.out.println(Arrays.toString(this.dataArray));
    }
}
