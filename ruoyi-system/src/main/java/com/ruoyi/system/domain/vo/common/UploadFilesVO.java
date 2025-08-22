package com.ruoyi.system.domain.vo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadFilesVO {

    /**
     * 文件访问URL（多个以分隔符拼接）
     */
    private String urls;

    /**
     * 文件路径（多个以分隔符拼接）
     */
    private String fileNames;

    /**
     * 新文件名（多个以分隔符拼接）
     */
    private String newFileNames;

    /**
     * 原始文件名（多个以分隔符拼接）
     */
    private String originalFilenames;
}