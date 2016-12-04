package islandperimeter_463;

//You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.


public class Solution {
    public int getNeighbourCount(int[][] grid,int i,int j)
    {
        int count = 0;
        if(i+1<grid.length && grid[i+1][j]==1)
        {
            count++;
        }
        if(j+1<grid[0].length && grid[i][j+1]==1)
        {
            count++;
        }
        return count;
    }
    public int islandPerimeter(int[][] grid) 
    {
       
        int islands = 0;
        int p=0;
        int neighbours = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                {
                    islands++;
                    neighbours += getNeighbourCount(grid,i,j);
                }
            }
        }
        p = 4*islands - 2*neighbours;
        return p;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



