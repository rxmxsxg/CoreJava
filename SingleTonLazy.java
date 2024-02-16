public class SingleTonLazy {
    private static volatile SingleTonLazy singleTonLazy = null;

    private SingleTonLazy() {}

    public static SingleTonLazy getInstance(){
        if(singleTonLazy == null){            //double checked locking pattern
            synchronized (SingleTonLazy.class){
                if(singleTonLazy == null){
                    singleTonLazy = new SingleTonLazy();
                }
            }
        }
        return singleTonLazy;
    }
}
