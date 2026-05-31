public class CaesarCipher {
    public static final char[] alphabetRu = {
            'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м',
            'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ',
            'ы', 'ь', 'э', 'ю', 'я'
    };

    public static final char[] alphabetEng = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };


    public void encryptionRu(String text, int key) {
        int[] keyRealisation = new int[text.length()];
        char[] fragment = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            fragment[i] = text.charAt(i);
            for (int o = 0; o < alphabetRu.length; o++) {
                if (fragment[i] == alphabetRu[o]) {
                    keyRealisation[i] = o;
                }
            }
        }
        for (int i = 0; i < keyRealisation.length; i++) {
            if (keyRealisation[i] + key >= alphabetRu.length) {
                int solution = keyRealisation[i] + key - alphabetRu.length;
                System.out.print(alphabetRu[solution]);
            } else {
                System.out.print(alphabetRu[keyRealisation[i] + key]);
            }
        }
    }

    public void encryptionEng(String text, int key) {
        int[] keyRealisation = new int[text.length()];
        char[] fragment = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            fragment[i] = text.charAt(i);
            for (int o = 0; o < alphabetEng.length; o++) {
                if (fragment[i] == alphabetEng[o]) {
                    keyRealisation[i] = o;
                }
            }
        }
        for (int i = 0; i < keyRealisation.length; i++) {
            if (keyRealisation[i] + key >= alphabetEng.length) {
                int solution = keyRealisation[i] + key - alphabetEng.length;
                System.out.print(alphabetEng[solution]);
            } else {
                System.out.print(alphabetEng[keyRealisation[i] + key]);
            }
        }
    }

    public void decryptRu(String text, int key) {
        int[] keyRealisation = new int[text.length()];
        char[] fragment = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            fragment[i] = text.charAt(i);
            for (int o = 0; o < alphabetRu.length; o++) {
                if (fragment[i] == alphabetRu[o]) {
                    keyRealisation[i] = o;
                }
            }
        }
        for (int i = 0; i < keyRealisation.length; i++) {
            if (keyRealisation[i] - key < 0) {
                int solution = keyRealisation[i] - key + alphabetRu.length;
                System.out.print(alphabetRu[solution]);
            } else {
                System.out.print(alphabetRu[keyRealisation[i] - key]);
            }
        }
    }
    public void decryptEng(String text, int key) {
        int[] keyRealisation = new int[text.length()];
        char[] fragment = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            fragment[i] = text.charAt(i);
            for (int o = 0; o < alphabetEng.length; o++) {
                if (fragment[i] == alphabetEng[o]) {
                    keyRealisation[i] = o;
                }
            }
        }
        for (int i = 0; i < keyRealisation.length; i++) {
            if (keyRealisation[i] - key < 0) {
                int solution = keyRealisation[i] - key + alphabetEng.length;
                System.out.print(alphabetEng[solution]);
            } else {
                System.out.print(alphabetEng[keyRealisation[i] - key]);
            }
        }
    }
}



