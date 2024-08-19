public class Main {
    public static void main(String[] args) {
        //1st task:
        byte byteVariable = 127;
        short shortVariable = 32767;
        int intVariable = 32768;
        long longVarible = 3_000_000_000_000L;
        float floatVariable = 0.1f;
        double dubleVariable = 2.5;

        System.out.println(
                "byteVariable value is " + byteVariable + "\n" +
                        "shortVariable value is " + shortVariable + "\n" +
                        "intVariable value is " + intVariable + "\n" +
                        "longVariable value is " + longVarible + "\n" +
                        "floatVariable value is " + floatVariable + "\n" +
                        "doubleVariable value is " + dubleVariable + "\n"
        );
        System.out.println();


        //2nd task:
        float one = 27.12f;
        long two = 987_678_965_549L;
        String three = "2,786";
        short four = 569;
        short five = -159;
        short six = 27897;
        byte seven = 67;

        System.out.println();


        //3rd task:
        byte teacher1 = 23,
                teacher2 = 27,
                teacher3 = 30;
        short paper = 480;
        short perStudent = (short) (paper/(teacher1 + teacher2 + teacher3));

        System.out.println("Every student will get " + perStudent + " sheets.");
        System.out.println();


        //4th task:
        int per20minutes = 20 * 16 / 2;
        int perDay = 60 * 24 * 16 / 2;
        int per3days = perDay * 3;
        int perMonth = per3days * 30;

        System.out.println(
                "The machine produces " + per20minutes + " bottles per 20 minutes\n" +
                         perDay + " bottles per day\n" +
                         per3days + " bottles per 3 days\n" +
                        perMonth + " bottles per month\n"
        );
        System.out.println();


        //5th task:
        byte allCans = 120;
        byte whiteCanPerClass = 2;
        byte brownCanPerClass = 4;
        byte classes = (byte) (allCans / (whiteCanPerClass + brownCanPerClass));

        System.out.println(
                "In a school with " + classes + " classes we need " +
                        (classes / whiteCanPerClass) + " white color cans and " +
                        (classes / brownCanPerClass) + " brown color cans."
        );
        System.out.println();


        //6th task:
        byte banana = 5;
        byte milk = 2;
        byte icecream = 2;
        byte egg = 4;
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte icecreamWeight = 100;
        byte eggWeight = 70;
        int totalWeightGram = banana * bananaWeight + milk * milkWeight +
                icecream * icecreamWeight + egg * eggWeight;
        float totalWeightKilogram = (float) totalWeightGram / 1000;

        System.out.println(
            "Total weight of all products is " + totalWeightGram + " grams or " +
                         totalWeightKilogram + " kilograms."
        );
        System.out.println();


        //7th task:
        short targetWeight = 7000;
        short weightPerDay250 = 250;
        short weightPerDay500 = 500;
        short daysFor250 =  (short) (targetWeight / weightPerDay250);
        short daysFor500 =  (short) (targetWeight / weightPerDay500);
        float averageDays = (float) (daysFor250 + daysFor500) / 2;

        System.out.println(
                "250 per day program needs " + daysFor250 + " days\n" +
                        "500 per day program needs " + daysFor500 + " days\n" +
                        "Average amount of days are " + averageDays
        );
        System.out.println();


        //8th task:
        int mashaMonth = 67760;
        int denisMonth = 83690;
        int cristinaMonth = 76230;
        float percent = 1.1f;
        float mashaAnnualDiff = (mashaMonth * percent  - mashaMonth) * 12;
        float denisAnnualDiff = (denisMonth * percent  - denisMonth) * 12;
        float cristinaAnnualDiff = (cristinaMonth * percent  - cristinaMonth) * 12;

        System.out.println(
                "Masha earns " + (mashaMonth * percent) + " rubles, annual income raised by " + mashaAnnualDiff + " rubles\n" +
                        "Denis earns " + (denisMonth * percent) + " rubles, annual income raised by " + denisAnnualDiff + " rubles\n" +
                        "Cristina earns " + (cristinaMonth * percent) + " rubles, annual income raised by " + cristinaAnnualDiff + " rubles"

        );
    }
}