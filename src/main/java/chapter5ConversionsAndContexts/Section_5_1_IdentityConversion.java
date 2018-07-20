package chapter5ConversionsAndContexts;

/*
 * Consequence of "Identity" Conversion
 * 1. Every expression is subject to conversion
 * 2. Allows programmers to include redundant cast operations for the sake of clarity
 *
 * */

public class Section_5_1_IdentityConversion {

  public static void castingToSameTypeIsPossible() {
    StringBuffer sb = new StringBuffer();
    StringBuffer cast = (StringBuffer) sb;
  }

  public static void redundantCastingForTheSakeOfClarity() {
    Integer integerObject = 19;
    Double doubleObject = (Double) (1.0 + integerObject);
  }
}
