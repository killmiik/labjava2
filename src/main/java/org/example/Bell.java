package org.example;

public class Bell {
    int m;
    Bell(){
        m=0;
    }

    public void sound() {
        if(m % 2 == 0)
            System.out.println("ding");
        else
            System.out.println("dong");
        m += 1;
    }
}
