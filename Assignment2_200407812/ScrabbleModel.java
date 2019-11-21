package sample;

import java.util.ArrayList;

public class ScrabbleModel {

    private String word;
    private int result;
    private String history;

    public int totalNumber;
    public int finalNumber;

    public String log = "";
    public String messages;
    public String errormessage;
    public String gameover;

    private static ArrayList<Integer> list = new ArrayList<Integer>();
    private static ArrayList<String> typedWord = new ArrayList<String>();

    //Declare each bags and its remain
    static int remainE = 12;
    static boolean availableE = true;

    static int remainA = 9;
    static boolean availableA = true;

    static int remainR = 6;
    static boolean availableR = true;

    static int remainO = 8;
    static boolean availableO = true;

    static int remainI = 8;
    static boolean availableI = true;

    static int remainT = 6;
    static boolean availableT = true;

    static int remainS = 4;
    static boolean availableS = true;

    static int remainN = 6;
    static boolean availableN = true;

    static int remainL = 4;
    static boolean availableL = true;

    static int remainD = 4;
    static boolean availableD = true;

    static int remainU = 4;
    static boolean availableU = true;

    static int remainG = 3;
    static boolean availableG = true;

    static int remainP = 2;
    static boolean availableP = true;

    static int remainM = 2;
    static boolean availableM = true;

    static int remainB = 2;
    static boolean availableB = true;

    static int remainH = 2;
    static boolean availableH = true;

    static int remainC = 2;
    static boolean availableC = true;

    static int remainW = 2;
    static boolean availableW = true;

    static int remainY = 2;
    static boolean availableY = true;

    static int remainF = 2;
    static boolean availableF = true;

    static int remainV = 2;
    static boolean availableV = true;

    static int remainK = 1;
    static boolean availableK = true;

    static int remainX = 1;
    static boolean availableX = true;

    static int remainZ = 1;
    static boolean availableZ = true;

    static int remainJ = 1;
    static boolean availableJ= true;

    static int remainQ = 1;
    static boolean availableQ = true;


    public ScrabbleModel(String word){

        // validation part
        if(word.length() > 1  && word.length() <= 8 && checkVowel(word) && checkDuplicated(word) && checkAvailability(word))
        {
            System.out.println("Validation all green, word accepted");
//            System.out.println(availableA);
            this.result = convertStringToNumber(word);
            this.history = collectHistory(word);
            setResult(result);
            setHistory(history);

        }else{
            String dummy = "0";
            setMessages("Invalid keyword..\nInput should be:\n\n*2 letters minimum\n*8 letters maximum\n*No duplicate words");
            this.result = convertStringToNumber(dummy);

//            System.out.println(availableA);
//            this.result = convertStringToNumber(word);

            //setResult(result);
            /*
            System.out.println("Invalid keyword..");
            System.out.println("Input should be as following:");
            System.out.println("2 letters minimum");
            System.out.println("8 letters maximum");
            System.out.println("Cannot have duplicate words");
            */

        }

    }

