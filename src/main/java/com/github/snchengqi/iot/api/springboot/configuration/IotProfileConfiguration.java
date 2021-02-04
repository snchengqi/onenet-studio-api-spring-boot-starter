package com.github.snchengqi.iot.api.springboot.configuration;

import com.github.cm.heclouds.onenet.studio.api.IotProfile;
import com.github.snchengqi.iot.api.springboot.factory.IotProfileFactory;
import com.github.snchengqi.iot.api.springboot.properties.IotClientProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ChengQi
 * @date 2021/2/2
 */
@SuppressWarnings({"SpringJavaInjectionPointsAutowiringInspection", "SpringFacetCodeInspection"})
@Configuration(proxyBeanMethods = false)
@ConditionalOnClass(IotProfile.class)
public class IotProfileConfiguration {

    private final IotClientProperties iotClientProperties;

    public IotProfileConfiguration(IotClientProperties iotClientProperties) {
        this.iotClientProperties = iotClientProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    public IotProfile iotProfile() {
        return IotProfileFactory.createProfile(iotClientProperties);
    }
}
