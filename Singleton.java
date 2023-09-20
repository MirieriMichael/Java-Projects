public class Singleton {
    private static Singleton instance;
// here you can add an instance variable such as value and getters and
    //setters and you'll be able to pass some values into it thus getting different outputs
    //otherwise you'll get the same outputs as the Singleton is the only instance
    private Singleton(){}
    public static Singleton getInstance() {
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }


    }
        return instance;
    }
}
