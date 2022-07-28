package br.com.allangf.CreationalPatterns.factory.factory;

import br.com.allangf.CreationalPatterns.factory.model.IPhone;
import br.com.allangf.CreationalPatterns.factory.model.IPhone12;

public class IPhone12Factory extends IPhoneFactory {
    @Override
    public IPhone createIphone() {
        return new IPhone12();
    }
}
