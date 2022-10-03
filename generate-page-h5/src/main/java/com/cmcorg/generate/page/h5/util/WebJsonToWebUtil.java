package com.cmcorg.generate.page.h5.util;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import com.cmcorg.engine.web.model.model.constant.LogTopicConstant;
import com.cmcorg.generate.page.h5.util.model.dto.WebDTO;
import com.cmcorg.generate.page.h5.util.util.JavaToWebJsonUtil;
import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = LogTopicConstant.JAVA_TO_WEB)
public class WebJsonToWebUtil {

    /**
     * 生成前端页面
     */
    public static void exec() {

        log.info("WebJsonToWeb：执行开始 =====================>");
        TimeInterval timer = DateUtil.timer();

        // 把 java的接口，转换为 json格式
        WebDTO webDTO = JavaToWebJsonUtil.doJavaToWebJson();

        if (webDTO != null) {
            doExec(webDTO); // 生成前端页面
        }

        long interval = timer.interval();
        log.info("WebJsonToWeb：执行结束 =====================> 耗时：{}毫秒", interval);
    }

    /**
     * 生成前端页面
     */
    private static void doExec(WebDTO webDTO) {

        // 生成 api文件
        WebJsonToWebGenerateApiUtil.generateApi(webDTO);
        // 生成 admin相关文件
        WebJsonToWebGenerateAdminUtil.generateAdmin(webDTO);

    }

}
