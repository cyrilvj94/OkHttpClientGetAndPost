package okhttptest;

import com.google.gson.annotations.SerializedName;

public class FetchBalanceResponse {
    Integer id;
    String name;
    @SerializedName(value = "mobile_no")
    String mobileNo;
    String pincode;
    String email;
    @SerializedName(value = "gold_balance")
    String goldBalance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGoldBalance() {
        return goldBalance;
    }

    public void setGoldBalance(String goldBalance) {
        this.goldBalance = goldBalance;
    }

    @Override
    public String toString() {
        return "FetchBalanceResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", pincode='" + pincode + '\'' +
                ", email='" + email + '\'' +
                ", goldBalance='" + goldBalance + '\'' +
                '}';
    }
}
