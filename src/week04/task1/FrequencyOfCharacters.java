package week04.task1;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    /*
    Write a return method that can find the frequency of characters
    Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
    */

    public static String frequencyOfChars(String str) {
            Map<Character, Integer> charCount = new HashMap<>();

            // Count the frequency of each character
            for (char character : str.toCharArray()) {
                charCount.put(character, charCount.getOrDefault(character, 0) + 1);
            }

            // Build the result string
            StringBuilder result = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                result.append(entry.getKey()).append(entry.getValue());
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String input = "AAABBCDD";
            String frequency = frequencyOfChars(input);
            System.out.println(frequency);  // Output: A3B2C1D2
        }
    }


