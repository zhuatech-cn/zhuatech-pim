/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.pim.repository; import cn.zhuatech.pim.model.AttributeSet; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface AttributeSetRepository extends JpaRepository<AttributeSet,Long>{List<AttributeSet> findAllByOrderByCodeAsc();long countByStatus(AttributeSet.Status status);}
