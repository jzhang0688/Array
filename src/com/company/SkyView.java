package com.company;

public class SkyView {
   private double[] [] view;

   public SkyView( int numRows, int numCols, double[] scan)
   {
       int scanindex = 0;
       double[][] view = new double[numRows][numCols];
       for(int x = 0; x < numRows; x++)
       {
           for(int y = 0; y < numCols; y++)
           {
               view[x][y] = scanindex;
               scanindex++;
           }
       }
   }

   public double getAverage(int startRow, int endRow)
   {
       for(int i = 0; i =  
   }

}
