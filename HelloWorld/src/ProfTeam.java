/**
 * Created by ev20005 on 21-04-2017.
 */
public class ProfTeam extends Team {
    String sponsorName;
    int numberInTeam;
    String teamLeader;

    public ProfTeam(String name) {
        this.sponsorName = name;
    }

    public ProfTeam(String name, int numberCyclists, String teamLeader) {
        this.sponsorName = name;
        this.numberInTeam = numberCyclists;
        this.teamLeader = teamLeader;
    }
    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public int getNumberInTeam() {
        return numberInTeam;
    }

    public void setNumberInTeam(int numberInTeam) {
        this.numberInTeam = numberInTeam;
    }
}
