public class RemoveVowel {
    public static void main(String[]args){
        //Problem name - Remove Vowel
        String str = "leetcodeisacommunityforcoders";
        String result = "";
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                continue;
            }
            else
            {
                result += ch;
            }
        }
        System.out.println(result);
        //complexity - Time: o(n) & space: o(n)
    }
}
