public class Main {
    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(125,5,TreeType.OAK);
        myFavoriteOakTree.announceTallTree();
        /*
         1 st change
         System.out.println(myFavoriteOakTree.treeType);
         */
        Tree myFavouriteMapleTree = new Tree(190,30,TreeType.MAPLE);
        myFavouriteMapleTree.announceTallTree();
        /*
        if (myFavoriteOakTree.heightFt>100){
            System.out.println("That's a tall " +myFavoriteOakTree.treeType+" tree!");
        }
         */

        /*
        if (myFavouriteMapleTree.heightFt>100){
            System.out.println("That's a tall " +myFavouriteMapleTree.treeType +" tree!");
        }
        */

        System.out.println(Tree.TRUNK_COLOR);
        Tree.announceTree();

        // Encapsulations
        System.out.println(myFavouriteMapleTree.getTreeType());
        System.out.println(myFavouriteMapleTree.getHeightFt());
        System.out.println(myFavouriteMapleTree.getTrunkDiameterInches());

        myFavoriteOakTree.grow();
    }
}