# spring-security-sample
拯救健忘症

## 配置与使用
1. 添加依赖
```xml
        <!-- SpringBoot版本2.1.0.RELEASE -> SpringSecurity版本5.1.1.RELEASE -->
        <!-- 默认使用formLogin认证方式，较老的版本默认使用httpBasic -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
```
2. WebSecurityConfig
```java
//继承WebSecurityConfigurerAdapter
WebSecurityConfig extends WebSecurityConfigurerAdapter

//重写configure方法
protected void configure(AuthenticationManagerBuilder auth)

protected void configure(HttpSecurity http)

public void configure(WebSecurity web)
```

### 内部处理流程
