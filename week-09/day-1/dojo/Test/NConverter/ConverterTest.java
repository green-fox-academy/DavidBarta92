package NConverter;

import com.company.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

  @Test
  public void second(){
    assertEquals("seven", Main.convert(7));
  }

  @Test
  public void third(){
    assertEquals("nineteen", Main.convert(19));
  }

  @Test
  public void fourth(){
    assertEquals("one hundred", Main.convert(100));
  }

  @Test
  public void saa(){
    assertEquals("zero", Main.convert(000));
  }

  @Test
  public void saaa(){
    assertEquals("one", Main.convert(001));
  }

  @Test
  public void saaaa(){
    assertEquals("ten", Main.convert(0010));
  }
}
