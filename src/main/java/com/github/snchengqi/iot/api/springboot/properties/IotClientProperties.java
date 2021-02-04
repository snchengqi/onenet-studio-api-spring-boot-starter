package com.github.snchengqi.iot.api.springboot.properties;

import com.github.cm.heclouds.onenet.studio.api.auth.SignatureMethod;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ChengQi
 * @date 2021/2/2
 */
@ConfigurationProperties(prefix = "onenet.studio.api")
public class IotClientProperties {

    private String userId;
    private String roleId;
    private String accessKey;
    private Integer expiredAfterHours;
    private SignatureMethod signatureMethod;
    private boolean enableSsl = false;
    private String url;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public Integer getExpiredAfterHours() {
        return expiredAfterHours;
    }

    public void setExpiredAfterHours(Integer expiredAfterHours) {
        this.expiredAfterHours = expiredAfterHours;
    }

    public SignatureMethod getSignatureMethod() {
        return signatureMethod;
    }

    public void setSignatureMethod(SignatureMethod signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public boolean isEnableSsl() {
        return enableSsl;
    }

    public void setEnableSsl(boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
