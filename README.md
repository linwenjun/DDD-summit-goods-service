# Spring Cloud Contract

## 运行步骤

### 创建gradle.properties文件，定义如下变量
```properties
mavenUrl=url
mavenUsername=root
mavenPassword=pass
```

### 命令
```bash
# 测试
./gradlew clean test

# pubulish到maven repo
./gradlew clean publishStubsPublicationToMavenRepository
```

## 流程
1. 定义契约测试.groovy或者yml
2. 完成功能代码，并且执行测试，确保测试通过
3. 将契约publish到maven仓库中