package com.ruoyi.system.domain.vo.monitor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Properties;

/**
 * Redis 监控返回对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RedisMonitorVO {

    /** 基本信息 */
    private Properties info;

    /** 数据库大小 */
    private Object dbSize;

    /** 命令统计 */
    private List<CommandStatVO> commandStats;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CommandStatVO {
        /** 命令名称 */
        private String name;
        /** 调用次数 */
        private String value;
    }
}