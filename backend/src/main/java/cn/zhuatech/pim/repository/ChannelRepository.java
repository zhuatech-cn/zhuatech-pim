/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.pim.repository; import cn.zhuatech.pim.model.Channel; import org.springframework.data.jpa.repository.JpaRepository; import java.util.Optional;
public interface ChannelRepository extends JpaRepository<Channel,Long>{Optional<Channel> findByCode(String code);}
