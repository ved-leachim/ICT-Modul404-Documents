public class TextField {
    private String text;
    private int textLength;
    private boolean isEmpty;
    private boolean hasNumber;
    private int numberCount;
    private boolean hasLetter;
    private int letterCount;

    // CONSTRUCTORS
    public TextField() {

    }

    public TextField(String text) {
        setText(text);
    }

    // GETTER & SETTER
    public String getText() {
        return text;
    }

    public int getTextLength() {
        return textLength;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public boolean getHasNumber() {
        return hasNumber;
    }

    public int getNumberCount() {
        return numberCount;
    }

    public boolean getHasLetter() {
        return hasLetter;
    }

    public int getLetterCount() {
        return letterCount;
    }

    public void setText(String text) {
        text = trimText(text);
        this.text = handleSpecialCharacters(text);
        setTextLength();
        setIsEmpty();
        setHasLetter();
        setLetterCount();
        setHasNumber();
        setNumberCount();
    }

    // IMPLEMENTATION DETAILS

    private void setTextLength() {
        this.textLength = this.text.length();
    }

    private void setIsEmpty() {
        if (this.textLength == 0)
            this.isEmpty = true;
        else
            this.isEmpty = false;
    }

    private void setHasLetter() {
        this.hasLetter = this.text.matches(".*[a-zA-Z*].*");
    }

    private void setLetterCount() {
        int letterCounter = 0;
        for (char letter : this.text.toCharArray()){
            if (Character.isLetter(letter))
                letterCounter++;
        }
        this.letterCount = letterCounter;
    }

    private void setHasNumber(){
        this.hasNumber = this.text.matches(".*\\d.*");
    }

    private void setNumberCount() {
        int numberCounter = 0;
        for (char number: this.text.toCharArray()) {
            if (Character.isDigit(number))
                numberCounter++;
        }
        this.numberCount = numberCounter;
    }
    private String trimText(String text) {
        return text.trim();
    }

    private String handleSpecialCharacters(String text) {
        text = text.replace(',', ' ');
        text = text.replace(',', ' ');
        text = text.replace('.', ' ');
        return text;
    }
}