    //This method validates if the word contains any invalid (already emptied in bag) word
    private boolean checkAvailability(String word) {
        //convert the word to LowerCase
        String sword = word.toLowerCase();
        //check each words whether the word is still available, if not, return false
        if(!availableA && sword.contains("a")){
            System.out.println("you used A 9 times already. A is not available");
            setErrormessage("you used A 9 times.\n A is not available");
            return false;
        }else if(!availableB && sword.contains("b")){
            System.out.println("you used B 2 times already. B is not available");
            setErrormessage("you used B 2 time.\n B is not available");
            return false;
        }else if(!availableC && sword.contains("c")){
            System.out.println("you used C 2 times already. C is not available");
            setErrormessage("you used C 2 time.\n C is not available");
            return false;
        }else if(!availableD && sword.contains("d")){
            System.out.println("you used D 4 times already. D is not available");
            setErrormessage("you used D 4 time.\n D is not available");
            return false;
        }else if(!availableE && sword.contains("e")){
            System.out.println("you used E 12 times already. E is not available");
            setErrormessage("you used E 12 time.\n E is not available");
            return false;
        }else if(!availableF && sword.contains("f")){
            System.out.println("you used F 2 times already. F is not available");
            setErrormessage("you used F 2 time.\n F is not available");
            return false;
        }else if(!availableG && sword.contains("g")){
            System.out.println("you used G 3 times already. G is not available");
            setErrormessage("you used G 3 time.\n G is not available");
            return false;
        }else if(!availableH && sword.contains("h")){
            System.out.println("you used H 2 times already. H is not available");
            setErrormessage("you used H 2 time.\n H is not available");
            return false;
        }else if(!availableI && sword.contains("i")){
            System.out.println("you used I 8 times already. I is not available");
            setErrormessage("you used I 8 time.\n I is not available");
            return false;
        }else if(!availableJ && sword.contains("j")){
            System.out.println("you used J 1 times already. J is not available");
            setErrormessage("you used J 1 time.\n J is not available");
            return false;
        }else if(!availableK && sword.contains("k")){
            System.out.println("you used K 1 times already. K is not available");
            setErrormessage("you used K 1 time.\n K is not available");
            return false;
        }else if(!availableL && sword.contains("l")){
            System.out.println("you used L 4 times already. L is not available");
            setErrormessage("you used L 4 time.\n L is not available");
            return false;
        }else if(!availableM && sword.contains("m")){
            System.out.println("you used M 2 times already. M is not available");
            setErrormessage("you used M 2 time.\n M is not available");
            return false;
        }else if(!availableN && sword.contains("n")){
            System.out.println("you used N 6 times already. N is not available");
            setErrormessage("you used N 6 time.\n N is not available");
            return false;
        }else if(!availableO && sword.contains("o")){
            System.out.println("you used O 8 times already. O is not available");
            setErrormessage("you used O 8 time.\n O is not available");
            return false;
        }else if(!availableP && sword.contains("p")){
            System.out.println("you used P 2 times already. P is not available");
            setErrormessage("you used P 2 time.\n P is not available");
            return false;
        }else if(!availableQ && sword.contains("q")){
            System.out.println("you used Q 1 times already. Q is not available");
            setErrormessage("you used Q 1 time.\n Q is not available");
            return false;
        }else if(!availableR && sword.contains("r")){
            System.out.println("you used R 6 times already. R is not available");
            setErrormessage("you used R 1 time.\n R is not available");
            return false;
        }else if(!availableS && sword.contains("s")){
            System.out.println("you used S 4 times already. S is not available");
            setErrormessage("you used S 4 time.\n S is not available");
            return false;
        }else if(!availableT && sword.contains("t")){
            System.out.println("you used T 6 times already. T is not available");
            setErrormessage("you used T 6 time.\n T is not available");
            return false;
        }else if(!availableU && sword.contains("u")){
            System.out.println("you used U 4 times already. U is not available");
            setErrormessage("you used U 4 time.\n U is not available");
            return false;
        }else if(!availableV && sword.contains("v")){
            System.out.println("you used V 2 times already. V is not available");
            setErrormessage("you used V 2 time.\n V is not available");
            return false;
        }else if(!availableW && sword.contains("w")){
            System.out.println("you used W 2 times already. W is not available");
            setErrormessage("you used W 2 time.\n W is not available");
            return false;
        }else if(!availableX && sword.contains("x")){
            System.out.println("you used X 1 times already. X is not available");
            setErrormessage("you used X 1 time.\n X is not available");
            return false;
        }else if(!availableY && sword.contains("y")){
            System.out.println("you used Y 2 times already. Y is not available");
            setErrormessage("you used Y 2 time.\n Y is not available");
            return false;
        }else if(!availableZ && sword.contains("z")){
            System.out.println("you used Z 1 times already. Z is not available");
            setErrormessage("you used Z 1 time.\n Z is not available");
            return false;
        }

        //in the case none of above codes detected invalid words...
        else
        // return TRUE --> proceed the processor
        return true;
    }

    //This method checks if the word is used more than once before
    private boolean checkDuplicated(String word) {

//        char[] dup = word.toCharArray();
//        int cnt = 0;
            for(int ii = 0 ; ii < typedWord.size(); ii++){
                if(typedWord.get(ii).equals(word)){
                    System.out.println("Duplicated words found");
//                    cnt++;
//                    System.out.println("DW no: " + cnt);

                    //if the duplicated word found? --> Cancel the processor
                    return false;
                }
        }
            // if no duplicated words found? --> proceed the processor
        return true;
    }


