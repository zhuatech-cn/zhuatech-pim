/* Copyright 2026 上海如静知华信息科技有限公司 */
package cn.zhuatech.pim;
import cn.zhuatech.pim.service.ChannelReadinessService;import org.junit.jupiter.api.Test;import static org.junit.jupiter.api.Assertions.*;
class ChannelReadinessServiceTests {private final ChannelReadinessService service=new ChannelReadinessService();
 @Test void approvesCompleteProduct(){var r=service.evaluate(new ChannelReadinessService.Request("SKU1",10,10,3,3,2,2,true,true));assertEquals(100,r.completenessScore());assertEquals("READY",r.status());}
 @Test void blocksSparseProduct(){var r=service.evaluate(new ChannelReadinessService.Request("SKU2",10,4,0,3,2,0,false,false));assertEquals("BLOCKED",r.status());}}
