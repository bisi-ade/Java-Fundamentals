import java.util.ArrayList;
import java.util.Arrays;

public class Basics {
    public void print1To255() {
        int[] arrVal;
        arrVal = new int[255];
        for(int i=0;i<255;i++) {
            arrVal[i] = i+1;
            System.out.println(arrVal[i]);
        }
    }
    public void printOdd1To255() {
        ArrayList<Object> arrVal = new ArrayList<Object>();
        for(int i=1;i<=255;i++) {
            if(i % 2 == 1) {
                arrVal.add(i);
            }
        }
        for(int i=0;i<arrVal.size();i++) {
            System.out.println(arrVal.get(i));
        }
        System.out.println(arrVal);
    }
    public void printSum1To255() {
        int sum = 0;
        for(int i=1;i<=255;i++) {
            sum += i;
            System.out.println(sum);
        }
    }
    public void iterateArr(int[] arr) {
        for(int val : arr) {
            System.out.println(val);
        }
    }
    public void findMax(int[] arr) {
        int max = arr[0];
        for(int val : arr) {
            if(val > max) {
                max = val;
            }
        }
        System.out.println(max);
    }
    public void findAvg(int[] arr) {
        double sum = 0;
        for(double val : arr) {
            sum += val;
        }
        double avg = sum/arr.length;
        System.out.println(avg);
    }
    public void greaterThanY(int[] arr, int y) {
        int sum = 0;
        for(int val : arr) {
            if(val > y) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
    public void sqVals(int[] arr) {
        ArrayList<Object> arrVal = new ArrayList<Object>();
        for(int i=0;i<arr.length;i++) {
            arrVal.add(arr[i]*arr[i]);
        }
        System.out.println(arrVal);
    }
    public void elimNegs(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public void maxMinAvg(int[] arr) {
        float max = arr[0];
        float min = arr[0];
        float sum = 0;
        for(float val : arr) {
            if(val > max) {
                max = val;
            } if(val < min) {
                min = val;
            }
            sum += val;
        }
        float avg = sum/arr.length;
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
    }
    public void shiftArrVals(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        System.out.println(Arrays.toString(arr));
    }
}