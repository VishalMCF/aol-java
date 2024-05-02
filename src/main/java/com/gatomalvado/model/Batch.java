package com.gatomalvado.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Batch {
    private List<Byte> data;
    private List<BatchEntry> batchEntries;
}
