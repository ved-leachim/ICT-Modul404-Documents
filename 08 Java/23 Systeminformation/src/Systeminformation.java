public class Systeminformation {

    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String activeJava = System.getenv("JAVA_HOME");
        System.out.println("Das verwendete OS ist: " + osName + " \n" +
                "Java befindet sich im Verzeichnis: " + activeJava);
    }
}
