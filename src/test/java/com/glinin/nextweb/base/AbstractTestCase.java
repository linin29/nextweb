/**
 * <b>项目名：</b>区域教育信息化综合解决方案<br/>
 * <b>包   名：</b>com.glinin.nextweb.base<br/>
 * <b>文件名：</b>AbstractTestCase.java<br/>
 * <b>版本信息：</b>4.0<br/>
 * <b>日期：</b>2016年8月12日-下午1:27:16<br/>
 * 
 */
package com.glinin.nextweb.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <b>类   名：</b>AbstractTestCase<br/>
 * <b>类描述：</b>描述这个类的功能<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年8月12日 下午1:27:16<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年8月12日 下午1:27:16<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 4.0<br/>
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/applicationContext.xml")
public abstract class AbstractTestCase {

}
