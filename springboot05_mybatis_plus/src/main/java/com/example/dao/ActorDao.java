/**
 * @description:
 * @author JayXu
 * @date 2023/2/18 16:07
 */

package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.Actor;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ActorDao extends BaseMapper<Actor> {  // 继承 Mp 自带的一些基本方法
}
