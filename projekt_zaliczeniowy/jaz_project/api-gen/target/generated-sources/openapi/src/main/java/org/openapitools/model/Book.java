package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Book
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-22T20:03:44.887912100+02:00[Europe/Warsaw]")
public class Book   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("author")
  private String author;

  @JsonProperty("genre")
  private String genre;

  @JsonProperty("price")
  private Float price;

  @JsonProperty("pages")
  private Integer pages;

  @JsonProperty("visitCount")
  private Integer visitCount;

  @JsonProperty("available")
  private Boolean available;

  @JsonProperty("stock")
  private Integer stock;

  public Book id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Book title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Book author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Book genre(String genre) {
    this.genre = genre;
    return this;
  }

  /**
   * Get genre
   * @return genre
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public Book price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public Book pages(Integer pages) {
    this.pages = pages;
    return this;
  }

  /**
   * Get pages
   * @return pages
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getPages() {
    return pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  public Book visitCount(Integer visitCount) {
    this.visitCount = visitCount;
    return this;
  }

  /**
   * Get visitCount
   * @return visitCount
  */
  @ApiModelProperty(value = "")


  public Integer getVisitCount() {
    return visitCount;
  }

  public void setVisitCount(Integer visitCount) {
    this.visitCount = visitCount;
  }

  public Book available(Boolean available) {
    this.available = available;
    return this;
  }

  /**
   * Get available
   * @return available
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean getAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public Book stock(Integer stock) {
    this.stock = stock;
    return this;
  }

  /**
   * Get stock
   * @return stock
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(this.id, book.id) &&
        Objects.equals(this.title, book.title) &&
        Objects.equals(this.author, book.author) &&
        Objects.equals(this.genre, book.genre) &&
        Objects.equals(this.price, book.price) &&
        Objects.equals(this.pages, book.pages) &&
        Objects.equals(this.visitCount, book.visitCount) &&
        Objects.equals(this.available, book.available) &&
        Objects.equals(this.stock, book.stock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, author, genre, price, pages, visitCount, available, stock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    visitCount: ").append(toIndentedString(visitCount)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

