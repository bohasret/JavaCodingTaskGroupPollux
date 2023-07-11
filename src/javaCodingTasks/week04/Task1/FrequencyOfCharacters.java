package javaCodingTasks.week04.Task1;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        FrequencyOfCharacters.frequencyOfChars("AAABBCDD");
    }

    public static void frequencyOfChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;           //0 --> 1 --> 2 --> 3 --> 4 --> 5 --> 6 --> 7
            char ch = str.charAt(i); //A --> A --> A --> B --> B --> C --> D --> D
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {// A==A-->A==A-->A==A-->A!=B-->A!=B-->A!=C-->A!=D-->A!=D
                    count++;           //0---->1----->2---->3------>3----->3----->3----->3----->3
                }
            }
            if (result.contains("" + ch)) {
                continue;              //A(add)->A(skip)->A(skip)->B(add)->B(skip)->C(add)->D(add)->D(skip)
            }
            result += ch + "" + count; //result=A3->result=A3B2->result=A3B2C1->result=A3B2C1D2
        }
        System.out.println(result);
    }
}
/*
Write a return method that can find the frequency of characters
ex. frequencyOfChars("AAABBCDD")==> A3B2C1D2
 */