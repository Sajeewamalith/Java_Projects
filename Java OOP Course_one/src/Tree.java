import java.awt.*;

public class Tree {
    private   double heightFt;

    private double trunkDiameterInches;
   private TreeType treeType;
    static Color TRUNK_COLOR = new Color(102,51,0);

    Tree(double heightFt,double trunkDiameterInches,TreeType treeType){
           this.heightFt = heightFt;
           this.trunkDiameterInches = trunkDiameterInches;
           this.treeType = treeType;
    }
    // set methods
 //   public void setTrunkDiameterInches(double trunkDiameterInches){
  //      this.trunkDiameterInches = trunkDiameterInches;
  //  }
    void grow(){
       // this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 100;
        System.out.println(trunkDiameterInches);
    }


    static void announceTree(){
        System.out.println("Look out for that "+ Tree.TRUNK_COLOR+" tree!");
    }

    void announceTallTree() {
        if (this.heightFt > 100) {
            System.out.println("That's a tall " + this.treeType + " tree!");
        }
    }
   // access private attributes through get methods
    public double getHeightFt(){
        return heightFt;
   }
   public double getTrunkDiameterInches(){
        return trunkDiameterInches;
   }
   public TreeType getTreeType(){
        return treeType;
   }
}
