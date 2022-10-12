import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Input {
  int[] values = new int[10];

 public void ctreatArray(){
   for(int i=0;i< values.length;i++){
     values[i] = (int)(Math.random()* values.length);

   }
 }
  public void array() {
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        System.out.print(values[i]);
        System.out.print(" ");
      }
    }
    System.out.println();
  }

  public void even() {
    for (int j = 0; j < 10; j++) {
      if (values[j] % 2 == 0) {
        System.out.print(values[j]);
        System.out.print(" ");
      }
    }
    System.out.println();
  }

  public void reverse() {
    for (int k = 9; k >= 0; k--) {
      System.out.print(values[k]);
      System.out.print(" ");
    }
    System.out.println();
  }

  public void firstAndLast() {
    System.out.print(values[0]);
    System.out.print(" ");
    System.out.print(values[values.length - 1]);
  }

}
