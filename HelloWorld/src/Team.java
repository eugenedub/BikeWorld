
class Team {
	private String name;
	private int numberOfCyclists = 10;
	private String teamLeader;
	/* Constructors */
	Team(){
	}

	Team(String name){
		this.name = name;
	}

 	Team(String name, int numberOfCyclists, String teamLeader){
		this.name = name;
		this.teamLeader = teamLeader;
		this.numberOfCyclists = numberOfCyclists;
	}
	// getters and setters
	String getName() {
	       return name;
	}
	
	String getTeamLeader() {
	       return teamLeader;
	}
	
	int getNumberOfCyclists() {
	       return numberOfCyclists;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumberOfCyclists(int numberOfCyclists) {
		this.numberOfCyclists = numberOfCyclists;
	}

	public void setTeamLeader(String teamLeader) {
		this.teamLeader = teamLeader;
	}
}
