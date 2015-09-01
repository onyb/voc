package org.python;


public class InstanceMethod extends org.python.Object implements Callable {
    public InstanceMethod(java.lang.reflect.Method method) {
        super(method, java.lang.reflect.Method.class);
    }

    public org.python.Object invoke(org.python.Object[] args, java.util.Hashtable<java.lang.String, org.python.Object> kwargs) {
        try {
            return (org.python.Object) ((java.lang.reflect.Method) this.value).invoke(args[0], args, kwargs);
        } catch (java.lang.IllegalAccessException e) {
            throw new org.python.exceptions.RuntimeError("Illegal access to Java instance method " + this.value);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw new org.python.exceptions.RuntimeError(e.getCause().toString());
        }
    }
}