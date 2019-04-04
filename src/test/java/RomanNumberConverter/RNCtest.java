package romannumberconverter ;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class RNCtest {
  RomanNumberConverter rnctest ;

  @Before
  public void setup() {
    rnctest = new RomanNumberConverter();
  }

  @Test
  public void checksingle() {
    assertThat(rnctest.convert(1))
      .isNotEmpty()
      .isEqualTo("I");
    assertThat(rnctest.convert(5))
      .isNotEmpty()
      .isEqualTo("V");
    assertThat(rnctest.convert(10))
      .isNotEmpty()
      .isEqualTo("X");
    assertThat(rnctest.convert("I"))
      .isEqualTo(1);
    assertThat(rnctest.convert("V"))
      .isEqualTo(5);
    assertThat(rnctest.convert("X"))
      .isEqualTo(10);
  }

  public void checkother() {
    assertThat(rnctest.convert("XLIX"))
      .isEqualTo(49);
    assertThat(rnctest.convert("IV"))
      .isEqualTo(4);
    assertThat(rnctest.convert("IX"))
      .isEqualTo(9);
    assertThat(rnctest.convert("XCIX"))
      .isEqualTo(99);
  }

}
