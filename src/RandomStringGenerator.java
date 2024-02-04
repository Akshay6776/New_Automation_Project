import java.security.SecureRandom;

public class RandomStringGenerator {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom random = new SecureRandom();

    public static String generateRandomString(int minLength, int maxLength) {
        int length = random.nextInt(maxLength - minLength + 1) + minLength;
        StringBuilder randomString = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            randomString.append(randomChar);
        }
        return randomString.toString()+"@gmail.com";
    }

    public static void main(String[] args) {
        int minLength = 6;
        int maxLength = 8;

        String randomString = generateRandomString(minLength, maxLength);
        System.out.println(randomString);
    }
}