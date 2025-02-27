package org.example;

public class Balance {
    int r,l;
    Balance()
    {
        r=0;
        l=0;
    }
    public void add_right(int a)
    {
        r += a;
    }
    public void add_left(int b)
    {
        l += b;
    }

    public void result() {
        if(r>l)
            System.out.println("R");
        if(r<l)
            System.out.println("L");
        if(r == l)
            System.out.println("=");
    }
}
