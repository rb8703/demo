package com.rb.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "t_rb_user")
public class User {
    private String id;
    private String userName;
    private String password;

}
