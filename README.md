# CRM ZZY

一个基于 Spring Boot 的客户关系管理（CRM）学习与原型项目。项目展示了传统 Java Web 应用中认证授权、数据访问、服务分层和服务端页面渲染的基础整合方式。

> 当前状态：学习/原型项目，尚未发布稳定版本，也没有声明开源许可证；请勿将其直接用于生产环境。

## 技术栈

- Java 8
- Spring Boot 2.2.5
- Spring MVC 与 Thymeleaf
- Apache Shiro
- MyBatis-Plus
- MySQL 与 Druid 连接池
- Swagger 2
- Maven

## 已包含的工程能力

- Spring Boot 应用启动入口与 Mapper 扫描配置
- Controller、Service、Mapper、Entity 分层目录
- Thymeleaf 服务端模板配置
- Shiro 与 Thymeleaf 的集成依赖
- MyBatis-Plus 与 MySQL 数据源配置
- Druid 连接池与 SQL 日志配置
- Swagger 依赖，用于 API 文档能力的后续接入

## 本地运行

### 前置条件

- JDK 8
- Maven 3.x
- 本地 MySQL 实例

### 配置步骤

1. 克隆仓库：

   ```bash
   git clone https://github.com/zzy037/crm_zzy.git
   cd crm_zzy
   ```

2. 根据实际环境修改 `src/main/resources/application.yml` 中的数据源配置。默认配置指向本地 `crm_zzy` 数据库和 `8080` 端口。

   请使用本地环境变量或个人开发配置保存数据库凭据，不要将真实密码提交到仓库。

3. 使用 Maven 启动：

   ```bash
   mvn spring-boot:run
   ```

应用启动后默认监听 `http://localhost:8080`。

## 项目结构

```text
src/
├── main/
│   ├── java/com/zzy/crm/
│   │   ├── controller/  # Web 接口层
│   │   ├── entity/      # 数据实体
│   │   ├── mapper/      # 数据访问层
│   │   ├── service/     # 业务服务层
│   │   └── ZzyCrmApplication.java
│   └── resources/
│       ├── mapper/      # MyBatis Mapper XML
│       └── application.yml
└── test/
```

## 后续改进方向

- 补充数据库建表与初始化数据说明
- 用环境变量替代开发配置中的数据库凭据
- 增加自动化测试和持续集成
- 明确 API 文档入口与接口示例
- 补充版本发布记录与开源许可证

## 贡献

欢迎通过 Issue 或 Pull Request 提出改进建议。提交前请尽量说明问题背景、复现步骤或改动目的。

## 许可证

当前仓库尚未声明许可证。若计划让他人使用、修改或分发，请先补充适合的开源许可证。
