/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.pim.dto;
import jakarta.validation.constraints.*; import java.time.*; import java.util.List;
public final class PimDto { private PimDto(){}
    public record Metric(String label,String value,String hint,String tone){}
    public record ProductRecordView(Long id,String orderNo,String productCode,String productName,String channel,String workshop,int plannedQty,int completedQty,int defectQty,LocalDate dueDate,String status,String batchNo,int progress){}
    public record AttributeSetView(String code,String name,String channel,String status,int oee,LocalDateTime lastHeartbeat){}
    public record EnrichmentTaskView(String enrichmentTaskNo,String orderNo,String productName,String enrichmentTaskType,int enrichmentTaskQty,int defectQty,String result,String inspector){}
    public record Dashboard(List<Metric> metrics,List<ProductRecordView> productRecords,List<AttributeSetView> attributeSet,List<EnrichmentTaskView> enrichmentTasks){}
    public record ReportRequest(@NotBlank String operationName,@Positive int goodQty,@PositiveOrZero int defectQty,@Size(max=200) String remark){}
    public record ReportResult(String orderNo,int completedQty,int defectQty,int progress,String status){}
}
