import java.time.LocalDate;

public class TestDate {
    public static void main(String[] args) {
        System.out.println("*****示例1:Java 8中获取今天的日期getToday：" + getToday());
        System.out.println("*****示例2:Java 8中获取年、月、日信息getYearMonthDay：" + getYearMonthDay());
        System.out.println("*****示例3:Java 8中处理特定日期getOtherDate：" + getOtherDate());
        System.out.println("*****示例2:Java 8中获取年、月、日信息getYearMonthDay：" + getYearMonthDay());
        System.out.println("*****示例2:Java 8中获取年、月、日信息getYearMonthDay：" + getYearMonthDay());
        System.out.println("*****示例2:Java 8中获取年、月、日信息getYearMonthDay：" + getYearMonthDay());

    }

    /*
    示例1:Java 8中获取今天的日期
    Java 8 中的 LocalDate 用于表示当天日期。和java.util.Date不同，它只有日期，不包含时间。当你仅需要表示日期时就用这个类。
    输出格式为：yyyy-MM-dd
     */
    public static LocalDate getToday(){
        LocalDate today = LocalDate.now();
        return today;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TestDate{");
        sb.append('}');
        return sb.toString();
    }

    /*
        示例2:Java 8中获取年、月、日信息
         */
    public static String getYearMonthDay(){
        LocalDate today = LocalDate.now();
        int year = today.getYear();// 获取年
        int month = today.getMonthValue();// 获取月
        int day = today.getDayOfMonth();// 获取日
        return  year+"年"+month+"月"+day+"日";
    }

    /*
    示例3:Java 8中处理特定日期
    我们通过静态工厂方法now()非常容易地创建了当天日期，你还可以调用另一个有用的工厂方法LocalDate.of()创建任意日期， 该方法需要传入年、月、日做参数，返回对应的LocalDate实例。这个方法的好处是没再犯老API的设计错误，比如年度起始于1900，月份是从0开 始等等。
     */
    public static String getOtherDate() {
        LocalDate date = LocalDate.of(2018,2,6);
        return "自定义日期:"+date;
    }
}
