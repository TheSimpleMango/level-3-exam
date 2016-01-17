import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		int esVotes = 0;
		int pfVotes = 0;
		for (String string : votes) {
			if (string.equalsIgnoreCase("edward snowden")) {
				esVotes++;
			}
			if (string.equalsIgnoreCase("pope francis")) {
				pfVotes++;
			}
		}
		if (pfVotes > esVotes) {
			return "pope francis";
		}
		else if (esVotes > pfVotes) {
			return "edward snowden";
		}
		return "TIE";
	}

}
