package Arrays;

public class ArraySimpleAlgo {

    public static void main(String args[])
    {
        ArraySimpleAlgo obj = new ArraySimpleAlgo();
        int[] a = {3,2,4,7,10,6,5};
        obj.printArray(a);
        obj.printArray(obj.removeEvenElements(a));
    }

    //print array elements in console
    public void printArray(int[] a)
    {
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    //remove event elements from array
    public static int[] removeEvenElements(int[] a)
    {
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
}
