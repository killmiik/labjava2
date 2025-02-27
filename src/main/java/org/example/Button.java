package org.example;

public class Button{
    int click;
    Button(){
        click = 0;
    }
    public void click()
    {
        click+=1;
        System.out.println(click);
    }

}

