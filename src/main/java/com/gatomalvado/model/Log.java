package com.gatomalvado.model;

import java.util.HashMap;
import java.util.Map;

public class Log {
    private String path; // path to the directory of the log file
    private Map<Integer, Segment> segmentsMap; // index to segment mapping for O(1) file searching
    private String tailSegmentPath; // path to the last segment
    private Batch batch; // reusable write batch
    private Options logOptions;
    private boolean closed;
    private boolean corrupt;


    // methods summary which needs to be implemented
    public Log(String path, Options options){
        this.path = path;
        this.logOptions = options;
        this.segmentsMap = new HashMap<>();
    }
}
