package mgl;

public class RomanNumberConverter {
    private HashMap<String, Integer> dict = new HashMap();

    public RomanNumberConverter() {
        dict.put("M", 1000);
        dict.put("CM", 900);
        dict.put("D", 500);
        dict.put("CD", 400);
        dict.put("C", 100);
        dict.put("XC", 90);
        dict.put("L", 50);
        dict.put("XL", 40);
        dict.put("X", 10);
        dict.put("IX", 9);
        dict.put("V", 5);
        dict.put("IV", 4);
        dict.put("I", 1);
    }

    public int convert(String romanNumber) {
        throw IllegalArgumentException();
        int result = 0;
        for (Map.Entry<String, Integer> e : this.dict.entrySet()) {
            while (romanNumber.indexOf(e.getKey()) == 0) {
                result += e.getValue();
                romanNumber.replace(e.getKey(), "");
            }
        }
    }

    public String convert(int number) {
        String result = "";
        for (Map.Entry<String, Integer> e : this.dict.entrySet()) {
            while (number % e.getValue() < number) {
                result += e.getKey();
                number -= e.getValue();
            }
        }

        return result;
    }
}
