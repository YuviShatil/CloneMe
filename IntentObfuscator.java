public class IntentObfuscator {
    private static final int OBFUSCATION_FACTOR = 1;
    private static final String SECRET_CODE = "mppl voefs zvwjt tijsut";
    static void obfuscate() {
        char[] result = new char[SECRET_CODE.length()];
        for (int i = 0; i < result.length; i++) {
            char curr = SECRET_CODE.charAt(i);
            result[i] = curr == ' ' ? curr : (char) (curr - OBFUSCATION_FACTOR);
        }
        System.out.println(result);
    }
}
