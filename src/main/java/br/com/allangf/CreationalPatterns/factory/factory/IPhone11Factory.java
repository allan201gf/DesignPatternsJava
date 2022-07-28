package br.com.allangf.CreationalPatterns.factory.factory;

import br.com.allangf.CreationalPatterns.factory.model.IPhone;
import br.com.allangf.CreationalPatterns.factory.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    public IPhone createIphone() {
        return new IPhone11();
    }
}
