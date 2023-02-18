/**
 * @description:
 * @author JayXu
 * @date 2023/2/18 16:07
 */

package com.example.dao;

import com.example.domain.Actor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface ActorDao {
    @Select("select  *   from  actor where  id = #{id}")
    public Actor getById(Integer id);
}
