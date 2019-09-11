
package examples.aaronhoskins.com.mvvmdemo.model.randomuser;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Result implements Parcelable {

    @SerializedName("cell")
    private String mCell;
    @SerializedName("dob")
    private Dob mDob;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("gender")
    private String mGender;
    @SerializedName("id")
    private Id mId;
    @SerializedName("location")
    private Location mLocation;
    @SerializedName("login")
    private Login mLogin;
    @SerializedName("name")
    private Name mName;
    @SerializedName("nat")
    private String mNat;
    @SerializedName("phone")
    private String mPhone;
    @SerializedName("picture")
    private Picture mPicture;
    @SerializedName("registered")
    private Registered mRegistered;

    protected Result(Parcel in) {
        mCell = in.readString();
        mDob = in.readParcelable(Dob.class.getClassLoader());
        mEmail = in.readString();
        mGender = in.readString();
        mId = in.readParcelable(Id.class.getClassLoader());
        mNat = in.readString();
        mPhone = in.readString();
    }

    public static final Creator<Result> CREATOR = new Creator<Result>() {
        @Override
        public Result createFromParcel(Parcel in) {
            return new Result(in);
        }

        @Override
        public Result[] newArray(int size) {
            return new Result[size];
        }
    };

    public String getCell() {
        return mCell;
    }

    public void setCell(String cell) {
        mCell = cell;
    }

    public Dob getDob() {
        return mDob;
    }

    public void setDob(Dob dob) {
        mDob = dob;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public Id getId() {
        return mId;
    }

    public void setId(Id id) {
        mId = id;
    }

    public Location getLocation() {
        return mLocation;
    }

    public void setLocation(Location location) {
        mLocation = location;
    }

    public Login getLogin() {
        return mLogin;
    }

    public void setLogin(Login login) {
        mLogin = login;
    }

    public Name getName() {
        return mName;
    }

    public void setName(Name name) {
        mName = name;
    }

    public String getNat() {
        return mNat;
    }

    public void setNat(String nat) {
        mNat = nat;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public Picture getPicture() {
        return mPicture;
    }

    public void setPicture(Picture picture) {
        mPicture = picture;
    }

    public Registered getRegistered() {
        return mRegistered;
    }

    public void setRegistered(Registered registered) {
        mRegistered = registered;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mCell);
        parcel.writeParcelable(mDob, i);
        parcel.writeString(mEmail);
        parcel.writeString(mGender);
        parcel.writeParcelable(mId, i);
        parcel.writeString(mNat);
        parcel.writeString(mPhone);
    }
}
