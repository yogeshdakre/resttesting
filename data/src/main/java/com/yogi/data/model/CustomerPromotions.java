package com.yogi.data.model;

public class CustomerPromotions {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_promotions.id
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_promotions.customer_id
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    private Integer customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_promotions.promotion-id
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    private Integer promotionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_promotions.id
     *
     * @return the value of customer_promotions.id
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_promotions.id
     *
     * @param id the value for customer_promotions.id
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_promotions.customer_id
     *
     * @return the value of customer_promotions.customer_id
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_promotions.customer_id
     *
     * @param customerId the value for customer_promotions.customer_id
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_promotions.promotion-id
     *
     * @return the value of customer_promotions.promotion-id
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public Integer getPromotionId() {
        return promotionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_promotions.promotion-id
     *
     * @param promotionId the value for customer_promotions.promotion-id
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }
}