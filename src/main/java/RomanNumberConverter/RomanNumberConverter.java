package romannumberconverter ;

public class RomanNumberConverter {

  public final int[] NUMBER_VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
  public final String[] NUMBER_LETTERS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

  int indexOfInt(int[] tab, int val) {
    for (int j = 0 ; j < tab.length ; j++){
      if (val == tab[j])
        return j;
    }
    return -1;
  }

  int indexOfString(String[] tab, String val) {
    for (int j = 0 ; j < tab.length ; j++){
      if (val.equals(tab[j]))
        return j;
    }
    return -1;
  }

  int convert(String romanNumber){

    int nb = 0 ;
    String current = new String ("");

    for (int i = 0 ; i < romanNumber.length() ; i++) {
      if (i < romanNumber.length()-1)
        current += romanNumber.charAt(i) + romanNumber.charAt(i+1) ;
        int index = indexOfString(NUMBER_LETTERS, current);
        if(index == -1) {
          index = indexOfString(NUMBER_LETTERS, "" + romanNumber.charAt(i));
        }
      else
        current += romanNumber.charAt(i) ;

      nb += NUMBER_VALUES[index];


    }

    return nb ;
  }

  String convert(int number){

    String nb = new String ("") ;

    for (int i = 0 ; i < NUMBER_VALUES.length ; i++){
      if (number == NUMBER_VALUES[i])
        nb += NUMBER_LETTERS[i] ;
    }


    return nb ;
  }

}
