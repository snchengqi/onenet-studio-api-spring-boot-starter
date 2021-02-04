# onenet-studio-api-spring-boot-starter

在SpringBoot项目中快速使用[onenet-studio-api-sdk](https://github.com/cm-heclouds/onenet-studio-api-java-sdk)

## 快速开始

- **引入Maven依赖**

```xml
<dependency>
	<groupId>com.github.snchengqi</groupId>
	<artifactId>onenet-studio-api-spring-boot-starter</artifactId>
	<version>1.0.1</version>
</dependency>
```

- **基础配置**

在application.properties中添加配置信息

```properties
#平台用户id（必填）
onenet.studio.api.user-id=xxxxx
#角色id（非必填）
onenet.studio.api.role-id=xxxxx
#平台accessKey（必填）
onenet.studio.api.access-key=xxxxx
#数据签名方法：md5、sha1、sha256
onenet.studio.api.signature-method=sha1
#使用协议：true HTTPS，false HTTP
onenet.studio.api.enable-ssl=true
#签名过期时间（非必填）
onenet.studio.api.expired-after-hours=12
#平台API地址（非必填）
onenet.studio.api.url=http://xxxxxxx
```

- **编码示例**

依赖注入IotClient对象

```java
@Autowired
private IotClient iotClient;
```

使用客户端调用公开API

```java
CreateDeviceRequest request = new CreateDeviceRequest();
request.setProductId("<your productId>");
request.setDeviceName("<your device name>");
request.setDesc("<description about your device>");

try {
    CreateDeviceResponse response = iotClient.sendRequest(request);
    System.out.println(JSON.toJSONString(response));
} catch (IotClientException e) {
    e.printStackTrace();
} catch (IotServerException e) {
    System.err.println(e.getCode());
    e.printStackTrace();
}
```

