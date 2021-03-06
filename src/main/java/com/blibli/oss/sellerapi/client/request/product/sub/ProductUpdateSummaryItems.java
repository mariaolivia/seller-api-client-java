package com.blibli.oss.sellerapi.client.request.product.sub;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductUpdateSummaryItems {
  private String gdnSku;
  private Integer stock;
  private Integer minimumStock;
  private Double price;
  private Double salePrice;
  private Boolean buyable;
  private Boolean displayable;
}
