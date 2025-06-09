package lab5.prog5_1;

public class MySingleton {
    static MySingleton mySingleton;

    private MySingleton(){

    }

    public static MySingleton getMySingleton(){
        if(mySingleton == null)
            mySingleton = new MySingleton();
        return mySingleton;
    }
}
