package com.finalproject.automated.refactoring.tool.files.detection.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Ismayadi Jamil
 * @version 1.0.0
 * @since 12 Juni 2019
 */

@Data
@Builder
@ToString(exclude = "content")
@EqualsAndHashCode(exclude = "content")
public class FileModel {

    private String path;

    private String filename;

    private String content;
}
