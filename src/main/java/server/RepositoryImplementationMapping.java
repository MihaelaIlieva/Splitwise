package server;

import java.util.HashMap;
import java.util.Map;

public class RepositoryImplementationMapping {

    private static Map<Class<?>, Object> mapOfClasses =new HashMap<>();

    public static void  addOrReplace(Object o)
    {
        if(mapOfClasses.containsKey(o.getClass())) {
            // bug fix here
            mapOfClasses.replace(o.getClass(),o);
        }
        else {
            mapOfClasses.put(o.getClass(),o);
        }

    }
    public static void  addOrReplace(Class<?> c,Object o)
    {
        if(mapOfClasses.containsKey(c)) {
            mapOfClasses.replace(c,o);
        }
        else {
            mapOfClasses.put(c,o);
        }

    }
    public static Object get(Class<?> c)
    {
        if(mapOfClasses.containsKey(c))
            return mapOfClasses.get(c);
        else
            return null;
    }


}

