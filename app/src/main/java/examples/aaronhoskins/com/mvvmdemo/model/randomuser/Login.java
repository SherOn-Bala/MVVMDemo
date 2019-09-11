
package examples.aaronhoskins.com.mvvmdemo.model.randomuser;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Login implements Parcelable {

    @SerializedName("md5")
    private String mMd5;
    @SerializedName("password")
    private String mPassword;
    @SerializedName("salt")
    private String mSalt;
    @SerializedName("sha1")
    private String mSha1;
    @SerializedName("sha256")
    private String mSha256;
    @SerializedName("username")
    private String mUsername;
    @SerializedName("uuid")
    private String mUuid;

    protected Login(Parcel in) {
        mMd5 = in.readString();
        mPassword = in.readString();
        mSalt = in.readString();
        mSha1 = in.readString();
        mSha256 = in.readString();
        mUsername = in.readString();
        mUuid = in.readString();
    }

    public static final Creator<Login> CREATOR = new Creator<Login>() {
        @Override
        public Login createFromParcel(Parcel in) {
            return new Login(in);
        }

        @Override
        public Login[] newArray(int size) {
            return new Login[size];
        }
    };

    public String getMd5() {
        return mMd5;
    }

    public void setMd5(String md5) {
        mMd5 = md5;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    public String getSalt() {
        return mSalt;
    }

    public void setSalt(String salt) {
        mSalt = salt;
    }

    public String getSha1() {
        return mSha1;
    }

    public void setSha1(String sha1) {
        mSha1 = sha1;
    }

    public String getSha256() {
        return mSha256;
    }

    public void setSha256(String sha256) {
        mSha256 = sha256;
    }

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        mUsername = username;
    }

    public String getUuid() {
        return mUuid;
    }

    public void setUuid(String uuid) {
        mUuid = uuid;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mMd5);
        parcel.writeString(mPassword);
        parcel.writeString(mSalt);
        parcel.writeString(mSha1);
        parcel.writeString(mSha256);
        parcel.writeString(mUsername);
        parcel.writeString(mUuid);
    }
}
