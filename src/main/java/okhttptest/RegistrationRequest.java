package okhttptest;

import com.google.gson.annotations.SerializedName;

public class RegistrationRequest {
    String name;
    @SerializedName(value = "mobile_no")
    String mobileNo;
    String email;
    @SerializedName("pin_code")
    String pinCode;
    @SerializedName(value = "delivery_address")
    String deliveryAddress;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "RegistrationRequest{" +
                "name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", email='" + email + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }
}
