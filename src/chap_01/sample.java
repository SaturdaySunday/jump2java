package chap_01;

public class sample {
    public static void main(String[] args) {
      int treeHit = 0;
      while (treeHit < 10) {
          treeHit += 1;
          System.out.println("나무를 " + treeHit + "번 찍음");
          if(treeHit == 10) {
              System.out.println("나무 벰");
          }
      }
}}