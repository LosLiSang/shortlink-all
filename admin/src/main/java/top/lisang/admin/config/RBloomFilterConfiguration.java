package top.lisang.admin.config;

import org.redisson.api.RBloomFilter;
import org.redisson.api.RedissonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RBloomFilterConfiguration {

    @Bean
    public RBloomFilter<String> userRegisterCachePenetrationBloomFilter(RedissonClient redissionClient) {
        RBloomFilter<String> bloomFilter = redissionClient.getBloomFilter("userRegisterCachePenetrationBloomFilter");
        bloomFilter.tryInit(100000000L, 0.001);
        return bloomFilter;
    }

}
