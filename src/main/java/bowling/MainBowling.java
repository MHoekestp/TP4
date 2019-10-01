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
    
    
    public String gameState(String player, int turn, int ball){
        return("Prochain tir: joueur "+player+ " ");
    }
    @Override
    public String startNewGame(String[] playerName) throws Exception {
        if(playerName.length == 0){
            throw new java.lang.Exception("tableau vide ou null");
        }
        else{
            
        }
        for(int i=0; i<playerName.length;i++){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String lancer(int nombreDeQuillesAbattues) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int scoreFor(String playerName) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
