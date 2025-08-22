package com.ruoyi.system.domain.vo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadFileVO {

    /**
     * 文件访问URL
     */
    private String url;

    /**
     * 文件路径（含目录）
     */
    private String fileName;

    /**
     * 新文件名（不含路径）
     */
    private String newFileName;

    /**
     * 原始文件名
     */
    private String originalFilename;
}