package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Announcement  {
  
  @SerializedName("id")
  private BigDecimal id = null;
  @SerializedName("link")
  private String link = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("content")
  private String content = null;
  @SerializedName("date")
  private Date date = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Announcement announcement = (Announcement) o;
    return (id == null ? announcement.id == null : id.equals(announcement.id)) &&
        (link == null ? announcement.link == null : link.equals(announcement.link)) &&
        (title == null ? announcement.title == null : title.equals(announcement.title)) &&
        (content == null ? announcement.content == null : content.equals(announcement.content)) &&
        (date == null ? announcement.date == null : date.equals(announcement.date));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (link == null ? 0: link.hashCode());
    result = 31 * result + (title == null ? 0: title.hashCode());
    result = 31 * result + (content == null ? 0: content.hashCode());
    result = 31 * result + (date == null ? 0: date.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Announcement {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
