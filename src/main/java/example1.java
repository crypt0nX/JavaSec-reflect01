public class example1 {
    public static void main(String[] args) throws Exception {
        execute_wrong("java.lang.Runtime","exec");
    }

    public static void execute_wrong(String className, String methodName) throws Exception {
        Class<?> clazz = Class.forName(className);
        clazz.getMethod(methodName, String.class).invoke(clazz.newInstance(), "/System/Applications/Calculator.app/Contents/MacOS/Calculator");
    }


}
