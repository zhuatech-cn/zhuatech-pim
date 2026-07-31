/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.pim.model;
import jakarta.persistence.*; import java.time.LocalDateTime;
@Entity @Table(name="pim_enrichment_task") public class EnrichmentTask extends BaseEntity {
    public enum Result { PENDING, PASSED, FAILED }
    @Column(nullable=false,unique=true,length=32) private String enrichmentTaskNo; @ManyToOne(optional=false,fetch=FetchType.LAZY) private ProductRecord productRecord;
    @Column(nullable=false,length=30) private String enrichmentTaskType; @Column(nullable=false) private int enrichmentTaskQty; @Column(nullable=false) private int defectQty; @Enumerated(EnumType.STRING) @Column(nullable=false,length=20) private Result result;
    @Column(length=50) private String inspector; @Column(nullable=false) private LocalDateTime createdAt;
    protected EnrichmentTask(){} public EnrichmentTask(String enrichmentTaskNo,ProductRecord productRecord,String enrichmentTaskType,int enrichmentTaskQty,int defectQty,Result result,String inspector){this.enrichmentTaskNo=enrichmentTaskNo;this.productRecord=productRecord;this.enrichmentTaskType=enrichmentTaskType;this.enrichmentTaskQty=enrichmentTaskQty;this.defectQty=defectQty;this.result=result;this.inspector=inspector;this.createdAt=LocalDateTime.now();}
    public String getEnrichmentTaskNo(){return enrichmentTaskNo;} public ProductRecord getProductRecord(){return productRecord;} public String getEnrichmentTaskType(){return enrichmentTaskType;} public int getEnrichmentTaskQty(){return enrichmentTaskQty;} public int getDefectQty(){return defectQty;} public Result getResult(){return result;} public String getInspector(){return inspector;}
}
