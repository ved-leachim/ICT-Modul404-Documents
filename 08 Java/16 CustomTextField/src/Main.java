public class Main {

    public static void main(String[] args) {
        var newTextField = new TextField("  Philipp, Jay, Fry, / 12.04.1988 / 3012  ");
        System.out.println("Text: " + newTextField.getText());
        System.out.println("Text length : " + newTextField.getTextLength());
        System.out.println("Is text empty: " + newTextField.isEmpty());
        System.out.println("Has text letter: " + newTextField.getHasLetter());
        System.out.println("Number of letters in text: " + newTextField.getLetterCount());
        System.out.println("Has text numbers: " + newTextField.getHasNumber());
        System.out.println("Number of numbers in text: " + newTextField.getNumberCount());

        var newTextField2 = new TextField("");
        System.out.println("Text: " + newTextField2.getText());
        System.out.println("Text length : " + newTextField2.getTextLength());
        System.out.println("Is text empty: " + newTextField2.isEmpty());
        System.out.println("Has text letter: " + newTextField2.getHasLetter());
        System.out.println("Number of letters in text: " + newTextField2.getLetterCount());
        System.out.println("Has text numbers: " + newTextField2.getHasNumber());
        System.out.println("Number of numbers in text: " + newTextField2.getNumberCount());
    }
}
