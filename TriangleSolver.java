/**
 * @author cameron davison
 */
public class TriangleSolver{

    /**
     *
     * @param t
     *
     * here is the solve triangle method, this is the method that calculates the length of the triangles and returns
     * a String that will tell the user the type of triangle it is depending on the values given.
     * this method works by calling the get methods inside of the Triangle class and using that value to calculate the
     * size of the triangle shown here using if statements.
     */
    public String solveTriangle(Triangle t) {


        if (t.getA() == t.getB() && t.getB() == t.getC()) {
            return "Equilateral";
        }
        else if ((t.getA() == t.getB() && t.getB() != t.getC()) || (t.getA() != t.getB() && t.getC() == t.getA())
                || (t.getC() == t.getB() && t.getC() != t.getA())) {
            return "Isosceles";
        }
        else if (t.getA() != t.getB() && t.getB() != t.getC() && t.getC() != t.getA()) {
            return "scalene";
        }
        else {
            return "invalid input";
        }
    }

    /**
     * this is a method that uses the .compare function to compare two attribute's values and return a value based on
     * attributes values
     * @param a
     * @param b
     * @return
     */

    public boolean areEqual ( float a, float b){
        a = 1f;
        b = 2f;
        int answer = Float.compare(a,b);

        if (answer == 0){
            return true;
        }else{
            return false;
        }
    }

}