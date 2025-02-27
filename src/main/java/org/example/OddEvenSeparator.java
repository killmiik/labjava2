package org.example;

public class OddEvenSeparator {
    OddEvenSeparator()
    {
        array=new int[0];
    }
    private int[] array;
    public void add_number(int a)
    {
        int[] array1 = new int [array.length+1];
        for (int i=0;i<array.length;i++){
            array1[i]=array[i];
        }
        array1[array.length]=a;
        array=array1;
    }
    public void even() {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0)
            {
                System.out.println("Even: "+array[i]);
            }
        }
    }

    public void odd() {
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1)
            {
                System.out.println("Odd: "+array[i]);
            }
        }
    }
}
