package br.com.allangf.CreationalPatterns.factory.factory;

import br.com.allangf.CreationalPatterns.factory.model.IPhone;
import br.com.allangf.CreationalPatterns.factory.model.IPhone13;

public class IPhone13Factory extends IPhoneFactory {
    @Override
    public IPhone createIphone() {
        return new IPhone13();
    }
}
