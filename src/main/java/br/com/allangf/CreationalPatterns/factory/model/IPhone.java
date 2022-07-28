package br.com.allangf.CreationalPatterns.factory.model;

public abstract class IPhone {

    public abstract void getName();

    public void common() {
        System.out.println("Commom method entry Iphone");
    }

}
