package com.company;

public class Logic {
    private int side = 4;
    private int length = side*side;
    private String[] array = new String[length];
    private Result result = new Result(side,side,3);
    private boolean next;
    private Counter counter = new Counter(result);


    public String result(){ return result.process(array); }
    public int getSide(){ return side; }

    private boolean write(int index,String symbol){
        if(index>=0&&array[index]==null){
            array[index] = symbol;
        }else{ return false; }
        return true;
    }

    public String[] resetPosition(){
        for(int i = 0;i<length;i++){ array[i] = null; }
        next = true;
        return array.clone();
    }

    public String[] process(int indexUser){
        if(next){
            int indexPC = counter.process(array);
            if(write(indexPC,"X"))   { next = !next; }
        }else{
            if(write(indexUser,"0")) { next = !next; }
        }
        return array.clone();
    }

}
