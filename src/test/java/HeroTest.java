
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @After
    public void tearDown(){
        Hero.clear();
    }
    @Test
    public void Hero_instantiatesCorrectly_true(){
        Hero myHero = new Hero("SpiderMan", 2000, "lazer eyes", "kryptontite");
        assertEquals(true, myHero instanceof Hero);
    }

    @Test
    public void Hero_testName_String(){
        Hero myHero = new Hero("SpiderMan", 2000, "lazer eyes", "kryptontite");
        assertEquals("SpiderMan", myHero.getmName() );
    }

    @Test
    public void Hero_testAge_Integer() {
        Hero myHero = new Hero("SpiderMan", 2000, "lazer eyes", "kryptontite");
        assertEquals(2000, myHero.getmAge());
    }

    @Test
    public void Hero_testSpecialPowers_String() {
        Hero myHero = new Hero("SpiderMan", 2000, "lazer eyes", "kryptontite");
        assertEquals("lazer eyes", myHero.getmSpecialPowers());
    }

    @Test
    public void Hero_testWeakness_String() {
        Hero myHero = new Hero("SpiderMan", 2000, "lazer eyes", "kryptonite");
        assertEquals("kryptonite", myHero.getmWeakness());
    }

    @Test
    public void all_returnsAllInstancesOfHero_true() {
        Hero firstHero = new Hero("SpiderMan", 2000, "lazer eyes", "kryptontite");
        Hero secondHero = new Hero("Joker", 40, "genius", "Batman");
        assertEquals(true, Hero.all().contains(firstHero));
        assertEquals(true, Hero.all().contains(secondHero));
    }

    @Test
    public void clear_emptiesAllHeroesFromArrayList_0() {
        Hero myHero = new Hero("SpiderMan", 2000, "lazer eyes", "kryptontite");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }

    @Test
    public void getId_tasksInstantiateWithAnID_1() {
        Hero.clear();  // Remember, the test will fail without this line! We need to empty leftover Hero from previous tests!
        Hero myHero = new Hero("SpiderMan", 2000, "lazer eyes", "kryptontite");
        assertEquals(1, myHero.getId());
    }

    @Test
    public void find_returnHeroWithSameId_secondHero(){
        Hero firstHero = new Hero("SpiderMan", 2000, "lazer eyes", "kryptontite");
        Hero secondHero = new Hero("Joker", 40, "genius", "Batman");
        assertEquals(Hero.find(secondHero.getId()), secondHero);
    }
}
