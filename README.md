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