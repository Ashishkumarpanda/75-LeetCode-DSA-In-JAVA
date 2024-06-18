package Arrays;

public class ArraySimpleAlgo {

    public static void main(String[] args)
    {
        ArraySimpleAlgo obj = new ArraySimpleAlgo();
        int[] a = {1,2,3,4,5,6,8,9};
        obj.printArray(a);
        obj.printArray(removeEvenElements(a));
        obj.printArray(reverseArray(a));
        System.out.println(findMinValue(a));
        System.out.println(findMaxValue(a));
        System.out.println(findSecondMaxValue(a));
        obj.printArray(moveZerosToEnd(a));
        obj.resizeArray(a,12); //any capacity can be taken
        System.out.println(findMissingElement(a));
    }

    //find missing element
    public static int findMissingElement(int[] a) {
        int n = a.length+1;
        int sum = n*(n+1)/2;
        for (int val : a)
        {
            sum = sum-val;
        }
        return sum;
    }

    //Resize of an array
    public static void resizeArray(int[] a, int capacity) {
        System.out.println("Original size of array --> "+a.length);
        int[] temp = new int[capacity];

        for (int i=0;i<a.length;i++)
        {
            temp[i] = a[i];
        }
        a = temp;
        System.out.println("Size of array after resize --> "+a.length);
    }

    //find the second max element (array may contain duplicate element)
    public static int findSecondMaxValue(int[] a) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++)
        {
            if (a[i]>max)
            {
                secondMax = max;
                max = a[i];
            } else if (a[i] > secondMax && a[i] != max) {
                secondMax = a[i];
            }
        }
        return secondMax;
    }

    //find min element
    public static int findMinValue(int[] a) {
        int min = a[0];
        for (int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        return min;
    }

    //find max element
    public static int findMaxValue(int[] a) {
        int max = a[0];
        for (int i=0;i<a.length;i++)
        {
            if (a[i]>max)
            {
                max = a[i];
            }
        }
        return max;
    }

    //reverse an array
    public static int[] reverseArray(int[] a) {
        int start = 0;
        int end = a.length-1;
        while (start<end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
        return a;
    }

    //print array elements in console
    public void printArray(int[] a) {
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    //remove event elements from array
    public static int[] removeEvenElements(int[] a) {
        int oddCount = 0;
        for (int i=0;i<a.length;i++)
        {
            if (a[i]%2!=0)
            {
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int idx = 0;
        for (int i=0;i<a.length;i++)
        {
            if (a[i]%2!=0)
            {
                result[idx] = a[i];
                idx++;
            }
        }
        return result;
    }
    
    //move all zeros to the end of array and keep the non-zero elements in same order
    public static int[] moveZerosToEnd(int[] a) {
        //zero pointer
        int j = 0;
        for (int i=0;i<a.length;i++)
        {
            //i is non zero pointer
            //swap between zero and non zero pointer
            if (a[i] !=0 && a[j] == 0)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }

            //check if now zero pointer has zero value or not -> then move pointer
            if (a[j] !=0)
            {
                j++;
            }
        }
        return a;
    }

}
