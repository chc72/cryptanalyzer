public class CaesarCipher {
    public static final char[] alphabet = {
            'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м',
            'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ',
            'ы', 'ь', 'э', 'ю', 'я'
    };

    public void encryption(String text, int key) {
        int[] keyRealisation = new int[text.length()];
        char[] fragment = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            fragment[i] = text.charAt(i);
            for (int o = 0; o < alphabet.length; o++) {
                if (fragment[i] == alphabet[o]) {
                    keyRealisation[i] = o;
                }
            }
        }
    }
}


