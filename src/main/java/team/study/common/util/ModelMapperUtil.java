package team.study.common.util;

import org.modelmapper.ModelMapper;

public final class ModelMapperUtil {


   public static <T, R> R convertTo(T sourceObject, Class<R> destinationType) {
       ModelMapper modelMapper = new ModelMapper();
       return modelMapper.map(sourceObject, destinationType);
    }

}
