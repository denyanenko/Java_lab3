public class Main {
    public static void main(String[] args) {
        int lengthToRemove = 4;
        String text = "Думи мої, думи мої,\n" +
                "Лихо мені з вами!\n" +
                "Нащо стали на папері\n" +
                "Сумними рядами?..\n" +
                "Чом вас вітер не розвіяв\n" +
                "В степу, як пилину?\n" +
                "Чом вас лихо не приспало,\n" +
                "Як свою дитину?...\n" +
                "За карії оченята,\n" +
                "За чорнії брови\n" +
                "Серце рвалося, сміялось,\n" +
                "Виливало мову,\n" +
                "Виливало, як уміло,\n" +
                "За темнії ночі,\n" +
                "За вишневий сад зелений,\n" +
                "За ласки дівочі...\n" +
                "За степи та за могили,\n" +
                "Що на Україні,\n" +
                "Серце мліло, не хотіло\n" +
                "Співать на чужині...\n";
        if(text==null) {
            System.out.println("text is null");
            return;
        }
        System.out.println("Текст до редагування:\n");
        System.out.println(text);
        System.out.println("Видалення слів, що починаються з приголосної довжиною " + lengthToRemove + "\n");
        String[] words = text.split("(\\s|,|!|\\.|-|—|\\?|:|\\(|\\)|;|«|»)+");
        for (String word : words) {
            if (word.length() == lengthToRemove && startsWithConsonant(word)) {
                text = text.replaceAll("\\b" + word + "\\b", "");

            }
        }
        System.out.println(text);
    }

    // Метод для перевірки, чи слово починається з приголосної літери
    public static boolean startsWithConsonant(String word) {
        String lowercaseWord;
        lowercaseWord = word.toLowerCase();
        char firstLetter = lowercaseWord.charAt(0);
        return "бвгґджзйклмнпрстфхцчшщ".indexOf(firstLetter) >= 0;
    }

}
