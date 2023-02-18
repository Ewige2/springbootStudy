/**
 * @description:
 * @author
 * @date 2023/2/18 9:40
 */

package com.itheima.controller;


// rest模式

import com.itheima.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
public class BookController {

    // 读取配置文件值（yml配置）
    @Value("${countery}")
    private  String countery;

    @Value("${server.port}")
    private   String serverPort;

    // 测试变量引用
    @Value("${tempdir}")
    private   String tempDir;

    // 读取yaml全部数据
    @Autowired
    private Environment env;
    @Autowired
    private MyDataSource  myDataSource;


    @GetMapping
    public  String   getById(){
        System.out.println("spring  first .....");
        System.out.println(countery);
        System.out.println(serverPort);
        System.out.println(tempDir);
        System.out.println("----------------");
        System.out.println(env.getProperty("server.port"));
        System.out.println("----------------");
        System.out.println(myDataSource);
        return  "spring first....";
    }
}
