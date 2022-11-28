import java.util.Scanner;
class BackTrack
{ 
public static boolean SafetyCheck(int[][] grid,  
                             int Lin, int col,  
                             int numero)  
{ 
    //vérification de ligne - renvoie faux si le numéro existant est présent
    for (int i = 0; i < grid.length; i++)  
    {  
        if (grid[Lin][i] == numero)  
        { 
            return false; 
        } 
    } 
      
    //  vérification de colonne ,renvoie faux si le numéro existant est présent
    for (int i = 0; i < grid.length; i++) 
    {   
        if (grid[i][col] == numero) 
        { 
            return false; 
        } 
    } 
  
    //vérification de la grille 3x3
    int root = (int) Math.sqrt(grid.length); 
    int GridLin = Lin - Lin % root; 
    int GridCol = col - col % root; 
  
    for (int i = GridLin;i < GridLin + root; i++)  
    { 
        for (int j = GridCol;j < GridCol + root; j++)  
        { 
            if (grid[i][j] == numero)  
            { 
                return false; 
            } 
        } 
    } 
  
    
    return true; 
} 
  
public static boolean SudokuSolver(int[][] grid, int n)  
{ 
    int Lin = -1; 
    int col = -1; 
    boolean empty = true; 
    for (int i = 0; i < n; i++) 
    { 
        for (int j = 0; j < n; j++)  
        { 
            if (grid[i][j] == 0)  
            { 
                Lin = i; 
                col = j; 
                empty = false;     
                break; 
            } 
        } 
        if (empty) 
        { 
            break; 
        } 
    } 
   
    if (empty)  
    { 
        return true; 
    } 
  
    // appel récursif pour la vérifier // autre position si la position actuelle est invalide // par retour en arrière
    for (int y = 1; y <= n; y++) 
    { 
        if (SafetyCheck(grid, Lin, col, y)) 
        { 
            grid[Lin][col] = y; 
            if (SudokuSolver(grid, n))  
            { 
              return true; 
            }  
            else
            { 
                grid[Lin][col] = 0;  
            } 
        } 
    } 
    return false; //s'il n'y a pas de solution pour la position, mettant ainsi fin à l'appel
} 
  
public static void print(int[][] grid, int S)     
{  System.out.println("\n\n\nThe Solution:\n");
    for (int i = 0; i < S; i++) 
    { 
        for (int j = 0; j < S; j++) 
        { 
            System.out.print(grid[i][j]); 
            System.out.print(" "); 
        } 
        System.out.print("\n"); 
        
        if ((i + 1) % (int) Math.sqrt(S) == 0)  
        { 
            System.out.print(""); 
        } 
    } 
} 
  
// code conducteur 
public static void main(String args[]) 
{   

    int[][] grid = new int[9][9];
    Scanner s=new Scanner(System.in); 
    for(int i=0;i<9;i++)
  for(int j=0;j<9;j++)
    grid[i][j]=s.nextInt();  
     
    int length = grid.length; 
  
    if (SudokuSolver(grid, length)) 
    { 
        print(grid, length); // soulution
    }  
    else
    { 
        System.out.println("n'est pas des soulitions"); 
    } 
} 
}