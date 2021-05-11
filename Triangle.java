public class Triangle {

    private float a;
    private float b; //these are the private variable which will be returned and used to calculate triangle
    private float c;

    /**
     * this is where we call the private methods and convert them into local variables that are defined as the
     * parameters of the constructor
     */
    public Triangle(float sa, float sb, float sc){
        this.a = sa;
        this.b = sb;
        this.c = sc;
    }

    /**
     * these are the getter and setter methods, these will fetch the private variables and assign them to a public
     * variable, they will then return the variable so that they are able to be called somewhere else in the project
     */
    public float getA(){
        return a;
    }
    public void setA(float sa){
        this.a = sa;

    }
    public float getB(){
        return b;
    }
    public void setB(float sb){
        this.b = sb;

    }
    public float getC(){
        return c;
    }
    public void setC(float sb){
        this.c = sb;

    }


}