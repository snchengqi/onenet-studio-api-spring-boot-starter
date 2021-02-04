package com.github.snchengqi.iot.api.springboot.factory;

import com.github.cm.heclouds.onenet.studio.api.IotProfile;
import com.github.snchengqi.iot.api.springboot.properties.IotClientProperties;

import java.util.Objects;

/**
 * @author ChengQi
 * @date 2021/2/2
 */
public class IotProfileFactory {

    public static IotProfile createProfile(IotClientProperties properties) {
        Objects.requireNonNull(properties);
        IotProfile profile = new IotProfile();
        profile.userId(properties.getUserId())
                .roleId(properties.getRoleId())
                .accessKey(properties.getAccessKey())
                .expireAfterHours(properties.getExpiredAfterHours())
                .signatureMethod(properties.getSignatureMethod())
                .enableSsl(properties.isEnableSsl())
                .url(properties.getUrl());
        return profile;
    }
}
