package com.alibaba.dataops.server.web.api.controller.user.history.request;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @author moji
 * @version DdlCreateRequest.java, v 0.1 2022年09月18日 11:13 moji Exp $
 * @date 2022/09/18
 */
@Data
public class HistoryCreateRequest {

    /**
     * 文件别名
     */
    private String name;

    /**
     * 连接id
     */
    @NotNull
    private Long connectionId;

    /**
     * DB名称
     */
    @NotNull
    private String databaseName;

    /**
     * ddl类型
     * @see com.alibaba.dataops.server.tools.base.enums.ConnectionTypeEnum
     */
    @NotNull
    private String type;

    /**
     * ddl内容
     */
    @NotNull
    private String ddl;
}
