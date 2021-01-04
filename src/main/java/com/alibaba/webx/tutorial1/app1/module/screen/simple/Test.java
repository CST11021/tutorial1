package com.alibaba.webx.tutorial1.app1.module.screen.simple;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by whz on 2017/5/26.
 */
public class Test {

    @Autowired
    private HttpServletResponse response;

    public void execute() throws Exception {
        // 设置content type，但不需要设置charset。框架会设置正确的charset。
        response.setContentType("text/plain");

        // 如同servlet一样：取得输出流。
        PrintWriter out = response.getWriter();

        out.println("Just a test...");
    }

}
