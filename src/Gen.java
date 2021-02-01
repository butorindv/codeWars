public class Gen <T>{

    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Тип Т - это " + ob.getClass().getName());
    }
}
