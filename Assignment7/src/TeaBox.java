public class TeaBox {
    private String teaType;
    private TeaBox nextTea;

    TeaBox(String teaType,TeaBox nextTea){
        this.teaType = teaType;
        this.nextTea = nextTea;
    }
    public String getTeaType() {
        return teaType;
    }
    public TeaBox getNextTea() {
        return nextTea;
    }
}
