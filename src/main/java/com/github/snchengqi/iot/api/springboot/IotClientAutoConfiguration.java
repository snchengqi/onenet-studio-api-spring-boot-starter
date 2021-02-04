package com.github.snchengqi.iot.api.springboot;

import com.github.cm.heclouds.onenet.studio.api.IotClient;
import com.github.cm.heclouds.onenet.studio.api.IotProfile;
import com.github.snchengqi.iot.api.springboot.configuration.IotProfileConfiguration;
import com.github.snchengqi.iot.api.springboot.properties.IotClientProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author ChengQi
 * @date 2021/2/2
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnClass(IotClient.class)
@EnableConfigurationProperties(IotClientProperties.class)
@Import(IotProfileConfiguration.class)
public class IotClientAutoConfiguration {

    @Bean(destroyMethod = "close")
    @ConditionalOnMissingBean
    public IotClient iotClient(IotProfile iotProfile) {
        return IotClient.create(iotProfile);
    }
}
