package bg.tuvarna.second;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class People implements Parcelable {
    private String name;
    private int age;
    private String address;
    private String city;
    private String dateOfBirth;

    protected People(Parcel in) {
        name = in.readString();
        age = in.readInt();
        address = in.readString();
        city = in.readString();
        dateOfBirth = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
        dest.writeString(address);
        dest.writeString(city);
        dest.writeString(dateOfBirth);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<People> CREATOR = new Creator<People>() {
        @Override
        public People createFromParcel(Parcel in) {
            return new People(in);
        }

        @Override
        public People[] newArray(int size) {
            return new People[size];
        }
    };

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public People() {
    }

    public People(String name, int age, String address, String city, String dateOfBirth) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }




}
