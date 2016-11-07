package chapter05;

/**
 * Created by luoqiuyu on 16/11/3.
 */

class Animal {
    int age;
    Animal (int age){
        this.age = age;
    }

    public void eat(){
        age = 10;
    }


    public static void main(String[] args) throws InterruptedException {
        Animal lion = new Animal(10);
        lion = null;
        System.gc();
        System.out.println("Main is completed.");
    }

    protected void finalize() {
        System.out.println("Rest in Peace!");
    }
}