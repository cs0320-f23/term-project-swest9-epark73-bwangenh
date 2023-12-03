package edu.brown.cs.student.main.records.PLME.response;
import java.util.List;

public record MetadataTable(String type, List<File> fileList) {
  public MetadataTable(List<File> fileList){
    this("table", fileList);
  }
}
