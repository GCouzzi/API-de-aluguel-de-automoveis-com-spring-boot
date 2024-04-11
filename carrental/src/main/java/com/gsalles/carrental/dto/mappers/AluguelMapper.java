package com.gsalles.carrental.dto.mappers;

import com.gsalles.carrental.dto.AluguelDTO;
import com.gsalles.carrental.dto.rdto.AluguelResponseDTO;
import com.gsalles.carrental.entity.UsuarioAutomovel;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AluguelMapper {

    public static UsuarioAutomovel toUsuarioAutomovel(AluguelDTO dto){
        return new ModelMapper().map(dto, UsuarioAutomovel.class);
    }

    public static AluguelResponseDTO toDto(UsuarioAutomovel ua){
        return new ModelMapper().map(ua, AluguelResponseDTO.class);
    }

    public static List<AluguelResponseDTO> toListDto(List<UsuarioAutomovel> list){
        return list.stream().map(AluguelMapper::toDto).collect(Collectors.toList());
    }
}
