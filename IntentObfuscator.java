public class IntentObfuscator {
    private static final int OBFUSCATION_FACTOR = 1;
    static void obfuscate() {
        String source = "mppl voefs zvwjt tijsut";
        char[] result = new char[source.length()];
        for (int i = 0; i < result.length; i++) {
            char curr = source.charAt(i);
            result[i] = curr == ' ' ? curr : (char) (source.charAt(i) - OBFUSCATION_FACTOR);
        }
        System.out.println(result);
    }
}
