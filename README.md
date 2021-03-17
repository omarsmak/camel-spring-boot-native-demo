# camel-spring-boot-native-demo


1. Install GraalVM with native-image following the steps here: https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/#_system_requirements_2
1. Build it with `mvn -Pnative-image clean package`
1. Run it with `target/com.example.demo.demoapplication`