package org.example;

public class Table {
    private int row;
    private int col;
    Table(int row1, int col1){
        jav=new int[row1][col1];
        for(int i=0;i<row;i+=1)
            for(int r=0;r<col;r+=1)
                jav[i][r]=0;
        row=row1;
        col=col1;
    }
    private int [][] jav;
    public void get_value(int row,int col){
        System.out.println("Element: "+jav[row][col]);
    }
    public void set_value(int row,int col,int value){
        jav[row][col]=value;
    }

    public void n_rows(){
        System.out.println("Rows: "+row);
    }

    public void n_cols(){
        System.out.println("Cols: "+col);
    }

    public void print(){
        System.out.println("Result: ");
        for (int i = 0; i < row; i+=1) {
            for (int j = 0; j < col; j+=1) {
                System.out.print(" " + jav[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void average(){
        int sum=0;
        float result = 0;
        for (int i = 0; i < row; i+=1) {
            for (int j = 0; j < col; j+=1) {
                sum+=jav[i][j];
            }
        }
        result=(sum/(row*col));
        System.out.println("Average: "+result);
    }

}

