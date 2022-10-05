public class CharCounter {
    static String VOCALS;
    int vocales;

    public CharCounter() {
        VOCALS = "aeiou";
        vocales=0;
    }

    public void countIfRargeted(char c) {
        for (int i = 0; i < VOCALS.length(); i++) {
            if (c == VOCALS.charAt(i)) {
                vocales++;
            }
        }
    }

    public int getVocales() {
        return vocales;
    }
}
