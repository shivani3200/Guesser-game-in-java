package LaunchGame;

 import javax.lang.model.util.*;
 import java.util.*;
//class number 1
 //guesser class who will guess the number
class Guesser{
    int guessNum;
    //method number1
    int guessingNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser! kindly guess the number ");
        guessNum = sc.nextInt();
        return guessNum;
    }//guessingNum method ends
}//guesser class ends

//class number 2
// players class who will guess the guesser's number
class Player{
    int guessNum;
    //method number 2
    int guessingNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player! kindly guess the number");
        guessNum = sc.nextInt();
        return guessNum;
    }//guessingNum class ends
}// player class ends

//class number 3
//umpire class will check guessed numbers from all the 3 players that is guessed by guesser
class Umpire{
    int numberFromGuesser;
    int numberFromPlayer1;
    int numberFromPlayer2;
    int numberFromPlayer3;

    //method number 3
    // storing number given by guesser
    void collectNumFromGuesser(){
        //object of guesser
        Guesser g = new Guesser();
        //storing the number using object g and function guessingNum()
        numberFromGuesser = g.guessingNum();

    }//collectNumFromGuesser method ends

    //method number 4
    // storing numbers guessed by all the 3 players
    void collectNumFromPlayers(){
        //object of player
       Player p1 = new Player();
       Player p2 = new Player();
       Player p3 = new Player(); 
// storing the guessed numbers of players using respective obj and guessingNum() method
        numberFromPlayer1 = p1.guessingNum();
        numberFromPlayer2 = p2.guessingNum();
        numberFromPlayer3 = p3.guessingNum();

    }// collectNumFromPlayers method ends

    //method number 5
    //comparing the numbers
    void compare(){
        //for player 1
        if(numberFromGuesser == numberFromPlayer1){
            if(numberFromGuesser==numberFromPlayer2 && numberFromGuesser== numberFromPlayer3){
                System.out.println("all are winner");
            }else if(numberFromGuesser==numberFromPlayer2){
                System.out.println( "player1 and player2 won the match");
            }else if(numberFromGuesser== numberFromPlayer3){
                System.out.println("player1 and player3 won the game");
            }
            else{
            System.out.println("Player1 won the game!");
        }
    }
       //for player 2
        else if(numberFromGuesser == numberFromPlayer2){
            if(numberFromGuesser==numberFromPlayer3){
                System.out.println("player2 and player3 won the game");
            }
            else
            System.out.println("Player2 won the game!");

        }
       //for player 3
        else if(numberFromGuesser == numberFromPlayer3){
            System.out.println("Player3 won the game!");
        }
        else{
             System.out.println("Game lost!");
        }
    } //compare methos ends
}// umpire method ends


//main class
class GuesserGame{
    public static void main(String[] args) {
        System.out.println("Game started !");
        Umpire u =new Umpire(); //creating object of umpire class to 
        u.collectNumFromGuesser();//calling method in which guesser's number is stored
        u.collectNumFromPlayers();////calling method in which player's number is stored
        u.compare(); //calling compare methods to compare      
    }
}