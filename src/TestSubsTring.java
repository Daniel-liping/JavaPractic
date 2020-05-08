
public class TestSubsTring {
    public static void main(String[] args) {
        String[] strs = new String[] {"HR-RZ-SUZ-v-lih99", "SDHR-SZ-zuocui"};
        for (String str: strs) {
//            int index = str.lastIndexOf("-");
//            String tmpStr = str.substring(0, index);
//            System.out.println("****index:" + index + "****tmpStr:" +tmpStr);
//            int index2 = tmpStr.lastIndexOf("-");
//            String tmpStr2 = tmpStr.substring(0, index2);
//            System.out.println("****index2:" + index2 + "****tmpStr:" +tmpStr2);
            String[] tmpStrs = str.split("v-lih99");
            int index = tmpStrs[0].lastIndexOf("-");
            String tmpStr = str.substring(0, index);
            System.out.println("****index:" + index + "****tmpStr:" +tmpStr);
            int index2 = tmpStr.lastIndexOf("-");
            String tmpStr2 = tmpStr.substring(0, index2);
            System.out.println("****index2:" + index2 + "****tmpStr:" +tmpStr2);


        }
    }
}
