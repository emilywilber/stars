/**
 * This program makes little pictures using stars. These methods
 * are so much fun to write.
 *
 * (Look in the StarInstructions.txt file to see what each method
 *  should draw.)
 *
 * @author  Emily Wilber
 * @version January 7, 2019
 */


class StarPatterns 
{
    public static void starGrid(int h, int w)
    {           
        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {               
                System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starBox(int h, int w)
    {
        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {   
                if (row==0 || row==h-1 || col==0 || col==w-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }   
    }

    public static void starX(int h)
    {
        int w = h;

        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                if (row==col || row+col==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starZ(int h)
    {
        for (int row=0; row<h; row++)
            {
                for (int col=0; col<h; col++)
                {
                    if (row == 0 || row == h-1 || row + col == 6) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                    //System.out.print(row + "" + col + " ");
                }
                System.out.println();
            }   
    }

    public static void starXBox(int h)
    {
        for (int row=0; row<h; row++)
            {
                for (int col=0; col<h; col++)
                {
                    if (row == 0 || row == h-1 || col == 0 || col == h - 1 || row == col ||row + col == h - 1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                    //System.out.print(row + "" + col + " ");
                }
                System.out.println();
            }   
    }
    
    public static void twoStarBoxes(int h, int w)
    {
        for (int row=0; row<h; row++)
            {
                for (int col=0; col<w; col++)
                {
                    if (row > (h/2) - 1 ^ col < w/2) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                    //System.out.print(row + "" + col + " ");
                }
                System.out.println();
            }   
    }
    
    public static void starTriangle(int h)
    {
        for (int row=0; row<h; row++)
            {
                for (int col=0; col<h; col++)
                {
                    if (row >= col) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                    //System.out.print(row + "" + col + " ");
                }
                System.out.println();
            }   
    }
    
    public static void emptyTriangle(int h)
    {
        for (int row=0; row<h; row++)
            {
                for (int col=0; col<h; col++)
                {
                    if (row == col || row == h - 1 || col == 0) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                    //System.out.print(row + "" + col + " ");
                }
                System.out.println();
            }   
    }
    
    public static void starTrignaleUR(int h, int w)
    {
        for (int row=0; row<h; row++)
            {
                for (int col=0; col<w; col++)
                {
                    if (row <= col) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                    //System.out.print(row + "" + col + " ");
                }
                System.out.println();
            }   
    }
    
    public static void isoscelesStarTriangle(int h)
    {
        int w = 1 + 2 * h;
        for (int row=0; row<h; row++)
            {
                for (int col=0; col<w; col++)
                {
                    if (col >= h - row - 1 && col - row <= h - 1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                    //System.out.print(row + "" + col + " ");
                }
                System.out.println();
            }   
    }
    
    public static void checkerBoard(int h, int w)
    {
        for (int row=0; row<h; row++)
            {
                for (int col=0; col<w; col++)
                {
                    if ((col + row) % 2 == 0) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                    //System.out.print(row + "" + col + " ");
                }
                System.out.println();
            }   
        //this also works :)    
        //biggerCheckerBoard(h, w, 1);
        
    }
    
    public static void biggerCheckerBoard(int h, int w, int size)
    {
        for (int row=0; row<h*size; row++)
            {
                for (int col=0; col<w*size; col++)
                {
                    if ((row / size) % 2 == (col / size) % 2) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                    //System.out.print(row + "" + col + " ");
                }
                System.out.println();
            }   
    }
    
    public static void upsideDownCheckeredTriangle(int h)
    {
        int w = (h * 2) - 1;
        for (int row=0; row<h; row++)
            {
                for (int col=0; col<w; col++)
                {
                    if ((col + row) % 2 == 0 && (col >= row && col + row <= w -1)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                    //System.out.print(row + "" + col + " ");
                }
                System.out.println();
            }   
    }
    
    
    /**
     * A more efficient way to determine if an int is prime.
     * 
     * @param n     number to test
     * @return      true if number is prime, false otherwise
     */
    public static boolean isPrime2(int n)
    {
        if (n == 2) {        
            return true;
        }
        
        else if (n % 2==0) {
            return false;
        }
        if (n == 1) {
            return false;
        }
        double limit = Math.sqrt(n);
        
        for (int i=3; i<=limit; i+=2)
        {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void primeStars(int n)
    {
        for (int row=0; row<n; row++)
        {
            if (isPrime2(row)) {
                for (int i = 0; i < row; i++) {
                    System.out.print("*");
                }
                System.out.println();
            } 
            else {
                n++;
            }
        }
        
    }
    
    public static void fibonacciStars(int n)
    {
        int last = 0;
        int now = 1;
        int temp = 0;
        for (int row=0; row<n; row++)
        {
             for (int i = 0; i < now; i++) {
                    System.out.print("*");
                    
                }
             System.out.println();
             temp = now;
             now += last;
             last = temp;
        }
    }
    
    public static void starFlag()
    {
        for (int row=0; row<13; row++)
            {
                for (int col=0; col<37; col++)
                {
                    if (col < 17 && row < 7) {
                        System.out.print("*");
                    }
                    else if (row % 2 == 0) {
                        System.out.print("R");
                    }
                    else {
                        System.out.print(" ");
                    }
                    //System.out.print(row + "" + col + " ");
                }
                System.out.println();
            } 
    }
    
    public static void main(String[] args) 
    {
        starBox(6, 9);
        System.out.println();
        
        starX(7);
        System.out.println();
        
        starZ(7);
        System.out.println();
            
        starXBox(9);
        System.out.println();
        
        twoStarBoxes(8, 10);
        System.out.println();
        
        starTriangle(6);
        System.out.println();
        
        emptyTriangle(6);
        System.out.println();
        
        starTrignaleUR(10, 9);
        System.out.println();
        
        isoscelesStarTriangle(5);
        System.out.println();
        
        checkerBoard(6, 8);
        System.out.println();
        
        biggerCheckerBoard(8, 10, 3);
        System.out.println();
        
        upsideDownCheckeredTriangle(6);
        System.out.println();
        
        primeStars(7);
        System.out.println();
        
        fibonacciStars(8);
        System.out.println();
        
        starFlag();
        System.out.println();
        
        //starGrid(6, 11);
        //System.out.println();
    }
     
}