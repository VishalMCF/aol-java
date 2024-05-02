package com.gatomalvado.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.file.Path;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Segment {
    private Path segmentPath;
    private long segmentIndex;
    private List<Byte> cachedBuffers;
    private List<BytePositions> cachedBytePositions;

    public synchronized boolean writeSegment(Batch batch) {
        List<Byte> dataInBatch = batch.getData();
        List<BatchEntry> batchEntries = batch.getBatchEntries();
        return false;
    }

    public long getSegmentSize() {
        return cachedBuffers.size();
    }

    public boolean sync() {
        return false;
    }
}
