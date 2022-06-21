public class LordVonTyrel {

    public static void main (String[] args) {
        String name = "John Tyrion Jamie Aria Schnee Lannister Stark von Tyrell";

        String initials = getInitials(name);
        System.out.println(initials);
    }

    public static String getInitials(String name) {
        var initials = new StringBuilder();
        initials.append(name.charAt(0)).append(".");
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ')
                initials.append(name.charAt(i + 1)).append(".");
        }
        return initials.toString();
    }
}
