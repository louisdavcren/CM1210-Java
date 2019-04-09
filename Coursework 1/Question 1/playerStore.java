import java.util.Vector;

public class playerStore {

	private Vector<playerEntry> entries;

	public playerStore( ) {
		entries = new Vector<playerEntry>();
	}

	public playerEntry get( int index ){
		return entries.get(index);
	}

	public void add( String playerName, String playerID, String careerTriesScored, String teamName, String teamID, String homeStadiumStreet, String homeStadiumTown, String homeStadiumPostcode ) {
		entries.add(new playerEntry(playerName, playerID, careerTriesScored, teamName, teamID, homeStadiumStreet, homeStadiumTown, homeStadiumPostcode));
	}

	public String toString( ) {
		StringBuffer temp = new StringBuffer();
		for (int i = 0; i < entries.size(); ++i) {
			temp.append( entries.get(i).toString() + "\t" );
			temp.append("\n");
		}
		return temp.toString();
	}
}