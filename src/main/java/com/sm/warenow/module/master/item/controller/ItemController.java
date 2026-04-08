package com.sm.warenow.module.master.item.controller;

import com.sm.warenow.common.response.ApiResponse;
import com.sm.warenow.module.master.item.dto.ItemRequestDTO;
import com.sm.warenow.module.master.item.dto.ItemResponseDTO;
import com.sm.warenow.module.master.item.service.ItemService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService service;

    @PostMapping
    public ApiResponse<ItemResponseDTO> create(@Valid @RequestBody ItemRequestDTO dto) {
        return ApiResponse.success(service.create(dto));
    }

    @GetMapping
    public ApiResponse<List<ItemResponseDTO>> getAll() {
        return ApiResponse.success(service.getAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<ItemResponseDTO> getById(@PathVariable Long id) {
        return ApiResponse.success(service.getById(id));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<String> delete(@PathVariable Long id) {
        service.delete(id);
        return ApiResponse.success("Deleted successfully");
    }
}