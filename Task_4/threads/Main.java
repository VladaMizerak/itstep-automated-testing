package Task_4.threads;

public class Main {
    //Make two threads and connect them to play a Ping-Pong game.
    // One thread should write “ping” to the console, another - “pong”.
    // Each thread should add his own name to his message.
    // It will be good to finish that game after a few seconds.
    // Try to use Executors and different implementation of Thread


    public static void main(String[] args){

        PingPongPlayer player1 = new PingPongPlayer("ping");
        PingPongPlayer player2 = new PingPongPlayer("pong");
        player1.start();
        player2.start();

    }


}
