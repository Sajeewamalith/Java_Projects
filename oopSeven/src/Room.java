public class Room {
    int roomNo;
    String roomType;
    String roomArea;

    public void setData(int no,String type,String area){
        this.roomNo = no;
        this.roomType = type;
        this.roomArea = area;
    }

    public void displayData(){
        System.out.println(roomNo+" "+roomType+" "+roomArea);
    }
}
