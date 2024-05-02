package com.gatomalvado.model;

import com.gatomalvado.common.DefaultLogOptions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.file.attribute.FileAttribute;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Options {
    private boolean syncWhenWrite = DefaultLogOptions.DEFAULT_SYNC_WHEN_WRITE;
    private long segmentSize = DefaultLogOptions.DEFAULT_SEGMENT_SIZE;
    private FileAttribute<?> dirPermissions = DefaultLogOptions.DEFAULT_DIR_PERMISSIONS;
    private FileAttribute<?> filePermissions = DefaultLogOptions.DEFAULT_FILE_PERMISSIONS;
}
