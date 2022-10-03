package com.cmcorg.generate.page.h5.util.model.dto;

import com.cmcorg.engine.web.model.generate.model.enums.PageTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class WebDTO {

    @Schema(description = "所有页面集合")
    private List<PageDTO> pageList;

    @Schema(description = "页面类型，所有页面集合下标")
    private Map<PageTypeEnum, Set<Integer>> pageTypeMap;

}
