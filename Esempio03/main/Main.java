package main;
import secondario.CallMe2;

// Esempio_02# javac -d . principale/*.java
// java -cp . principale.Main 

public class Main {

  public static void main(String[] args) {
      System.out.println("main: richiamo CallMe2");
      CallMe2.stampa();
  }
}
