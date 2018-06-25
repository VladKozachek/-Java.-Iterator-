package Пример1;

public class Main {
    public static void main(String[] args) {
        Tasks tasks=new Tasks();
        Iterator iterator=tasks.getIterator();
        while (iterator.hasNext()){
            System.out.println((String )iterator.hext());
        }
    }
}
