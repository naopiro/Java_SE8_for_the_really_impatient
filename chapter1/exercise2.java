import java.io.File;
import java.util.Arrays;

public class exercise2 implements Exercise{
	public void test(){
//		System.out.println(Arrays.asList(getChildDirsWithLambda(".")));
		Arrays.asList(getChildDirsWithLambda(".")).forEach(str -> System.out.println(str));
        System.out.println("---------------------------------------------");
        Arrays.asList(getChildDirsWithMethodReference(".")).forEach(System.out::println);
	}
	
	
	
	private static File[] getChildDirsWithLambda(String dir) {
        File dirFile = new File(dir);
        return dirFile.listFiles(d -> d.isDirectory());
    }

    private static File[] getChildDirsWithMethodReference(String dir) {
        File dirFile = new File(dir);
        return dirFile.listFiles(File::isDirectory);
    }
}
