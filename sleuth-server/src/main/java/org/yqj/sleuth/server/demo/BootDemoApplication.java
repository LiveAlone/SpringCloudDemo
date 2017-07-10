package org.yqj.sleuth.server.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import zipkin.server.EnableZipkinServer;

/**
 * Created by yaoqijun.
 * Date:2016-04-27
 * Email:yaoqj@terminus.io
 * Descirbe:
 */
@SpringBootApplication
@EnableZipkinServer
public class BootDemoApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .banner(new DemoBanner())
                .sources(BootDemoApplication.class)
                .run(args);
    }
}
