import java.util.Arrays;

public class Utils_tests{
    public static void main(String[] args){
        Utils utils = new Utils();
        testReversed(utils);
        testFormatter(utils);
    }

    private static void testReversed(Utils utils){
        try{
            System.out.println(utils.reversed(21));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(utils.reversed("21"));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(utils.reversed(21.1));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void testFormatter(Utils utils){
        try{
            System.out.println(Arrays.toString(utils.formatter(21)));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(Arrays.toString(utils.formatter("21")));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(Arrays.toString(utils.formatter(21.1)));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}