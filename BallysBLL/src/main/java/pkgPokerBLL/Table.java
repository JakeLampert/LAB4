package pkgPokerBLL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Table implements Serializable {

	private UUID TableID;
	private int NumberOfPlayers;

	// Change this from ArrayList to HashMap.
	//private ArrayList<Player> TablePlayers = new ArrayList<Player>();
	private HashMap<Double, Player> HmPlayer = new HashMap<Double, Player>();

	public Table() {
		super();
		TableID = UUID.randomUUID();
		NumberOfPlayers = 0;
	}

	public Table AddPlayerToTable(Player p) {
		NumberOfPlayers= NumberOfPlayers+1;
		HmPlayer.put((double)NumberOfPlayers,p);
		return this;
	}

	public Table RemovePlayerFromTable(Player p) {
		NumberOfPlayers= NumberOfPlayers-1;
		HmPlayer.put((double)NumberOfPlayers,p);
		return this;
	}
	public HashMap<Double, Player> getTablePlayers() {
		return HmPlayer;
	}
}
