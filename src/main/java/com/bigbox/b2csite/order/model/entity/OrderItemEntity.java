package com.bigbox.b2csite.order.model.entity;


@Entity
public class OrderItemEntity {
	
	@Id
	private long id;
	
	@Column(nullable=false)
	private String sku;
	
	@Column(nullable=false)
	private int quantity;
	
	@Column(nullable=false)
	private BigDecimal sellingPrice;
	
	@Column(nullable=false)
	private Date addedToOrderDateTime;
	
	@ManyToOne
	private OrderEntity owingOrder;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(BigDecimal sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Date getAddedToOrderDateTime() {
		return addedToOrderDateTime;
	}

	public void setAddedToOrderDateTime(Date addedToOrderDateTime) {
		this.addedToOrderDateTime = addedToOrderDateTime;
	}

	public OrderEntity getOwingOrder() {
		return owingOrder;
	}

	public void setOwingOrder(OrderEntity owingOrder) {
		this.owingOrder = owingOrder;
	}
	
	
	
	
	
	

}
