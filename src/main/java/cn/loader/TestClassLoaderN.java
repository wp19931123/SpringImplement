package cn.loader;

public class TestClassLoaderN extends ClassLoader {

    private String name;

    @Override
    public String toString() {
        return this.name;
    }

    public TestClassLoaderN(ClassLoader parent, String name) {
        super(parent);
        this.name = name;
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        Class<?> clazz = null;
        ClassLoader system = getSystemClassLoader();
        clazz = system.loadClass(name);
        if(clazz != null) {
            return clazz;
        }
        clazz = findClass(name);
        return clazz;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return new TestClassLoader(getParent(),name).findClass(name);
    }

    public static void main(String[] args) {
        TestClassLoaderN loader = new TestClassLoaderN(
                TestClassLoaderN.class.getClassLoader(), "TestLoaderN");
        Class clazz;
        try {
            clazz = loader.loadClass("cn.loader.Test");
            Object object = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
