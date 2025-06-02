public class MostWordFound {
    public int maximumNumber(String [] sentences){
        int [] counts = new int[sentences.length];
        for(int i=0;i<sentences.length;i++){
            String sentence = sentences[i];
            for(int j=0;j<sentence.length();j++){
                char ch = sentence.charAt(j);
                if(ch==' '){
                    counts[i]++;
                }
            }
            counts[i]++;
        }
        int max=counts[0];
        for(int i=0; i<counts.length; i++){
            max=Math.max(max,counts[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        MostWordFound mostWordFound = new MostWordFound();
        String[] sentences = {
                "alice and bob love leetcode",
                "I think so too",
                "this is great thanks very much"
        };

        int result = mostWordFound.maximumNumber(sentences);
        System.out.println("Maximum number of words in a sentence: " + result);
    }


}
