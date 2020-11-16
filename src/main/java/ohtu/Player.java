package ohtu;

public class Player implements Comparable<Player>{
    private String name;
    private String nationality;
    private String team;
    private String goals;
    private String assists;
    private int points;

    public String getNationality() {
        return nationality;
    }
    
    public int getPoints() {
        int g = Integer.parseInt(goals);
        int a = Integer.parseInt(assists);
        return g+a;
    }


    @Override
    public String toString() {
        return name + "  " + team + "  " + goals + " + " + assists + " = " + this.getPoints();
    }
      
    @Override
    public int compareTo(Player otherPlayer) {
        return -this.getPoints()+otherPlayer.getPoints();
    }

    
}
