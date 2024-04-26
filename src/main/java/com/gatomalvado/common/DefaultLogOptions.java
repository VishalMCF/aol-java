package com.gatomalvado.common;

import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;

public class DefaultLogOptions {
    public static boolean DEFAULT_SYNC_WHEN_WRITE = false;
    public static long DEFAULT_SEGMENT_SIZE = 20971520L;
    public static FileAttribute<?> DEFAULT_DIR_PERMISSIONS = PosixFilePermissions.asFileAttribute(
            PosixFilePermissions.fromString("rwxr-x---"));
    public static FileAttribute<?> DEFAULT_FILE_PERMISSIONS = PosixFilePermissions.asFileAttribute(
            PosixFilePermissions.fromString("rw-r-----"));
}
