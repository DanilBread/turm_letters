public class Main {
    public static void main(String[] args) {
        String inputString = "J@va the be$t!123";

        if (inputString.isEmpty()){
            System.out.println("Input string is empty");
        }
        else {
            int n = inputString.length();
            char c = inputString.charAt(0);
            char[] chars = inputString.toCharArray();
            int left = 0;
            int right = chars.length - 1;

            while (left < right) {
                if (!Character.isLetter(chars[left])) {
                    left++;
                }
                else if (!Character.isLetter(chars[right])) {
                    right--;
                }
                else {
                    char tmp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = tmp;
                    right--;
                    left++;
                }

            }
            String resultString = new String(chars);
            System.out.printf("Исходная строка: \t\t%s\n" +
                    "Строка после разворота: %s", inputString, resultString);
        }

    }
}
