
public class Start {

    public String word1;
    public String word2;
    public String word3;
    public String word4;
    public String word5;
    public String word6;
    public String word7;
    public String word8;
    public String word9;
    public String word10;


    public Start(String word1, String word2, String word3, String word4, String word5, String word6, String word7, String word8, String word9, String word10) {
        this.word1 = word1;
        this.word2 = word2;
        this.word3 = word3;
        this.word4 = word4;
        this.word5 = word5;
        this.word6 = word6;
        this.word7 = word7;
        this.word8 = word8;
        this.word9 = word9;
        this.word10 = word10;
    }

    public static void main(String[] args) {

        Start start = new Start("we", "have", "had", "the", "most", "informative", "java", "class", "today", "at 21");

        String sentence = start.word1.concat(" ").concat(start.word2).concat(" ").concat(start.word3).concat(" ").concat(start.word4).concat(" ").concat(start.word5).concat(" ").concat(start.word6).concat(" ").concat(start.word7).concat(" ").concat(start.word8).concat(" ").concat(start.word9).concat(" ").concat(start.word10).concat(" ");

        System.out.println(sentence);

    }
}
