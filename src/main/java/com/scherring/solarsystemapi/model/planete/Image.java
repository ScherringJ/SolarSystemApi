package com.scherring.solarsystemapi.model.planete;

import java.util.List;

public class Image{
    public String mimetype;
    public String format;
    public List<String> color_summary;
    public String filename;
    public int width;
    public String id;
    public int height;
    public boolean thumbnail;

    public Image() {
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public List<String> getColor_summary() {
        return color_summary;
    }

    public void setColor_summary(List<String> color_summary) {
        this.color_summary = color_summary;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(boolean thumbnail) {
        this.thumbnail = thumbnail;
    }
}
