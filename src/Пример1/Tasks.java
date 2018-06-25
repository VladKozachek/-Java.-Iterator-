package Пример1;
//ConcreteAggregte  - хранится коллекция котрую мы хорти перебирать

public class Tasks implements Container {
    String [] task ={"Построить дом","Родить сына","Посадить дерево"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator{
        int index=0;
        @Override
        public boolean hasNext() {
            if(index<task.length){
                return true;
            }
            return false;
        }

        @Override
        public Object hext() {
            return task[index++];
        }
    }
}
