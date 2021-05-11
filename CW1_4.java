public class CW1_4
{
    /**
     * Main entry point to the application.
     *
     * @param args unused command line arguments.
     */
    public static void main(String[] args)
    {
        Triangle t = new Triangle(1f,1f,1f);

        TriangleSolver solver = new TriangleSolver();

        String triType = solver.solveTriangle(t);

        print("Triangle Type: " + triType);


        t = new Triangle(1f,1f,2f);

        triType = solver.solveTriangle(t);

        print("Triangle Type: " + triType);


        t = new Triangle(1f,2f,3f);

        triType = solver.solveTriangle(t);

        print("Triangle Type: " + triType);

    }

    /**
     * I've wrapped the print method, to make my examples clearer.
     *
     * @param text the text to print to standard output.
     */
    private static void print(String text)
    {
        System.out.println(text);
    }
}