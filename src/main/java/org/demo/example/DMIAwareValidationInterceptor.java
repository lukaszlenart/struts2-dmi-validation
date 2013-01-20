package org.demo.example;

import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.inject.Inject;
import com.opensymphony.xwork2.validator.ValidationInterceptor;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.StrutsConstants;

/**
 * Simple example how to define you're own context to support method's names in validation file name
 * If DMI is enabled and method was specified validation file name will be constructed like this:
 * - <ActionClass>-<actionAlias>_<methodName>-validation.xml
 */
public class DMIAwareValidationInterceptor extends ValidationInterceptor {

    private boolean dmiEnabled = false;

    @Inject(StrutsConstants.STRUTS_ENABLE_DYNAMIC_METHOD_INVOCATION)
    public void setEnableDynamicMethodInvocation(String value) {
        dmiEnabled = Boolean.parseBoolean(value);
    }

    @Override
    protected String getValidationContext(ActionProxy proxy) {
        if (dmiEnabled && StringUtils.isNotEmpty(proxy.getMethod())) {
            return proxy.getActionName() + "_" + proxy.getMethod();
        }
        return super.getValidationContext(proxy);
    }

}
