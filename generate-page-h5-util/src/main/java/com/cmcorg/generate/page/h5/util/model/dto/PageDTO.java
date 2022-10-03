package com.cmcorg.generate.page.h5.util.model.dto;

import com.cmcorg.engine.web.model.generate.model.enums.PageTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class PageDTO {

    @Schema(description = "文件名")
    private String fileName;

    @Schema(description = "页面路径")
    private String path;

    @Schema(description = "页面类型")
    private PageTypeEnum type;

    @Schema(description = "页面标题")
    private String title;

    @Schema(description = "页面图标")
    private String icon;

    @Schema(description = "所有的请求集合")
    private List<RequestDTO> requestList;

}
