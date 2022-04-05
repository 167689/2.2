class Main {
  public static void main(String[] args) {
    
    int z,x;
    for(z=1;z<6;z++)
    {
      for(x=0;x<5;x++)
      {
      if(x<(5-z)) 
      {
      System.out.print(" "); 
      }
        else 
      {
        System.out.print("*");
      }
      }
       System.out.println();
    }

    
  }
} 