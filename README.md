## 
需要注意事项
####
Springboot 的版本与 SpingCloud版本的对应关系 
#####
本文的SpringBoot 版本如下pow
       `<groupId>org.springframework.boot</groupId>`
		`<artifactId>spring-boot-starter-parent</artifactId>`
		`<version>2.2.0.RELEASE</version>`
SpringCLoud 版本如下：
Hoxton.SR1
###
一定要引入 spring-boot-starter-actuator
### 
在application.properties设置 management.endpoints.web.exposure.include=*
