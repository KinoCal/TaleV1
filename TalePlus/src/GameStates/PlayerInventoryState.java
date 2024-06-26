package GameStates;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import package01.Game;
import package01.InventoryHandler;
import package01.Player;
import package01.UI;

public class PlayerInventoryState extends GameState implements ActionListener {
	

	public PlayerInventoryState(Game game, Player player, UI ui, InventoryHandler iHandler) {
		super(game, player, ui, iHandler);
		setName("InventoryState");
		// TODO Auto-generated constructor stub
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
        //game.player.setCurrentState(this);
		//player.setAbsoluteCurrentState();
        System.out.println(GameState.getCurrentState() + " inside inventorystate*");
        //System.out.println(GameState.getGameStateStack().pop());
        System.out.println("*Current GameStateStack-> " + getGameStateStack());
        System.out.println("*Current GameStateState " + getCurrentState().getName() 
        			     + "*Current PlayerState " + player.getCurrentState().getName());
        
        
        
        
		
	}

	@Override
	public void ui() {
		// TODO Auto-generated method stub
		ui.updateTextArea("Welcome to " + player.getCurrentState().getName());
		ui.button1.setVisible(false);
		ui.button4.setVisible(true);
		ui.button4.removeActionListener(iHandler);
		ui.button4.addActionListener(iHandler);
		ui.button4.setText("exitInventory");
		ui.button4.setActionCommand("exitInventory");
		
		
		
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String yourChoice = e.getActionCommand();
		
		switch(yourChoice) {
		case "exitInventory":
			
			break;
		
		}
		
	}

}
