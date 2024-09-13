package opgave02;

import jdk.swing.interop.SwingInterOpUtils;

import javax.xml.stream.events.StartDocument;
import java.sql.SQLOutput;

public class Opgave02 {
    public static void main(String[] args) {

        char[] characterArray = getCharacterArray();

        int[] resultA = OpgaveA(characterArray);

        System.out.println("Opgave A: ");
        for (int i = 0; i < resultA.length; i++) {
            System.out.println(resultA[i]);
        }
        System.out.println();

        System.out.print("Opgave B: number of words: ");
        int numberOfWords = OpgaveBNumberOfWords(characterArray);
        System.out.println(numberOfWords);
        System.out.println();

        System.out.print("Opgave B: Number of dots: ");
        int numberOfDots = OpgaveBNumberOfDots(characterArray);
        System.out.println(numberOfDots);
        System.out.println();

        System.out.print("Opgave B: Number of long words: ");
        int numberOfLongWords = OpgaveBNumberOfLongWords(characterArray);
        System.out.println(numberOfLongWords);
        System.out.println();

        System.out.print("Opgave B: The lix number is: ");
        System.out.println(numberOfWords/numberOfDots+numberOfLongWords*100/numberOfWords);

    }

    private static char[] getCharacterArray() {
        return ("Der var så dejligt ude på landet; det var sommer, kornet stod gult, havren grøn, " +
                "høet var rejst i stakke nede i de grønne enge, og der gik storken på sine lange, " +
                "røde ben og snakkede ægyptisk, for det sprog havde han lært af sin moder. Rundt om" +
                " ager og eng var der store skove, og midt i skovene dybe søer; jo, der var rigtignok " +
                "dejligt derude på landet! Midt i solskinnet lå der en gammel herregård med dybe kanaler" +
                " rundt om, og fra muren og ned til vandet voksede store skræppeblade, der var så høje," +
                " at små børn kunne stå oprejste under de største; der var lige så vildsomt derinde, som " +
                "i den tykkeste skov, og her lå en and på sin rede; hun skulle ruge sine små ællinger ud, " +
                "men nu var hun næsten ked af det, fordi det varede så længe, og hun sjælden fik visit;" +
                " de andre ænder holdt mere af at svømme om i kanalerne, end at løbe op og sidde under " +
                "et skræppeblad for at snadre med hende." +
                "Endelig knagede det ene æg efter det andet: pip! pip! sagde det, alle æggeblommerne " +
                "var blevet levende og stak hovedet ud." +
                "Rap! rap! sagde hun, og så rappede de sig alt hvad de kunne, og så til alle sider " +
                "under de grønne blade, og moderen lod dem se så meget de ville, for det grønne er godt for " +
                "øjnene. Hvor dog verden er stor! sagde alle ungerne; thi de havde nu rigtignok ganske " +
                "anderledes plads, end da de lå inde i ægget. Tror I, det er hele verden! sagde moderen, " +
                "den strækker sig langt på den anden side haven, lige ind i præstens mark! " +
                "men der har jeg aldrig været! – I er her dog vel alle sammen! – og så rejste hun sig" +
                " op, nej, jeg har ikke alle! det største æg ligger der endnu; hvor længe skal det vare! nu er " +
                "jeg snart ked af det! og så lagde hun sig igen.").toCharArray();
    }

    public static int[] OpgaveA(char[] text) {

        char[] vocalsUpperCase = {'A','E', 'I', 'O', 'U', 'Y', 'Æ', 'Ø', 'Å'};
        char[] vocalsLowerCase = {'a', 'e', 'i', 'o', 'u', 'y', 'æ', 'ø', 'å'};
        int[] result = new int[vocalsUpperCase.length];

        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < vocalsLowerCase.length; j++) {
                if (text[i] == vocalsLowerCase[j] || text[i] == vocalsUpperCase[j]) {
                    result[j]++;
                }
            }
        }

        return result;
    }

    public static int OpgaveBNumberOfWords(char[] text) {
        int numberOfWords = 0;
        char [] spaces = {' '};
        for (int i = 0; i < text.length; i++){
            if(text[i]==spaces[0]){
                numberOfWords++;
            }
        }


            return numberOfWords+1;
    }

    public static int OpgaveBNumberOfDots(char[] text) {
        int numberOfDots = 0;
        char [] spaces = {'.'};
        for (int i = 0; i < text.length; i++){
            if(text[i]==spaces[0]){
                numberOfDots++;
            }
        }


        return numberOfDots;
    }

    public static int OpgaveBNumberOfLongWords(char[] text) {
        int numberOfLongWords = 0;
        int letters = 0;
        char[] spaces = {' '};
        for (int i = 0; i < text.length; i++){
            if (text[i]==spaces[0] && letters>=6){
                numberOfLongWords++;
                letters = 0;
            }

            else if (text[i]==spaces[0]){
                letters = 0;
            }

            else {
                letters++;
            }
        }



        return numberOfLongWords;
    }
}
