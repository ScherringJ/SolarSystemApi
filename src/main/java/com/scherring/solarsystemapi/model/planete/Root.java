package com.scherring.solarsystemapi.model.planete;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class Root {
    public int id;
    public String datasetid;
    public String recordid;
    public Fields fields;
    public Date record_timestamp;

    public Root() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatasetid() {
        return datasetid;
    }

    public void setDatasetid(String datasetid) {
        this.datasetid = datasetid;
    }

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid;
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public Date getRecord_timestamp() {
        return record_timestamp;
    }

    public void setRecord_timestamp(Date record_timestamp) {
        this.record_timestamp = record_timestamp;
    }
}
