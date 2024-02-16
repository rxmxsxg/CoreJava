public class SingleTonEager {
    private static final SingleTonEager singleTonObj = new SingleTonEager();
    private SingleTonEager(){}

    public static SingleTonEager getInstance(){
        return singleTonObj;
    }
}
