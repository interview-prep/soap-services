package com.interview.practice;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import javax.xml.ws.Endpoint;
import java.io.IOException;

/**
 * Created by SMALA on 10/10/2015.
 */
public class AdditionServiceConsume {

    public static void main(String s[]) {
        AdditionService additionService = new AdditionServiceImpl();
        /*Endpoint ep = Endpoint.create("http://localhost:1234/additionService", additionService);
        ep.stop();*/
        Endpoint.publish("http://localhost:1234/additionService", additionService);

        HttpPost httppost = new HttpPost("http://localhost:1234/additionService");
        String actionURI = "http://practice.interview.com/AdditionServiceImpl/addRequest";
        httppost.setHeader("SOAPAction", actionURI);
        httppost.setHeader("number1","1");
        httppost.setHeader("number2","2");
        httppost.addHeader("Content-Type", "text/xml; charset=utf-8");
        HttpClient httpclient = new DefaultHttpClient();
        HttpResponse response = null;
        try {
            System.out.println("5");
            System.out.println(httppost);
            //response = httpclient.execute(httppost);
            // TODO : HTTP/1.1 500 Internal Server Error : fixing this issue
            System.out.println(response.getStatusLine());
            System.out.println("6");
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*
        HttpEntity entity = response.getEntity();

        String strresponse = null;
        if (entity != null) {
            try {
                strresponse = EntityUtils.toString(entity);
                System.out.println(strresponse);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}
