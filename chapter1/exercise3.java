import java.io.File;
import java.util.Arrays;

//Using the list(FilenameFilter) method of the java.io.File class, write a method
//that returns all files in a given directory with a given extension. Use a lambda
//expression, 


public class exercise3 implements Exercise {

	@Override
    public void test() {
        File[] files = list(".", "git");
        System.out.println("---------------------------------------------");
        Arrays.asList(files).forEach(System.out::println);
    }

    private static File[] list(String dir, String ext) {
        File dirFile = new File(dir);
        return dirFile.listFiles(f -> f.getName().endsWith(ext));
    }

}
