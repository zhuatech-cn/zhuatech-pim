/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.pim.model;
import jakarta.persistence.*; import java.time.LocalDateTime;
@Entity @Table(name="pim_publication_record") public class PublicationRecord extends BaseEntity {
    @ManyToOne(optional=false,fetch=FetchType.LAZY) private ProductRecord productRecord; @Column(nullable=false,length=50) private String operationName; @Column(nullable=false) private int goodQty; @Column(nullable=false) private int defectQty;
    @Column(nullable=false,length=50) private String operatorName; @Column(nullable=false) private LocalDateTime reportedAt; @Column(length=200) private String remark;
    protected PublicationRecord(){} public PublicationRecord(ProductRecord productRecord,String operationName,int goodQty,int defectQty,String operatorName,String remark){this.productRecord=productRecord;this.operationName=operationName;this.goodQty=goodQty;this.defectQty=defectQty;this.operatorName=operatorName;this.reportedAt=LocalDateTime.now();this.remark=remark;}
    public ProductRecord getProductRecord(){return productRecord;} public String getOperationName(){return operationName;} public int getGoodQty(){return goodQty;} public int getDefectQty(){return defectQty;} public String getOperatorName(){return operatorName;} public LocalDateTime getReportedAt(){return reportedAt;}
}
