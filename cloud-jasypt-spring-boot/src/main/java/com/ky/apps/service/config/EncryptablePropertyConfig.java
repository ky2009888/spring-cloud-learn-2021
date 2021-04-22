package com.ky.apps.service.config;

import com.ky.apps.service.utils.JasyptUtil;
import com.ulisesbocchio.jasyptspringboot.EncryptablePropertyResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

/**
 * @Author ky2009666
 * @Description 密码加密配置类
 * @Date 2021/4/21
 **/
@Configuration
@Slf4j
public class EncryptablePropertyConfig {

    @Bean(name="encryptablePropertyResolver")
    public EncryptablePropertyResolver encryptablePropertyResolver() {
        return new EncryptionPropertyResolver();
    }

    class EncryptionPropertyResolver implements EncryptablePropertyResolver {

        @Override
        public String resolvePropertyValue(String value) {
            if (StringUtils.isEmpty(value)) {
                return value;
            }
            //值以DES@开头的均为DES加密，需要解密throws Exception
            if (value.startsWith("DES@")) {
                try {
                    return resolveDESValue(value.substring(4));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            //不需要解密的值直接返回
            return value;
        }

        private String resolveDESValue(String value) throws Exception {
            //自定义DES密文解密
            log.info("AES@ sub value :" + value);
            String riemann = JasyptUtil.decryption(value, "riemann");
            log.info("riemann DES: " + riemann);
            return riemann;
        }
    }
}
