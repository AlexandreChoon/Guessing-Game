package GuessGame;

public class Players {
    private String name;
    private int nGuess;
    private static String numbers= " 1 2 3 4 5 6 7 8 9 10 ";
    private boolean found2;

    public Players(String name1) {
         name = name1;
    }
    public String getName() {
        return name;

    }
    public int numberGuesser(){
        numbers=" ";
        //System.out.println(Game.range);
        for (int i=1;i<=Game.range;i++){
            numbers=numbers+Integer.toString(i)+" ";
        }
        //System.out.println(numbers);
        found2=false;

        while (found2==false) {
            nGuess=Game.randomNumber();
            if (numbers.contains(" " + Integer.toString(nGuess) + " ")) {
                System.out.println("I Guess: " + nGuess);
                numbers = numbers.replace(" " + Integer.toString(nGuess) + " ", " ");
                found2 = true;

                return nGuess;
            }
        }
        return nGuess;
    }

}
