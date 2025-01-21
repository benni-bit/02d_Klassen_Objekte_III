package com.cc.java;

public class Cat {

    private String firstName;
    private String furColor;
    private int age;
    

    private int counter;

    

    public Cat(String firstName, String furColor, int age) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;
    }

    /** Getter */
    public String getStringAttributes(String op) {
      switch (op) {
        case "#name":
            return firstName;
        case "#color":
            return furColor;
        default:
            return "ERROR";
      }
    }

    public String getAge() {
       
            return checkCompliance();
            
       
    }

    private String checkCompliance(){

       // counter = 1;// Wird immer nur switch-case Antwort für 1 ausgegeben

       counter++;

        switch (counter) {
            case 1:
                return "This is an inappropriate question!";//'Beim 1 Aufruf'
            case 2:  
                return "I've told you once!"; //Beim 2
                
            case 3:
                return "Talk to the hand!"; //Bem dritten
            default:
                return"1#4fgd5";
        }

    }
  


}
