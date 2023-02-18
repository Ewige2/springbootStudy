/**
 * @description:
 * @author
 * @date 2023/2/18 15:31
 */

package com.itheima;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// 1.定义数据模型封装yaml中对应的数据
// 2.定义为spring管控的bean
@Component
// 3.指定加载的数据
@ConfigurationProperties("datasource")
public class MyDataSource {
    private  String  passsword;
    private  String  user;
    private  String  driver;


    @Override
    public String toString() {
        return "MyDataSource{" +
                "passsword='" + passsword + '\'' +
                ", user='" + user + '\'' +
                ", driver='" + driver + '\'' +
                '}';
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}


