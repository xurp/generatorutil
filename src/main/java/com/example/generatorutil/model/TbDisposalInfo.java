package com.example.generatorutil.model;

import java.math.BigDecimal;
import java.util.Date;

public class TbDisposalInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.app_code
     *
     * @mbggenerated
     */
    private String appCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.redeem_status
     *
     * @mbggenerated
     */
    private String redeemStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.auction_status
     *
     * @mbggenerated
     */
    private String auctionStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.outbound_status
     *
     * @mbggenerated
     */
    private String outboundStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.accept_fee
     *
     * @mbggenerated
     */
    private BigDecimal acceptFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.auction_name
     *
     * @mbggenerated
     */
    private String auctionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.auction_id
     *
     * @mbggenerated
     */
    private Integer auctionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.accept_time
     *
     * @mbggenerated
     */
    private Date acceptTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.settle_fee
     *
     * @mbggenerated
     */
    private BigDecimal settleFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.reduce_fee
     *
     * @mbggenerated
     */
    private BigDecimal reduceFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.redeem_fee
     *
     * @mbggenerated
     */
    private BigDecimal redeemFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.auction_time
     *
     * @mbggenerated
     */
    private Date auctionTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.auction_type
     *
     * @mbggenerated
     */
    private Date auctionType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.disposal_result
     *
     * @mbggenerated
     */
    private String disposalResult;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.redeem_task_code
     *
     * @mbggenerated
     */
    private String redeemTaskCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.auction_task_code
     *
     * @mbggenerated
     */
    private String auctionTaskCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.store_id
     *
     * @mbggenerated
     */
    private Integer storeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.store_name
     *
     * @mbggenerated
     */
    private String storeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.picker_name
     *
     * @mbggenerated
     */
    private String pickerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.picker_idno
     *
     * @mbggenerated
     */
    private String pickerIdno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.picker_mobile
     *
     * @mbggenerated
     */
    private String pickerMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.outbound_time
     *
     * @mbggenerated
     */
    private Date outboundTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_disposal_info.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.app_code
     *
     * @return the value of tb_disposal_info.app_code
     *
     * @mbggenerated
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.app_code
     *
     * @param appCode the value for tb_disposal_info.app_code
     *
     * @mbggenerated
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode == null ? null : appCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.redeem_status
     *
     * @return the value of tb_disposal_info.redeem_status
     *
     * @mbggenerated
     */
    public String getRedeemStatus() {
        return redeemStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.redeem_status
     *
     * @param redeemStatus the value for tb_disposal_info.redeem_status
     *
     * @mbggenerated
     */
    public void setRedeemStatus(String redeemStatus) {
        this.redeemStatus = redeemStatus == null ? null : redeemStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.auction_status
     *
     * @return the value of tb_disposal_info.auction_status
     *
     * @mbggenerated
     */
    public String getAuctionStatus() {
        return auctionStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.auction_status
     *
     * @param auctionStatus the value for tb_disposal_info.auction_status
     *
     * @mbggenerated
     */
    public void setAuctionStatus(String auctionStatus) {
        this.auctionStatus = auctionStatus == null ? null : auctionStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.outbound_status
     *
     * @return the value of tb_disposal_info.outbound_status
     *
     * @mbggenerated
     */
    public String getOutboundStatus() {
        return outboundStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.outbound_status
     *
     * @param outboundStatus the value for tb_disposal_info.outbound_status
     *
     * @mbggenerated
     */
    public void setOutboundStatus(String outboundStatus) {
        this.outboundStatus = outboundStatus == null ? null : outboundStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.accept_fee
     *
     * @return the value of tb_disposal_info.accept_fee
     *
     * @mbggenerated
     */
    public BigDecimal getAcceptFee() {
        return acceptFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.accept_fee
     *
     * @param acceptFee the value for tb_disposal_info.accept_fee
     *
     * @mbggenerated
     */
    public void setAcceptFee(BigDecimal acceptFee) {
        this.acceptFee = acceptFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.auction_name
     *
     * @return the value of tb_disposal_info.auction_name
     *
     * @mbggenerated
     */
    public String getAuctionName() {
        return auctionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.auction_name
     *
     * @param auctionName the value for tb_disposal_info.auction_name
     *
     * @mbggenerated
     */
    public void setAuctionName(String auctionName) {
        this.auctionName = auctionName == null ? null : auctionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.auction_id
     *
     * @return the value of tb_disposal_info.auction_id
     *
     * @mbggenerated
     */
    public Integer getAuctionId() {
        return auctionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.auction_id
     *
     * @param auctionId the value for tb_disposal_info.auction_id
     *
     * @mbggenerated
     */
    public void setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.accept_time
     *
     * @return the value of tb_disposal_info.accept_time
     *
     * @mbggenerated
     */
    public Date getAcceptTime() {
        return acceptTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.accept_time
     *
     * @param acceptTime the value for tb_disposal_info.accept_time
     *
     * @mbggenerated
     */
    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.settle_fee
     *
     * @return the value of tb_disposal_info.settle_fee
     *
     * @mbggenerated
     */
    public BigDecimal getSettleFee() {
        return settleFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.settle_fee
     *
     * @param settleFee the value for tb_disposal_info.settle_fee
     *
     * @mbggenerated
     */
    public void setSettleFee(BigDecimal settleFee) {
        this.settleFee = settleFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.reduce_fee
     *
     * @return the value of tb_disposal_info.reduce_fee
     *
     * @mbggenerated
     */
    public BigDecimal getReduceFee() {
        return reduceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.reduce_fee
     *
     * @param reduceFee the value for tb_disposal_info.reduce_fee
     *
     * @mbggenerated
     */
    public void setReduceFee(BigDecimal reduceFee) {
        this.reduceFee = reduceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.redeem_fee
     *
     * @return the value of tb_disposal_info.redeem_fee
     *
     * @mbggenerated
     */
    public BigDecimal getRedeemFee() {
        return redeemFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.redeem_fee
     *
     * @param redeemFee the value for tb_disposal_info.redeem_fee
     *
     * @mbggenerated
     */
    public void setRedeemFee(BigDecimal redeemFee) {
        this.redeemFee = redeemFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.auction_time
     *
     * @return the value of tb_disposal_info.auction_time
     *
     * @mbggenerated
     */
    public Date getAuctionTime() {
        return auctionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.auction_time
     *
     * @param auctionTime the value for tb_disposal_info.auction_time
     *
     * @mbggenerated
     */
    public void setAuctionTime(Date auctionTime) {
        this.auctionTime = auctionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.auction_type
     *
     * @return the value of tb_disposal_info.auction_type
     *
     * @mbggenerated
     */
    public Date getAuctionType() {
        return auctionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.auction_type
     *
     * @param auctionType the value for tb_disposal_info.auction_type
     *
     * @mbggenerated
     */
    public void setAuctionType(Date auctionType) {
        this.auctionType = auctionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.disposal_result
     *
     * @return the value of tb_disposal_info.disposal_result
     *
     * @mbggenerated
     */
    public String getDisposalResult() {
        return disposalResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.disposal_result
     *
     * @param disposalResult the value for tb_disposal_info.disposal_result
     *
     * @mbggenerated
     */
    public void setDisposalResult(String disposalResult) {
        this.disposalResult = disposalResult == null ? null : disposalResult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.redeem_task_code
     *
     * @return the value of tb_disposal_info.redeem_task_code
     *
     * @mbggenerated
     */
    public String getRedeemTaskCode() {
        return redeemTaskCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.redeem_task_code
     *
     * @param redeemTaskCode the value for tb_disposal_info.redeem_task_code
     *
     * @mbggenerated
     */
    public void setRedeemTaskCode(String redeemTaskCode) {
        this.redeemTaskCode = redeemTaskCode == null ? null : redeemTaskCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.auction_task_code
     *
     * @return the value of tb_disposal_info.auction_task_code
     *
     * @mbggenerated
     */
    public String getAuctionTaskCode() {
        return auctionTaskCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.auction_task_code
     *
     * @param auctionTaskCode the value for tb_disposal_info.auction_task_code
     *
     * @mbggenerated
     */
    public void setAuctionTaskCode(String auctionTaskCode) {
        this.auctionTaskCode = auctionTaskCode == null ? null : auctionTaskCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.store_id
     *
     * @return the value of tb_disposal_info.store_id
     *
     * @mbggenerated
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.store_id
     *
     * @param storeId the value for tb_disposal_info.store_id
     *
     * @mbggenerated
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.store_name
     *
     * @return the value of tb_disposal_info.store_name
     *
     * @mbggenerated
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.store_name
     *
     * @param storeName the value for tb_disposal_info.store_name
     *
     * @mbggenerated
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.picker_name
     *
     * @return the value of tb_disposal_info.picker_name
     *
     * @mbggenerated
     */
    public String getPickerName() {
        return pickerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.picker_name
     *
     * @param pickerName the value for tb_disposal_info.picker_name
     *
     * @mbggenerated
     */
    public void setPickerName(String pickerName) {
        this.pickerName = pickerName == null ? null : pickerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.picker_idno
     *
     * @return the value of tb_disposal_info.picker_idno
     *
     * @mbggenerated
     */
    public String getPickerIdno() {
        return pickerIdno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.picker_idno
     *
     * @param pickerIdno the value for tb_disposal_info.picker_idno
     *
     * @mbggenerated
     */
    public void setPickerIdno(String pickerIdno) {
        this.pickerIdno = pickerIdno == null ? null : pickerIdno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.picker_mobile
     *
     * @return the value of tb_disposal_info.picker_mobile
     *
     * @mbggenerated
     */
    public String getPickerMobile() {
        return pickerMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.picker_mobile
     *
     * @param pickerMobile the value for tb_disposal_info.picker_mobile
     *
     * @mbggenerated
     */
    public void setPickerMobile(String pickerMobile) {
        this.pickerMobile = pickerMobile == null ? null : pickerMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.outbound_time
     *
     * @return the value of tb_disposal_info.outbound_time
     *
     * @mbggenerated
     */
    public Date getOutboundTime() {
        return outboundTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.outbound_time
     *
     * @param outboundTime the value for tb_disposal_info.outbound_time
     *
     * @mbggenerated
     */
    public void setOutboundTime(Date outboundTime) {
        this.outboundTime = outboundTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.create_time
     *
     * @return the value of tb_disposal_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.create_time
     *
     * @param createTime the value for tb_disposal_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_disposal_info.update_time
     *
     * @return the value of tb_disposal_info.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_disposal_info.update_time
     *
     * @param updateTime the value for tb_disposal_info.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}