package chapter05;

/**
 * Created by luoqiuyu on 16/11/3.
 */

class Book{
    boolean checkedOut = false;
    Book(boolean checkout){
        checkedOut = checkout;
    }

    void checkIn(){
        checkedOut = false;
    }

    protected void finalize(){
        if (checkedOut){
            System.out.println("Error : checked out");
        }
    }

}

public class TerminationCondition {
    public static void main(String[] args){
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
        System.runFinalization();
    }
}


