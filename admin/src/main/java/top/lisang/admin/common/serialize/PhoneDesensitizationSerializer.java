package top.lisang.admin.common.serialize;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import cn.hutool.core.util.DesensitizedUtil;

public class PhoneDesensitizationSerializer extends JsonSerializer<String> {

    @Override
    public void serialize(String phone, JsonGenerator generator, SerializerProvider arg2) throws IOException {
        String mobilePhone = DesensitizedUtil.mobilePhone(phone);
        generator.writeString(mobilePhone);
    }

}
