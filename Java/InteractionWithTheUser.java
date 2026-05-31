public class InteractionWithTheUser {
    CaesarCipher caesarCipher = new CaesarCipher();

    public void operationBlock() {
        System.out.println("------Шифр цезаря------");
        System.out.println("1. Шифровка с ключём на русском.");
        System.out.println("2. Шифровка с ключём на английском.");
        System.out.println("3. Расшифровка с ключём на русском.");
        System.out.println("4. Расшифровка с ключём на английчком.");
        System.out.print("Операция №:");
    }

    public void case1(String text, int key) {
        if (text != null) {
            key = key % CaesarCipher.alphabetRu.length;
            if (key < 0) {
                key += CaesarCipher.alphabetRu.length;
            }
            text = text.replaceAll(" ", "").toLowerCase();

            caesarCipher.encryptionRu(text, key);
            System.out.println();
        }else {
            System.out.println("Вы ничего не ввели");
        }
    }

    public void case2(String text, int key) {
        if (text != null) {
            key = key % CaesarCipher.alphabetRu.length;
            if (key < 0) {
                key += CaesarCipher.alphabetRu.length;
            }
            text = text.replaceAll(" ", "").toLowerCase();

            caesarCipher.encryptionEng(text, key);
            System.out.println();
        }else {
            System.out.println("Вы ничего не ввели");
        }
    }

    public void case3(String text, int key) {
        if (text != null) {
            key = key % CaesarCipher.alphabetRu.length;
            if (key < 0) {
                key += CaesarCipher.alphabetRu.length;
            }
            text = text.replaceAll(" ", "").toLowerCase();

            caesarCipher.decryptRu(text, key);
            System.out.println();
        }else {
            System.out.println("Вы ничего не ввели");
        }
    }

    public void case4(String text, int key) {
        if (text != null) {
            key = key % CaesarCipher.alphabetRu.length;
            if (key < 0) {
                key += CaesarCipher.alphabetRu.length;
            }
            text = text.replaceAll(" ", "").toLowerCase();

            caesarCipher.decryptEng(text, key);
            System.out.println();
        }else {
            System.out.println("Вы ничего не ввели");
        }
    }
}
