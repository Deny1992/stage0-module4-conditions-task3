package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int A = 'A';
        int Z = 'Z';
        int a = 'a';
        int z = 'z';
        if((character >= A && character <= Z) || (character >= a && character <= z)) {
            String str = "aeiouyAEIOUY";
            boolean isVowel = str.indexOf(character) != -1 ? true : false;
            if (isVowel) {
                System.out.println("Vowel");
            }else {
                System.out.println("Consonant");
            }
        }else {
            System.out.println("wrong alphabet!");
        }
    }
}
