public class Battle { //zachariah friesen 100783192

    private int roundCount;

    private String p1Name;
    private float p1Attack;
    private float p1Defence;
    private float p1HP;

    private String p2Name;
    private float p2Attack;
    private float p2Defence;
    private float p2HP;


    Battle(String aN, float aA, float aD, float aHP, String bN, float bA, float bD, float bHP){ //setter for all variables
        this.p1Name = aN;
        this.p1Attack = aA;
        this.p1Defence = aD;
        this.p1HP = aHP;
        this.p2Name = bN;
        this.p2Attack = bA;
        this.p2Defence = bD;
        this.p2HP = bHP;
        this.roundCount = 1;
    }
    void simulateRound(){ //is called for each round
        float p1damage = this.p1Attack - p2Defence; //calculates damage per round for ease of use
        float p2damage = this.p2Attack - p1Defence;
        System.out.println("Round " + this.roundCount); //prints round title
        this.p2HP = this.p2HP - p1damage; //damage calculations and corisponding print statements
        System.out.println(this.p1Name + " does " + p1damage + " points of damage to " + this.p2Name);
        this.p1HP = this.p1HP - p2damage;
        System.out.println(this.p2Name + " does " + p2damage + " points of damage to " + this.p1Name);
        System.out.println(this.p1Name + ": " + this.p1HP); //print statements for current health of each pokemon
        System.out.println(this.p2Name + ": " + this.p2HP);
        System.out.println("");
        this.roundCount++; //roundcount updated each round
    }
    boolean isMonster1Dead(){ //checker for if pokemon died
        if (p1HP < 1){
            return true;
        }
        return false;
    }
    boolean isMonster2Dead(){
        if (p2HP < 1){
            return true;
        }
        return false;
    }
    String getMonster1Name(){ //various getters
        return this.p1Name;
    }
    String getMonster2Name(){
        return this.p2Name;
    }
    float getMonster1Attack(){
        return this.p1Attack;
    }
    float getMonster2Attack(){
        return this.p2Attack;
    }
    float getMonster1Defence(){
        return this.p1Defence;
    }
    float getMonster2Defence(){
        return this.p2Defence;
    }
    float getMonster1HP(){
        return this.p1HP;
    }
    float getMonster2HP(){
        return this.p2HP;
    }
}
