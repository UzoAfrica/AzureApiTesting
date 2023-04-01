package com.example.azureapitest;

import java.util.ArrayList;
import java.util.List;


public class TestAnalyticRequest {
    private List<TextDocument> documents = new ArrayList<>();

    public List<TextDocument> getDocuments() {
        return documents;
    }

    public void setDocuments(List<TextDocument> documents) {
        this.documents = documents;
    }
}
