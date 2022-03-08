package io.overledger.springboottemplateservice.rabbitmq;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;

@Configuration
@EnableBinding(TemplateOutputChannel.class)
@IntegrationComponentScan
public class TemplateConfig {



}
