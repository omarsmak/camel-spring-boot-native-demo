package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.nativex.hint.AccessBits;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.ResourceHint;
import org.springframework.nativex.hint.TypeHint;

@TypeHint(typeNames = "org.apache.camel.spring.boot.util.ConditionalOnCamelContextAndAutoConfigurationBeans", access = AccessBits.ALL)
@TypeHint(typeNames = "org.apache.camel.spring.boot.util.ConditionalOnCamelContextAndAutoConfigurationBeans$OnCamelAutoConfiguration", access = AccessBits.ALL)
@TypeHint(typeNames = "org.apache.camel.spring.boot.util.ConditionalOnCamelContextAndAutoConfigurationBeans$OnCamelContext", access = AccessBits.ALL)
@TypeHint(typeNames = "org.apache.camel.converter.stream.StreamCacheBulkConverterLoader", access = AccessBits.ALL)
@TypeHint(typeNames = "org.apache.camel.converter.CamelBaseBulkConverterLoader", access = AccessBits.ALL)
@TypeHint(typeNames = "org.apache.camel.converter.jaxp.CamelXmlJaxpBulkConverterLoader", access = AccessBits.ALL)
@TypeHint(typeNames = "org.apache.camel.spring.converter.ResourceConverterLoader", access = AccessBits.ALL)
@TypeHint(typeNames = "org.apache.camel.spi.RestConfiguration", access = AccessBits.ALL)
@TypeHint(typeNames = "org.apache.camel.language.simple.SimpleLanguage", access = AccessBits.ALL)
@TypeHint(typeNames = "org.apache.camel.component.timer.TimerComponent", access = AccessBits.ALL)
@TypeHint(typeNames = "org.apache.camel.component.timer.TimerEndpoint", access = AccessBits.ALL)
@TypeHint(typeNames = "org.apache.camel.processor.DefaultProcessorFactory", access = AccessBits.ALL)
@TypeHint(typeNames = "org.apache.camel.processor.DefaultInternalProcessorFactory", access = AccessBits.ALL)
@ResourceHint(patterns = "org/apache/camel/main/components.properties")
@ResourceHint(patterns = "org/apache/camel/main/dataformats.properties")
@ResourceHint(patterns = "org/apache/camel/main/languages.properties")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
