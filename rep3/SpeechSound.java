public enum SpeechSound {
    VOWEL, CONSONANT, OTHER;

    public static SpeechSound getType(char ch) {
        String vowels = "aouåeiyäö";
        String consonants = "bcdfghjklmnpqrstvwxz";

        String charString = "" + Character.toLowerCase(ch);

        if (vowels.contains(charString)) {
            return VOWEL;
        }
        else if (consonants.contains(charString)) {
            return CONSONANT;
        }
        else {
            return OTHER;
        }
    }

    public static void countSounds(String text) {
        int vowelCount = 0;
        int consonantCount = 0;
        int otherCount = 0;

        for (char ch : text.toCharArray()) {
            SpeechSound sound = getType(ch);

            switch (sound) {
                case VOWEL -> vowelCount++;
                case CONSONANT -> consonantCount++;
                case OTHER -> otherCount++;
            }
        }

        System.out.printf("Vowels: %d, consonants: %d, other: %d%n",
            vowelCount, consonantCount, otherCount);
    }
}
