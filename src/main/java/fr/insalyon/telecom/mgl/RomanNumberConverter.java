package mgl;

public class RomanNumberConverter {
    private HashMap<Character, Integer> dict = new HashMap();

    public RomanNumberConverter() {
        dict.put('M', 1000);
        dict.put('CM', 900);
        dict.put('D', 500);
        dict.put('CD', 400);
        dict.put('C', 100);
        dict.put('XC', 90);
        dict.put('L', 50);
        dict.put('XL', 40);
        dict.put('X', 10);
        dict.put('IX', 9);
        dict.put('V', 5);
        dict.put('IV', 4);
        dict.put('I', 1);

    }

    public int convert(String romanNumber) {
        /*var result = 0;
          // the result is now a number, not a string
          var decimal = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1];
          var roman = ["M", "CM","D","CD","C", "XC", "L", "XL", "X","IX","V","IV","I"];
          for (var i = 0;i<=decimal.length;i++) {
            while (str.indexOf(roman[i]) === 0){
              result += decimal[i];
              str = str.replace(roman[i],'');
            }
          }
          return result;*/

          int result = 0;
          for (Map.Entry<Character, Integer> e : this.dict.entrySet()) {
              while (romanNumber.indexOf(e.getKey()) == 0) {
                  result += e.getValue();
                  romanNumber.replace(e.getKey(), '');
              }
          }
    }

    public String convert(int number) {
        String result = '';
        for (Map.Entry<Character, Integer> e : this.dict.entrySet()) {
            while (number % e.getValue() < number) {
                result += e.getKey();
                number -= e.getValue();
            }
        }

        return result;
    }
}
