package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        float seconds = (int) (0.5 + minutes * 60);
	System.out.println(seconds);
    }
}
