package guru.qa;

public class HelloWorld {

    public static void main(String[] args) {
        String stringThatShouldBeDisplayedInConsole = "мир";

        // must have (надо знать и помнить о нем всегда)
        boolean flag = true;

        byte aByte; // 8 бит (-128 / 127)  -(2^7) / (2^7)-1
        short aShort; // 16 бит (-32768 / 32767) -(2^15) / (2^15)-1

        // must have (надо знать и помнить о нем всегда)
        int aInt = 0; // 32 бит

        long aLong; // 64 бит
        float aFloat; // 32 бит

        // must have (надо знать и помнить о нем всегда)
        double aDouble = 1.5;  // 64 бит
        char aChar = '0';

        // Операторы математические + - * / %
        // Операторы условные > < >= <= == != !
        // Операторы логические && ||

        int a = 15;
        int b = 10;

        System.out.println(3 > 2 && 1 > 0);

        if (stringThatShouldBeDisplayedInConsole != null
                && stringThatShouldBeDisplayedInConsole.length() == 3) {
            System.out.println("Строка из трех символов!: " + stringThatShouldBeDisplayedInConsole);
        } else if (stringThatShouldBeDisplayedInConsole == null) {
            System.out.println("Строка null!: " + stringThatShouldBeDisplayedInConsole);
        } else {
            System.out.println("Строка не из трех символов!: " + stringThatShouldBeDisplayedInConsole);
        }


        switch (stringThatShouldBeDisplayedInConsole) {
            case "мир": {
                System.out.println(" В переменной слово \"Мир\"");
                break;
            }
            case "еще что-то": {
                System.out.println(" В переменной слово \"еще что-то\"");
                break;
            }
            default: {
                System.out.println("Ни то ни другое ( ");
            }
        }

        System.out.println(
                stringThatShouldBeDisplayedInConsole == null
                        ? "У вас null"
                        : stringThatShouldBeDisplayedInConsole
        );

        if ( stringThatShouldBeDisplayedInConsole == null) {
            System.out.println("У вас null");
        } else {
            System.out.println(stringThatShouldBeDisplayedInConsole);
        }
    }
}
