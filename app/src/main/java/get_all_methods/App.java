/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package get_all_methods;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        String name = "executeMovGl";
        ReportGenerator reportGenerator = new ReportGenerator();

        Field[] fields = reportGenerator.getClass().getDeclaredFields();
        for(int i = 0; i < fields.length; i++) {
            Method[] methods = fields[i].getType().getDeclaredMethods();
            for(int j = 0; j < methods.length; j++) {
                if (methods[j].getName().equals(name)) {
                    String classFullName = fields[i].getType().getName();
                    String classPathName = classFullName.substring(0, classFullName.lastIndexOf("."));
                    String className = classFullName.substring(classFullName.lastIndexOf(".") + 1);
                    String implClsName = String.format("%s.impl.%sImpl", classPathName, className);
                    System.out.println(Class.forName(implClsName).getName());
                    Class rptModuleCls = Class.forName(implClsName);
                    Object rptObj = rptModuleCls.getDeclaredConstructor().newInstance();
                    System.out.println(rptObj);
                    methods[j].invoke(rptObj);
                }
            }
        }
    }
}