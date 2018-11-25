# Spring Cloud Contract

## 运行步骤

### 定义如下环境变量
```bash
...
export MAVEN_REPO=...
export MAVEN_USER=...
export MAVEN_PASS=...
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