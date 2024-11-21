public enum Apple {

    SHANAKA("Programmer",16),
    AMAL("photographer",26),
    KAMAL("trader",36),
    NIMAL("driver",46);


    private final String DESC;
    private final int AGE;
    Apple(String description,int year){
        DESC = description;
        AGE = year;
    }

    public String getDESC(){
        return DESC;
    }

    public int getAge(){
        return AGE;
    }
}
