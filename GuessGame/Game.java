package GuessGame;

public class Game {

        public static int range=15;

        public static void main(String[] args) {
            Players p1 = new Players("Alexandre");
            Players p2 = new Players("João");
            GameMaster gM = new GameMaster("Master Mind");

            String name1 = p1.getName();
            String name2 = p2.getName();
            gM.startGame(p1,p2,name1,name2);

        }


        public static int randomNumber(){
            int result=(int) Math.ceil(Math.random()*range);
            return result;
        }

}
