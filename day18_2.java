/**
 * Kiran is playing a Jumping game. He is playing the game on a flat surface XY.
Initially, Kiran's position is at the center (x,y) = (0,0).
He can jump one unit of length and the direction of the jump
is either upside U,downside D, rightside R, or leftside L.

You are given jumping sequence of Kiran as a string, contains only UDLR characters.
Now your task is to find out, at the end of all the jumps in the sequence, 
the position of Kiran is his initial position or not.
If yes, print true.
Otherwise, print false

Input Format:
-------------
A String jumps, jumping sequence.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
UDRL

Sample Output-1:
----------------
true

Explanation:
------------
Kiran's initial position is (0,0) and jumps are UDRL:
U -> jump from (0,0) to (0,1) 
D -> jump from (0,1) to (0,0) 
R -> jump from (0,0) to (1,0) 
L -> jump from (1,0) to (0,0) 
His final position is (0,0). So, return true.


Sample Input-2:
---------------
UURRLD

Sample Output-2:
----------------
false

Explanation:
------------
Kiran's initial position is (0,0) and jumps are UURRLD:
U -> jump from (0,0) to (0,1) 
U -> jump from (0,1) to (0,2) 
R -> jump from (0,2) to (1,2) 
R -> jump from (1,2) to (2,2) 
L -> jump from (2,2) to (1,2) 
D> jump from (1,2) to (1,1) 
His final position is (1,1). So, return false..

 */
import java.util.*;
class day18_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x=0,y=0;
        for (int i=0;i<s.length();i++)
        {
            switch(s.charAt(i))
            {
                case 'U':
                x++;
                break;
                case 'D':
                x--;
                break;
                case 'L':
                y--;
                break;
                case 'R':
                y++;
                break;
            }
        }
        if (x==0 && y==0)
        System.out.println("true");
        else
        System.out.println("false");
        
    }
}