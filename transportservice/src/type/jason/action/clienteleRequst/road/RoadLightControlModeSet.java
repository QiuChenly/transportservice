package type.jason.action.clienteleRequst.road;

import org.json.JSONException;
import type.jason.action.clienteleRequst.BaseServlet;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Admin on 2017/6/29.
 * 路灯控制模式设置
 */
public class RoadLightControlModeSet extends BaseServlet {
    @Override
    public String getLoactionSystemData(String requestData) throws JSONException {
       return getAllData().getRoadLightStatusSystem().setRoadLightControMode(requestData);
    }

    @Override
    public void sendPost(HttpServletResponse resp) {
        String requestData = getData();
        String respData;
        try {
            respData = getLoactionSystemData(requestData);
            sendDataPost(resp, respData);
            System.out.println("路灯控制模式设置数据为："+respData);
        } catch (JSONException e) {
            SystemGet("路灯控制模式设置", e.getMessage());
        } catch (IOException e) {
            SystemOut("路灯控制模式设置", e.getMessage());
        }
    }

    @Override
    public void sendGet(HttpServletResponse resp) {
        String requestData = getData();
        String respData;
        try {
            respData = getLoactionSystemData(requestData);
            sendDataGet(resp, respData);
            System.out.println("路灯控制模式设置数据为："+respData);
        } catch (JSONException e) {
            SystemGet("路灯控制模式设置", e.getMessage());
        } catch (IOException e) {
            SystemOut("路灯控制模式设置", e.getMessage());
        }
    }
}
