# PIM 架构

版权所有 © 2026 上海如静知华信息科技有限公司。

浏览器通过 Vue 管理端或商品数据专员端访问 Spring Boot REST API。安全层完成 JWT 与角色鉴权，业务层负责完善任务、商品、属性集、审核和结果记录，JPA/Flyway 管理 MySQL 数据。

管理端角色为 `PIM_MANAGER`、`QUALITY`、`ADMIN`；执行端角色为 `CONTENT_STEWARD`。正式部署建议将属性集连接置于独立采集服务，并隔离商品中心网络和办公网络。
