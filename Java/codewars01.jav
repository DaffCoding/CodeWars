  // 8 Kyu - You Can't Code Under Pressure #1
  //   "Code as fast as you can! You need to double the integer and return it."

class Java {
  public static int doubleInteger(int i) {
    // Double the integer and return it!
    return i;
  }
}

  // I wasn't familiar with how you can do math in Java, so I have to do some quick research.
  //  It led me to finding
      return i*2 
  // as a method. It looks similiar to how it's done in C++

  // The finished code is

class Java {

  public static int doubleInteger(int i) {
    return i*2;
  }
}

// == End


  // 8 Kyu - Third Angle of a Triangle 
  //   Description: You are given two interior angles (in degrees) of a triangle.
  //               Write a function to return the 3rd.
  //           Note: only positive integers will be tested


public class ThirdAngle {
    public static int otherAngle(int angle1, int angle2) {
        // TODO: Place code here
        return 0;
    }
}

  //  I won't deny, I forgot how to find out the 3rd angle to triangles if you 
  //  have the other 2 already. Triangles equals to 180
  //  looking online, I see the function setup
        return 180 - (A + B);
        
  //  and so, the finished code is 

public class ThirdAngle {
    public static int otherAngle(int angle1, int angle2) {
        return 180 - (angle1 + angle2);
    }
}

//  == End
