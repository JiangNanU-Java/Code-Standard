package com.huawei.common.utils;

import org.apache.commons.beanutils.BeanUtils;

import lombok.SneakyThrows;

import java.lang.reflect.InvocationTargetException;

/**
 * 工具类的规范例子
 *
 * @author 肖文杰
 */
public class ObjectUtil {

    @SneakyThrows
    public void copyAttribute(Object source, Object dest) throws InvocationTargetException, IllegalAccessException {
        // org.springframework.beans.BeanUtils.copyProperties(source, dest);
        org.apache.commons.beanutils.BeanUtils.copyProperties(dest, source);
    }
}
