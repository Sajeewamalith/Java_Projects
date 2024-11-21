public enum Orange {

    SHANAKA("Programmer"),
    AMAL("photographer"),
    KAMAL("trader"),
    NIMAL("driver");


    private final String DESC;
    Orange(String description){
        DESC = description;
    }

    public String getDESC(){
        return DESC;
    }
}
