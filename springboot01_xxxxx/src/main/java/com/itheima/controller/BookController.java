/**
 * @description:
 * @author
 * @date 2023/2/18 9:40
 */

package com.itheima.controller;


// rest模式

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
public class BookController {

    @GetMapping
    public  String   getById(){
        System.out.println("spring  first .....");
        return  "spring first....";
    }
}
