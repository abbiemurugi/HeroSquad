import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void Squad_instantiatesCorrectly_true(){
        Squad mySquad = new Squad(6, "Avengers", "Arrest criminals");
        assertEquals(true, mySquad instanceof Squad);
    }

    @Test
    public void Squad_testMaxSize_int(){
        Squad mySquad = new Squad(6, "Avengers", "Arrest criminals");
        assertEquals(6, mySquad.getmMaxSize());
    }

    @Test
    public void Squad_testName_String(){
        Squad mySquad = new Squad(6, "Avengers", "Arrest criminals");
        assertEquals("Avengers", mySquad.getmName());
    }

    @Test
    public void Squad_testCause_String(){
        Squad mySquad = new Squad(6, "Avengers", "Arrest criminals");
        assertEquals("Arrest criminals", mySquad.getmCause());
    }

    @Test
    public void all_returnsAllInstancesOfSquad_true() {
        Squad firstSquad = new Squad(6, "Avengers", "Arrest criminals");
        Squad secondSquad = new Squad(12, "Justice league", "save the world");
        assertEquals(true, Squad.all().contains(firstSquad));
        assertEquals(true, Squad.all().contains(secondSquad));
    }

    @Test
    public void clear_emptiesAllSquadFromList_0() {
        Squad testSquad = new Squad(6, "Avengers", "Arrest criminals");
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }

    @Test
    public void getId_SquadInstantiateWithAnId_1() {
        Squad.clear();
        Squad testSquad = new Squad(6, "Avengers", "Arrest criminals");
        assertEquals(1, testSquad.getId());
    }

    @Test
    public void find_returnsSquadWithSameId_secondSquad() {
        Squad.clear();
        Squad firstSquad= new Squad(6, "Avengers", "Arrest criminals");
        Squad secondSquad = new Squad(12, "Justice league", "save the world");
        assertEquals(Squad.find(secondSquad.getId()), secondSquad);
    }

    @Test
    public void getTasks_initiallyReturnsEmptyList_ArrayList() {
        Squad.clear();
        Squad testSquad = new Squad(12, "Justice league", "save the world");
        assertEquals(0, testSquad.getHeroes().size());
    }

    @Test
    public void addHero_addsHeroToList_true() {
        Squad testSquad = new Squad(12, "Justice league", "save the world");
        Hero testHero= new Hero("SpiderMan", 2000, "lazer eyes", "kryptontite");
        testSquad.addHero(testHero);
        assertTrue(testSquad.getHeroes().contains(testHero));
    }

    @Test
    public void find_returnsNullWhenNoTaskFound_null() {
        assertTrue(Squad.find(999) == null);
    }
}
