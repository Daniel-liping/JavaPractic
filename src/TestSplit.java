public class TestSplit {
    public static void main(String[] args) {
        String  extendErpString = "EHR/OA/K2";
        String[] extendErpAry = extendErpString.split("/");
        for (String temp:extendErpAry) {
            System.out.println(temp);
        }
        System.out.println("******************************************");
        testSplit();
        System.out.println("******************************************");
        String type = "888||35||08||99||32";
        System.out.println(getSettleType(type));
    }


    public static void testSplit(){

        String roleNumber = "HR-RZ-SUZ-zuocui";
        String userNumber = "zuocui";
        if((roleNumber!=null && !"".equals(roleNumber)) && (userNumber!=null && !"".equals(userNumber))){
            String[] tmpStrs = roleNumber.split(userNumber);
            int index = tmpStrs[0].lastIndexOf("-");
            if(index > 0){
                String tmpStr = roleNumber.substring(0, index);
                System.out.println("****index:" + index + "****tmpStr:" +tmpStr);
                if(tmpStr.contains("SZ")){
                    int index2 = tmpStr.lastIndexOf("-");
                    if(index2 > 0){
                        String tmpStr2 = tmpStr.substring(0, index2);
                        System.out.println("****index2:" + index2 + "****tmpStr:" +tmpStr2);
                    }
                }
            }
        }
    }

    private static String getSettleType(String type)
    {
        String[] settleTypeNums = type.split("\\|\\|");
        // sett.fnumber='31' OR sett.fnumber='33'
        String str = "";
        int count = 0;
        for (int i = 0; i < settleTypeNums.length; i++)
        {

            if (count != 0)
            {
                str = str + " OR ";
            }
            str = str + " sett.fnumber='" + settleTypeNums[i] + "' ";
            count++;
        }
        return str;
    }

}
