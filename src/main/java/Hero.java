import java.util.List;
import java.util.ArrayList;


public class Hero{
    private String mName;
    private int mAge;
    private int mId;
    private String mSpecialPowers;
    private String mWeakness;
    private static List<Hero> instances = new ArrayList<>();

    public Hero(String name, int age, String specialPowers, String weakness ){
        mName = name;
        mAge = age;
        mSpecialPowers = specialPowers;
        mWeakness = weakness;
        instances.add(this);
        mId=instances.size();

    }

    public String getmName() {
        return mName;
    }

    public int getmAge() {
        return mAge;
    }

    public int getId() {
        return mId;
    }

    public String getmSpecialPowers() {
        return mSpecialPowers;
    }

    public String getmWeakness() {
        return mWeakness;
    }

    public static List<Hero> all(){
        return instances;
    }

    public static List<Hero> getInstances() {
        return instances;
    }

    public static Hero find(int Id){
        return instances.get(Id - 1);
    }

}