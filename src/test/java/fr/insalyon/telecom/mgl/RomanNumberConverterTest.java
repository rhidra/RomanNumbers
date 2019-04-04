package mgl;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class RomanNumberConverterTest {

    RomanNumberConverter converter;

    private HashMap<String, Integer> results_basic = new HashMap();
    private HashMap<String, Integer> results_less_basic = new HashMap();

    @Before
    public void setup() {
        converter = new RomanNumberConverter();

        results_basic.put("I", 1);
        results_basic.put("V", 5);
        results_basic.put("X", 10);
        results_basic.put("L", 50);
        results_basic.put("C", 100);
        results_basic.put("D", 500);
        results_basic.put("M", 1000);

        results_less_basic.put('CM', 900);
        results_less_basic.put('CD', 400);
        results_less_basic.put('XC', 90);
        results_less_basic.put('XL', 40);
        results_less_basic.put('IX', 9);
        results_less_basic.put('IV', 4);
    }

    @Test
    public void check_num_to_roman_basic() {
        check_dict_value_to_key(results_basic, converter);
    }

    @Test
    public void check_num_to_roman_less_basic() {
        check_dict_value_to_key(results_less_basic, converter);
    }

    @Test
    public void check_roman_to_num_basic() {
        check_dict_key_to_value(results_basic, converter);
    }

    @Test
    public void check_roman_to_num_less_basic() {
        check_dict_key_to_value(results_less_basic, converter);
    }

    public static void check_dict_value_to_key(Map<String, Integer> dict, RomanNumberConverter converter) {
        for (Map.Entry<String, Integer> e : dict.entrySet()) {
            assertThat(converter.convert(e.getValue()))
                .isEqualTo(e.getKey());
        }
    }

    public static void check_dict_key_to_value(Map<String, Integer> dict, RomanNumberConverter converter) {
        for (Map.Entry<String, Integer> e : dict.entrySet()) {
            assertThat(converter.convert(e.getKey())).isEqualTo(e.getValue());
        }
    }
}
