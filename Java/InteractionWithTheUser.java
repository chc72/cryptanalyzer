public class InteractionWithTheUser {
    CaesarCipher caesarCipher = new CaesarCipher();

    public void operationBlock() {
        System.out.println("------Шифр цезаря------");
        System.out.println("1. Шифровка с ключём на русском.");
        System.out.println("2. Шифровка с ключём на английском.");
        System.out.println("3. Расшифровка с ключём на русском.");
        System.out.println("4. Расшифровка с ключём на английчком.");
        System.out.println("5. Из файла .txt по русски.");
        System.out.println("6. Из файла .txt по английски.");
        System.out.println("7. Сохранить в файл форматом .txt");
        System.out.print("Операция №:");
    }

    public void case1(String text, int key) {
        if (text != null) {
            key = key % CaesarCipher.alphabetRu.length;
            if (key < 0) {
                key += CaesarCipher.alphabetRu.length;
            }
            text = text.toLowerCase();
            caesarCipher.encryptionRu(text, key);
            System.out.println();
        } else {
            System.out.println("Вы ничего не ввели");
        }
    }

    public void case2(String text, int key) {
        if (text != null) {
            key = key % CaesarCipher.alphabetEng.length;
            if (key < 0) {
                key += CaesarCipher.alphabetEng.length;
            }
            text = text.toLowerCase();
            caesarCipher.encryptionEng(text, key);
            System.out.println();
        } else {
            System.out.println("Вы ничего не ввели");
        }
    }

    public void case3(String text, int key) {
        if (text != null) {
            key = key % CaesarCipher.alphabetRu.length;
            if (key < 0) {
                key += CaesarCipher.alphabetRu.length;
            }
            text = text.toLowerCase();
            caesarCipher.decryptRu(text, key);
            System.out.println();
        } else {
            System.out.println("Вы ничего не ввели");
        }
    }

    public void case4(String text, int key) {
        if (text != null) {
            key = key % CaesarCipher.alphabetEng.length;
            if (key < 0) {
                key += CaesarCipher.alphabetEng.length;
            }
            text = text.toLowerCase();
            caesarCipher.decryptEng(text, key);
            System.out.println();
        } else {
            System.out.println("Вы ничего не ввели");
        }
    }

    public void case5(String text, int key) {
        if (text != null) {
            key = key % CaesarCipher.alphabetRu.length;
            if (key < 0) {
                key += CaesarCipher.alphabetRu.length;
            }
            text = text.toLowerCase();
            caesarCipher.encryptionRu(text, key);
            System.out.println();
        } else {
            System.out.println("Вы ничего не ввели");
        }
    }

    public void case6(String text, int key) {
        if (text != null) {
            key = key % CaesarCipher.alphabetEng.length;
            if (key < 0) {
                key += CaesarCipher.alphabetEng.length;
            }
            text = text.toLowerCase();
            caesarCipher.encryptionEng(text, key);
            System.out.println();
        } else {
            System.out.println("Вы ничего не ввели");
        }
    }
}
