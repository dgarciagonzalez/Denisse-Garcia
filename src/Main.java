import java.util.ArrayList;
class Test{
    private int _x;
    public Test(){_x = 0;}
    public Test(int a){_x = a;}
    public void setX(int a){_x = a;}
    public int getX(){return _x;}
}
class Test2{
    private int _y;
    public Test2(){_y = 0;}
    public Test2(int  b){_y = b;}
    public void setY(int b){_y = b;}
    public int getY(int b){return _y;}
}
class Stuff<T>{
    private T _thing;
    public Stuff() {_thing = null;}
    public Stuff(T t){_thing = t;}
    public T getThing(){return _thing;}
    public void setThing(T t){_thing = t;}
    public void print(){
        if(_thing != null)
            System.out.println("Type: " +_thing.getClass().getName() + ", Value: "+ _thing);
        else
            System.out.println("null member variable");
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList <Test> stuff = new ArrayList<>();
        Stuff<Test> s = new Stuff<>(); //calling n-arg of stuff object
        s.print();
        s.setThing(new Test(5));
        s.print();
        System.out.println(s.getThing().getX());
    }
}