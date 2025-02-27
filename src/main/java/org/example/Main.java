package org.example;

public class Main{
    public static void main(String[] args) {
        Button button = new Button();
        button.click();
        button.click();
        button.click();
        //2
        Balance balance = new Balance();
        balance.add_right(9);
        balance.add_left(7);
        balance.result();
        //3
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        //4
        OddEvenSeparator o = new OddEvenSeparator();
        o.add_number(7);
        o.add_number(2);
        o.add_number(0);
        o.even();
        o.odd();
        //5
        Table t = new Table(2,2);
        t.set_value(0,0,7);
        t.set_value(0,1,5);
        t.set_value(1,0,8);
        t.set_value(1,1,3);
        t.get_value(0,1);
        t.get_value(1,0);
        t.n_rows();
        t.n_cols();
        t.print();
        t.average();
        //6

    }
}
