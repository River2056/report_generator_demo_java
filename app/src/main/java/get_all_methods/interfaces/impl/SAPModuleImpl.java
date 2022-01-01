package get_all_methods.interfaces.impl;

import get_all_methods.interfaces.SAPModule;

public class SAPModuleImpl implements SAPModule {

	@Override
	public void executeMovGl() {
        System.out.println("execute MOVGL");
	}

}
