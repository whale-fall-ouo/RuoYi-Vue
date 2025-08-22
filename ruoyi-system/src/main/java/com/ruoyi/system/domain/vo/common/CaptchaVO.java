package com.ruoyi.system.domain.vo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 验证码返回对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CaptchaVO {
    /**
     * 是否启用验证码
     */
    private boolean captchaEnabled;

    /**
     * 验证码唯一标识
     */
    private String uuid;

    /**
     * 验证码图片（Base64）
     */
    private String img;

    public CaptchaVO(boolean captchaEnabled) {
        this.captchaEnabled = captchaEnabled;
    }
}