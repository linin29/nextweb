/**
 * <b>项目名：</b>nextweb<br/>
 * <b>包   名：</b>com.glinin.nextweb.controller<br/>
 * <b>文件名：</b>UserController.java<br/>
 * <b>版本信息：</b>4.0<br/>
 * <b>日期：</b>2016年8月12日-下午1:57:00<br/>
 * 
 */
package com.glinin.nextweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <b>类 名：</b>UserController<br/>
 * <b>类描述：</b>用户controller<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年8月12日 下午1:57:00<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年8月12日 下午1:57:00<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 4.0<br/>
 * 
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "user/index";
    }
}
