package ca.ciccc.wmad.assignment6.Question1;

public class Material {

    private int materialCode;
    private String materialName;

    public Material(int materialCode, String materialName){
        this.materialCode = materialCode;
        this.materialName = materialName;
    }

    public String toString() {
        return "Code: " + this.materialCode + "\n" + "Name: " +this.materialName + "\n";
    }
}
