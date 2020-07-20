package Anagram;

import org.junit.Test;

import static com.company.Main.anagram;
import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void first(){
    assertTrue(anagram("god","dog"));
  }

  @Test
  public void first2(){
    assertTrue(anagram("",""));
  }

  @Test
  public void second(){
    assertFalse(anagram("god","asd"));
  }
}

