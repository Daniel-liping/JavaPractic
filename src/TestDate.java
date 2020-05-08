import java.time.LocalDate;

public class TestDate {
    public static void main(String[] args) {
        System.out.println("*****ʾ��1:Java 8�л�ȡ���������getToday��" + getToday());
        System.out.println("*****ʾ��2:Java 8�л�ȡ�ꡢ�¡�����ϢgetYearMonthDay��" + getYearMonthDay());
        System.out.println("*****ʾ��3:Java 8�д����ض�����getOtherDate��" + getOtherDate());
        System.out.println("*****ʾ��2:Java 8�л�ȡ�ꡢ�¡�����ϢgetYearMonthDay��" + getYearMonthDay());
        System.out.println("*****ʾ��2:Java 8�л�ȡ�ꡢ�¡�����ϢgetYearMonthDay��" + getYearMonthDay());
        System.out.println("*****ʾ��2:Java 8�л�ȡ�ꡢ�¡�����ϢgetYearMonthDay��" + getYearMonthDay());

    }

    /*
    ʾ��1:Java 8�л�ȡ���������
    Java 8 �е� LocalDate ���ڱ�ʾ�������ڡ���java.util.Date��ͬ����ֻ�����ڣ�������ʱ�䡣�������Ҫ��ʾ����ʱ��������ࡣ
    �����ʽΪ��yyyy-MM-dd
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
        ʾ��2:Java 8�л�ȡ�ꡢ�¡�����Ϣ
         */
    public static String getYearMonthDay(){
        LocalDate today = LocalDate.now();
        int year = today.getYear();// ��ȡ��
        int month = today.getMonthValue();// ��ȡ��
        int day = today.getDayOfMonth();// ��ȡ��
        return  year+"��"+month+"��"+day+"��";
    }

    /*
    ʾ��3:Java 8�д����ض�����
    ����ͨ����̬��������now()�ǳ����׵ش����˵������ڣ��㻹���Ե�����һ�����õĹ�������LocalDate.of()�����������ڣ� �÷�����Ҫ�����ꡢ�¡��������������ض�Ӧ��LocalDateʵ������������ĺô���û�ٷ���API����ƴ��󣬱��������ʼ��1900���·��Ǵ�0�� ʼ�ȵȡ�
     */
    public static String getOtherDate() {
        LocalDate date = LocalDate.of(2018,2,6);
        return "�Զ�������:"+date;
    }
}
