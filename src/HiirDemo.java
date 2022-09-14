class Gen{
    int a;
    Gen(int a){
        this.a = a;
    }
    int getob(){
        return a;
    }

}
class Gen2<T> extends Gen{
    T ob;
    Gen2(T ob, int a){
        super(a);
        this.ob = ob;
    }
    T getob2(){
        return ob;
    }

}
public class HiirDemo { public static void main (String args[]){
    Gen2 <String > st = new Gen2("Value is: ",76);
    System.out.println(st.getob());
    System.out.println(st.getob2());
}

}
