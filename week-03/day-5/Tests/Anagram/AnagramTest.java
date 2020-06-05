package Anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void anagram() {
        Anagram anagram = new Anagram();
        assertTrue(anagram.anagram("god","dog"));
    }
    @Test
    public void notAnagram() {
        Anagram anagram = new Anagram();
        assertFalse(anagram.anagram("cat","dog"));
    }

}