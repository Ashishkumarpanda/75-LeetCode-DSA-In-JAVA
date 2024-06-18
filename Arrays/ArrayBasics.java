package Arrays;

public class ArrayBasics {
    public static void main(String args[])
    {
        //Declaration and initialization of array
        int[] a = new int[5];
        int[] b = {1,2,3,4,5};

        //length of array
        System.out.println(a.length);
        System.out.println(b.length);

        //Add or Update values to array
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        //access values of array
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }

    }
}
