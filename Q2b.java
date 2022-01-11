class Q2b {
    public static void main(String arg[]) 
    { 
      String module = "CSC1009"; 
      switch(module) 
      { 
        case "CSC1009": 
          System.out.println("Object-Oriented Programming");
          break; 
        case "CSC1006": 
          System.out.println("Mathematics 2");
          break; 
        case "CSC1010": 
          System.out.println("Computer Networks");
          break; 
        case "CSC1007": 
          System.out.println("Operating Systems");
          break; 
        case "CSC2902": 
          System.out.println("Career and Professional Development");
          break; 
        case "1008": 
          System.out.println("Data Structures and Algorithms");
          break;               
        default: 
          System.out.println("Unknown module");
          break; 
      } 
      System.out.println("After switch"); 
    }
  }