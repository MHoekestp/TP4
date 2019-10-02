/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;
import bowling.SinglePlayerGame;
/**
 *
 * @author pedago
 */
public class MainBowling implements bowling.MultiPlayerGame{
    SinglePlayerGame[] board;
    int nombreJ;
    String[] nameList;
    int turn = 0;
    
    public String gameState(String player, int turn, int ball){
        return("Prochain tir: joueur "+player+ " ");
    }
    @Override
    public String startNewGame(String[] playerName) throws Exception {
        
        if(playerName.length == 0){
            throw new java.lang.Exception("tableau vide ou null");
        }
        else{
            this.nombreJ = playerName.length;
            SinglePlayerGame[] J = new SinglePlayerGame[playerName.length];
            for(int i=0; i<nombreJ;i++ ){
                J[i] = new SinglePlayerGame();
            }
            this.nameList = playerName;
            this.board = J;
            return "prochain tir : joueur "+playerName[0]+" , tour n°1, boule n°1";
        }            
    }
    
    @Override
    public String lancer(int nombreDeQuillesAbattues) throws Exception {
        board [turn].lancer(nombreDeQuillesAbattues);
        if(board[turn].hasCompletedFrame()){ this.turn = (turn+1)%nombreJ;}
        return "prochain tir : joueur "+nameList[turn]+" , tour n°"+ board[turn].getFrameNumber()+" ,boule n°"+board[turn].getNextBallNumber();
   
    }

    @Override
    public int scoreFor(String playerName) throws Exception {
        int c=0;
        for(String i : nameList){
            if(i.equals(playerName)){
                return board[c].score() ;
            }
            c++;
        }
        throw new java.lang.Exception("Le joueur ne joue pas dans la partie");
    }
    
}
