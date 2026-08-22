/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.pim.repository; import cn.zhuatech.pim.model.ProductRecord; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface ProductRecordRepository extends JpaRepository<ProductRecord,Long>{List<ProductRecord> findAllByOrderByDueDateAsc();List<ProductRecord> findByChannelCodeOrderByDueDateAsc(String code);long countByStatus(ProductRecord.Status status);}
