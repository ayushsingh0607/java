import java.io.Serializable;
class Markscard implements Serializable{
    private String name;
    private int roll;
    private int mmarks;
    private int scimarks;

    public Markscard(){
        //Default Constructor
    }

    public Markscard(String name,int roll,int mmarks,int scimarks){
        this.name = name;
        this.roll = roll;
        this.mmarks = mmarks;
        this.scimarks = scimarks;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public int getRoll(){
        return roll;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }
    public int getMathmarks(){
        return mmarks;
    }
    public void setMathmarks(){
        this.mmarks = mmarks;
    }
    public int getScienceMarks(){
        return scimarks;
    }
    public void setScienceMarks(){
        this.scimarks = scimarks;
    }
    public int getTotalMarks(){
        return mmarks+scimarks;
    }
    public double getPercentage(){
        return getTotalMarks()/2.0;
    }
    public String getGrade(){
        if( getPercentage() >= 60){
            return "PASS";
        }else {
            return "FAIL";
        }
    }

    public static void main(String[] args){
        Markscard ms = new Markscard("Ayush", 1, 98, 94);
        System.out.println("The name is :" +ms.getName());
        System.out.println("The Roll is :" +ms.getRoll());
        System.out.println("The name is :" +ms.getMathmarks());
        System.out.println("The name is :" +ms.getScienceMarks());
        System.out.println("The name is :" +ms.getTotalMarks());
        System.out.println("The name is :" +ms.getPercentage());
        System.out.println("The name is :" +ms.getGrade());
    }


}
