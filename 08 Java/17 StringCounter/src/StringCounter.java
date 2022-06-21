public class StringCounter {

    public static void main (String[] args) {
        String needToCheck = "RhabarberbaRbarabaRbarbaRenbartbaRbierbierbaRbärbel";
        byte countOfRs = countOfRs(needToCheck);
        System.out.println("In der Zeichenkette: \"" + needToCheck + "\" kommt der Buchstabe R/r " + countOfRs + " vor.");
    }

    public static byte countOfRs(String stringToCheck) {
        byte countOfRs = 0;
        stringToCheck = stringToCheck.toUpperCase();
        for (int i = 0; i < stringToCheck.length(); i++) {
            if (stringToCheck.charAt(i) == 'R')
                countOfRs++;
        }
        return countOfRs;
    }
}
