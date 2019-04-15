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

// permitAll配置实例
public void configure(HttpSecurity http) throws Exception {
        http
        .authorizeRequests()
        .antMatchers("/css/**", "/js/**","/fonts/**").permitAll()
        .anyRequest().authenticated();
}
// web ignore配置实例
public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**");
        web.ignoring().antMatchers("/js/**");
        web.ignoring().antMatchers("/fonts/**");
}
// 说明：
// web ignore比较适合配置前端相关的静态资源，它是完全绕过spring security的所有filter的
// permitAll，会给没有登录的用户适配一个AnonymousAuthenticationToken，设置到SecurityContextHolder，方便后面的filter可以统一处理authentication
```

### 内部处理流程
