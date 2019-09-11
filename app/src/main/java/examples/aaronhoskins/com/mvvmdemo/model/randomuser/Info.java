
package examples.aaronhoskins.com.mvvmdemo.model.randomuser;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Info implements Parcelable {

    @SerializedName("page")
    private Long mPage;
    @SerializedName("results")
    private Long mResults;
    @SerializedName("seed")
    private String mSeed;
    @SerializedName("version")
    private String mVersion;

    protected Info(Parcel in) {
        if (in.readByte() == 0) {
            mPage = null;
        } else {
            mPage = in.readLong();
        }
        if (in.readByte() == 0) {
            mResults = null;
        } else {
            mResults = in.readLong();
        }
        mSeed = in.readString();
        mVersion = in.readString();
    }

    public static final Creator<Info> CREATOR = new Creator<Info>() {
        @Override
        public Info createFromParcel(Parcel in) {
            return new Info(in);
        }

        @Override
        public Info[] newArray(int size) {
            return new Info[size];
        }
    };

    public Long getPage() {
        return mPage;
    }

    public void setPage(Long page) {
        mPage = page;
    }

    public Long getResults() {
        return mResults;
    }

    public void setResults(Long results) {
        mResults = results;
    }

    public String getSeed() {
        return mSeed;
    }

    public void setSeed(String seed) {
        mSeed = seed;
    }

    public String getVersion() {
        return mVersion;
    }

    public void setVersion(String version) {
        mVersion = version;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        if (mPage == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(mPage);
        }
        if (mResults == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(mResults);
        }
        parcel.writeString(mSeed);
        parcel.writeString(mVersion);
    }
}
