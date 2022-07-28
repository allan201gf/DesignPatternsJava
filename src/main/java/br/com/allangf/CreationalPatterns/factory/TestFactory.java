package br.com.allangf.CreationalPatterns.factory;

import br.com.allangf.CreationalPatterns.factory.model.IPhone;
import br.com.allangf.CreationalPatterns.factory.model.IPhone11;
import br.com.allangf.CreationalPatterns.factory.model.IPhone12;
import br.com.allangf.CreationalPatterns.factory.model.IPhone13;

public class TestFactory {

    public static void main(String[] args) {
        IPhone IPhone11 = new IPhone11();
        IPhone IPhone12 = new IPhone12();
        IPhone IPhone13 = new IPhone13();

        IPhone11.common();
        IPhone12.common();
        IPhone13.common();

        IPhone11.getName();
        IPhone12.getName();
        IPhone13.getName();
    }

}
