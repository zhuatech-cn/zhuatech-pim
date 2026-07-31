/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.pim.repository; import cn.zhuatech.pim.model.EnrichmentTask; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface EnrichmentTaskRepository extends JpaRepository<EnrichmentTask,Long>{List<EnrichmentTask> findTop10ByOrderByIdDesc();long countByResult(EnrichmentTask.Result result);}
