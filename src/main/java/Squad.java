import java.util.List;
import java.util.ArrayList;

public class Squad {
    private int mMaxSize;
    private String mName;
    private String mCause;
    private int mId;
    private static List<Squad> instances = new ArrayList<>();
    private List<Hero> mHeroes;

    public Squad(int mMaxSize, String mName, String mCause) {
        this.mMaxSize = mMaxSize;
        this.mName = mName;
        this.mCause = mCause;
        instances.add(this);
        mId = instances.size();
        mHeroes = new ArrayList<Hero>();

    }

    public int getmMaxSize() {
        return mMaxSize;
    }

    public String getmName() {
        return mName;
    }

    public String getmCause() {
        return mCause;
    }

    public int getId() {
        return mId;
    }

    public static List<Squad> all(){
        return instances;
    }

    public List<Hero> getHeroes() {
        return mHeroes;
    }

    public static Squad find(int id) {
        try {
            return instances.get(id - 1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }

    public static void clear() {
        instances.clear();
    }

    public void addHero(Hero hero) {
        mHeroes.add(hero);
    }
}