    // This method checks if the word has at least one Vowel in it
    private boolean checkVowel(String word) {
        for(int i = 0 ; i < word.length(); i++){
            char c = word.toUpperCase().charAt(i);
            if(c == 'A' || c == 'I' || c == 'U' || c == 'E' || c == 'O' || c == 'Y'){
                // if the word contains at least one Vowel? --> proceed the processor
                return true;
            }
        }
        //if the word has contains no Vowel? --> Cancel the processor
        return false;
    }

    //This method collects every words accepted
    private String collectHistory(String word) {
        // add the word to arraylist, typedWord
        typedWord.add(word);

        for(int c = 0; c < typedWord.size() ; c++){
            // if it reaches to the last part of the array, put a dot to finish the line
            if(c == typedWord.size()-1){
                log += typedWord.get(c) + ".";
            }else
                // put , after every words unless it is the last part of array
            log += typedWord.get(c) +", ";
        }
       // System.out.println(log);
        // now returns the whole sentence as one string "log"
        return log;
    }


    //This method converts the word into points(INT)
    private int convertStringToNumber(String word) {

        for(int i = 0 ; i < word.length(); i++){
           // break the word into piece of char
            char w = word.charAt(i);
           // then check the existance of each words, if it exists, decrease the number of remain, and also add the point
            if(w == 'a'|| w == 'A'){
                remainA--;
                System.out.println("the remain of A is: " + remainA);
                // of the remain gets 0 , turn the availability to be false
                if(remainA == 0){
     //               A.setStyle("-fx-font-size:14px;");
                    availableA = false;
                }
                totalNumber += 1;
            }else if(w == 'b' || w == 'B'){
                remainB--;
                System.out.println("the remain of B is: " + remainB);
                if(remainB == 0){
                    availableB = false;
                }
                totalNumber += 3;
            }else if(w == 'c' || w == 'C'){
                remainC--;
                System.out.println("the remain of C is: " + remainC);
                if(remainC == 0){
                    availableC = false;
                }
                totalNumber += 3;
            }else if(w == 'd' || w == 'D'){
                remainD--;
                System.out.println("the remain of D is: " + remainD);
                if(remainD == 0){
                    availableD = false;
                }
                totalNumber += 2;
            }else if(w == 'e' || w == 'E'){
                remainE--;
                System.out.println("the remain of E is: " + remainE);
                if(remainE == 0){
                    availableE = false;
                }
                totalNumber += 1;
            }else if(w == 'f' || w == 'F'){
                remainF--;
                System.out.println("the remain of F is: " + remainF);
                if(remainF == 0){
                    availableF = false;
                }
                totalNumber += 4;
            } else if(w == 'g'|| w == 'G'){
                remainG--;
                System.out.println("the remain of G is: " + remainG);
                if(remainG == 0){
                    availableG = false;
                }
                totalNumber += 2;
            } else if(w == 'h'|| w == 'H'){
                remainH--;
                System.out.println("the remain of H is: " + remainH);
                if(remainH == 0){
                    availableH = false;
                }
                totalNumber += 4;
            } else if(w == 'i'|| w == 'I'){
                remainI--;
                System.out.println("the remain of I is: " + remainI);
                if(remainI == 0){
                    availableI = false;
                }
                totalNumber += 1;
            } else if(w == 'j'|| w == 'J'){
                remainJ--;
                System.out.println("the remain of J is: " + remainJ);
                if(remainJ == 0){
                    availableJ = false;
                }
                totalNumber += 8;
            } else if(w == 'k'|| w == 'K'){
                remainK--;
                System.out.println("the remain of K is: " + remainK);
                if(remainK == 0){
                    availableK = false;
                }
                totalNumber += 5;
            } else if(w == 'l'|| w == 'L'){
                remainL--;
                System.out.println("the remain of L is: " + remainL);
                if(remainL == 0){
                    availableL = false;
                }
                totalNumber += 1;
            } else if(w == 'm'|| w == 'M'){
                remainM--;
                System.out.println("the remain of M is: " + remainM);
                if(remainM == 0){
                    availableM = false;
                }
                totalNumber += 3;
            } else if(w == 'n'|| w == 'N'){
                remainN--;
                System.out.println("the remain of N is: " + remainN);
                if(remainN == 0){
                    availableN = false;
                }
                totalNumber += 1;
            } else if(w == 'o'|| w == 'O'){
                remainO--;
                System.out.println("the remain of O is: " + remainO);
                if(remainO == 0){
                    availableO = false;
                }
                totalNumber += 1;
            } else if(w == 'p'|| w == 'P'){
                remainP--;
                System.out.println("the remain of P is: " + remainP);
                if(remainP == 0){
                    availableP = false;
                }
                totalNumber += 3;
            } else if(w == 'q'|| w == 'Q'){
                remainQ--;
                System.out.println("the remain of Q is: " + remainQ);
                if(remainQ == 0){
                    availableQ = false;
                }
                totalNumber += 10;
            } else if(w == 'r'|| w == 'R'){
                remainR--;
                System.out.println("the remain of R is: " + remainR);
                if(remainR == 0){
                    availableR = false;
                }
                totalNumber += 1;
            } else if(w == 's'|| w == 'S'){
                remainS--;
                System.out.println("the remain of S is: " + remainS);
                if(remainS == 0){
                    availableS = false;
                }
                totalNumber += 1;
            } else if(w == 't'|| w == 'T'){
                remainT--;
                System.out.println("the remain of T is: " + remainT);
                if(remainT == 0){
                    availableT = false;
                }
                totalNumber += 1;
            } else if(w == 'u'|| w == 'U'){
                remainU--;
                System.out.println("the remain of U is: " + remainU);
                if(remainU == 0){
                    availableU = false;
                }
                totalNumber += 1;
            } else if(w == 'v'|| w == 'V'){
                remainV--;
                System.out.println("the remain of V is: " + remainV);
                if(remainV == 0){
                    availableV = false;
                }
                totalNumber += 4;
            } else if(w == 'w'|| w == 'W'){
                remainW--;
                System.out.println("the remain of W is: " + remainW);
                if(remainW == 0){
                    availableW = false;
                }
                totalNumber += 4;
            } else if(w == 'x'|| w == 'X'){
                remainX--;
                System.out.println("the remain of X is: " + remainX);
                if(remainX == 0){
                    availableX = false;
                }
                totalNumber += 8;
            } else if(w == 'y'|| w == 'Y'){
                remainY--;
                System.out.println("the remain of Y is: " + remainY);
                if(remainY == 0){
                    availableY = false;
                }
                totalNumber += 4;
            } else if(w == 'z'|| w == 'Z'){
                remainZ--;
                System.out.println("the remain of Z is: " + remainZ);
                if(remainZ == 0){
                    availableZ = false;
                }
                totalNumber += 10;
            } else if(w == '0'){
                totalNumber += 0;
            }
    }

        //add the total points from the word into arraylist:list
        list.add(totalNumber);

        //This for loop calculate the accumulated final total points
        for(int ii = 0 ; ii < list.size(); ii++){

            finalNumber += list.get(ii);
//            System.out.println(list.get(ii));
//            System.out.println("This is total number: " + totalNumber);
//            System.out.println("This is final number: " + finalNumber);
        }

/*    for(Integer number : list){
        System.out.println("Number = " + number);
    }
*/

    return finalNumber;
    }//end of convertStringToNumber


    public void setGameover(String gameover) {
        this.gameover = gameover;
    }

    // this method simply generates the total number of remains of all bags
    public int RemainInBag(){
        int remain = remainA+remainB+remainC+remainD+remainE+remainF+remainG+remainH+remainI+
                remainJ+remainK+remainL+remainM+remainN+remainO+remainP+remainQ+remainR+remainS+remainT+
                remainU+remainV+remainW+remainX+remainY+remainZ;
        return remain;
    }


    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getHistory() {
        return history;
    }
    public void setHistory(String history) {
        this.history = history;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

}// end of ScrabbleModel
