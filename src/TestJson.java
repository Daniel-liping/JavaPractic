import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TestJson {
    public static void main(String[] args) {
//        String jsonString = "{\\\"url\\\":\\\"http://p.vankeservice.com/sys/attachment/sys_att_main/sysAttMain.do?method=download%26fdId=171791bcbea994a572a0c19491ab679f%26downloadType=manual%26downloadFlag=1586874834552\\\",\\\"name\\\":\\\"HR共享UAT测试用例20191120(2).xlsx\\\"},{\\\"url\\\":\\\"http://p.vankeservice.com/sys/attachment/sys_att_main/sysAttMain.do?method=download%26fdId=171791bcc761f3d007dde6949a6aa226%26downloadType=manual%26downloadFlag=1586874834552\\\",\\\"name\\\":\\\"万科物业HR共享平台操作手册(3).ppt\\\"},{\\\"url\\\":\\\"http://p.vankeservice.com/sys/attachment/sys_att_main/sysAttMain.do?method=download%26fdId=171791bd1f71378cd9f21c44cb49de54%26downloadType=manual%26downloadFlag=1586874834552\\\",\\\"name\\\":\\\"~$详细设计_VS-HRSSC-P02-05-01_员工离职流程V2.2.docx\\\"},{\\\"url\\\":\\\"http://p.vankeservice.com/sys/attachment/sys_att_main/sysAttMain.do?method=download%26fdId=171791bd27abc5c52050aef41229f911%26downloadType=manual%26downloadFlag=1586874834552\\\",\\\"name\\\":\\\"~$详细设计_VS-HRSSC-P07-01-01_社保公积金增减员流程V2.2.docx\\\"}";
//        System.out.println("jsonString***********" + jsonString);
//        JSONArray jsonArray = JSONArray.fromObject(jsonString);
//        for(int i=0; i<jsonArray.size(); i++){
//            net.sf.json.JSONObject job = jsonArray.getJSONObject(i);
//            String urlName = job.getString("name");
//            String url = job.getString("url");
//            System.out.println("name***************" + urlName);
//            System.out.println("url****************" + url);
//        }
        String jsonStr2 = "{\"url\":\"http://p.vankeservice.com/sys/attachment/sys_att_main/sysAttMain.do?method=download%26fdId=171791bcbea994a572a0c19491ab679f%26downloadType=manual%26downloadFlag=1586874834552\",\"name\":\"HR共享UAT测试用例20191120(2).xlsx\"},{\"url\":\"http://p.vankeservice.com/sys/attachment/sys_att_main/sysAttMain.do?method=download%26fdId=171791bcc761f3d007dde6949a6aa226%26downloadType=manual%26downloadFlag=1586874834552\",\"name\":\"万科物业HR共享平台操作手册(3).ppt\"},{\"url\":\"http://p.vankeservice.com/sys/attachment/sys_att_main/sysAttMain.do?method=download%26fdId=171791bd1f71378cd9f21c44cb49de54%26downloadType=manual%26downloadFlag=1586874834552\",\"name\":\"~$详细设计_VS-HRSSC-P02-05-01_员工离职流程V2.2.docx\"},{\"url\":\"http://p.vankeservice.com/sys/attachment/sys_att_main/sysAttMain.do?method=download%26fdId=171791bd27abc5c52050aef41229f911%26downloadType=manual%26downloadFlag=1586874834552\",\"name\":\"~$详细设计_VS-HRSSC-P07-01-01_社保公积金增减员流程V2.2.docx\"}";
        String jsonStr3 = "{\"url\":\"http://localhost:7070/ekp_dev/sys/attachment/sys_att_main/sysAttMain.do?method=download%26fdId=1715a1699a29d14458a2f2e4ec4ab8d1%26downloadType=manual%26downloadFlag=1586354618685\",\"name\":\"0113管理类任免、专业类晋降模板(1).xlsx\"},";
        System.out.println(" ***********************" +jsonStr3);
        String[] jsonStrs = jsonStr2.split("},");
        for(int i=0; i<jsonStrs.length; i++){
            String json = jsonStrs[i] + "},";
//            System.out.println(i + " ***********************" +json);
            JSONObject jsonObject = JSONObject.fromObject(json);
            String urlName = jsonObject.getString("name");
            String url = jsonObject.getString("url");
            System.out.println("name***************" + urlName);
            System.out.println("url****************" + url);
        }

    }
}
