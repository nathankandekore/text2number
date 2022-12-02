
/*
 Write a program that reads a number with commas and decimal dots (such as “23,419.34”) and then prints a
number that is half of it. Do not use Double.parseDouble().
 */

class text2number {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        String number = System.console().readLine();
        float num = Float.parseFloat(number) / 2;

        System.out.println("answer: " + num);

    }
}