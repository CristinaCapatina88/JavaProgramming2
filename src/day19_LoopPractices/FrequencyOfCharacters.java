package day19_LoopPractices;
/*

 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = "";


        for (int j = 0; j <str.length() ; j++) {


            char ch = str.charAt(j);//character a
            int count = 0;

            for (int i = 0; i < str.length(); i++) {//find the frequency of each character

                char each = str.charAt(i);//each characters of the string str
                if (ch == each) {
                    count++;
                }

            }
            if (result.contains(""+ch)) {
                continue;
            }
                result+=ch;
            result+=count;
        }
        System.out.println(result);
    }
}
