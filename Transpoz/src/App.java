public class App 
{   public static void main(String[] args) throws Exception
    {   int[][] matris = {{2, 5}, {3, 6}, {4, 4}};
        System.out.println("Matris : ");
        for (int i = 0; i < matris.length; i++)
        {   for (int j = 0; j < matris[0].length; j++)
            { System.out.print(matris[i][j] + "  "); }
            System.out.println("");
        }
        System.out.println("Transpoze :");
        for (int i = 0; i < matris[0].length; i++)
        {   for (int j = 0; j < matris.length; j++) 
            { System.out.print(matris[j][i] + "  ");}
            System.out.println("");
        }
    }
}