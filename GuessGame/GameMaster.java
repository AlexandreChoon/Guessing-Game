package GuessGame;

public class GameMaster {
    private boolean found;
    private String name;
    private int nPicked;
    public GameMaster (String name1) {
            name = name1;
    }

    public void numberPicker(){
        nPicked =Game.randomNumber();
        System.out.println("Your GameMaster " + name + " has chosen a number!!");
        System.out.println("I picked: "+ nPicked +"(secret)");



    }
    public void compare(int guess,String namep){
        if(guess==nPicked){
            System.out.println("Congratulations, "+ namep+" You win nothing!");
            found = true;
            return;
        }
        System.out.println("Wrong, "+ namep +" keep trying NOOB!");
        return;
    }
    public void startGame(Players player1, Players player2,String name1, String name2){
        numberPicker();

        while (found == false) {
            System.out.println(name1 + ", pick a number?");
      int guess1 = player1.numberGuesser();
        compare(guess1,name1);
        if (found==false) {
            System.out.println(name2 + ", pick a number?");
            int guess2 = player2.numberGuesser();
            compare(guess2,name2);
        }
        }

    }



}
