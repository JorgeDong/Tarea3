package beans;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class ItemProduct implements Parcelable {
    private int image;
    private String title, store, location, phone, description;
    private int code;

    public ItemProduct(){
        this.image=0;
        this.title="";
        this.store="";
        this.location="";
        this.phone="";
        this.description="";
        this.code=0;

    }

    // constructor parceable
    public ItemProduct(Parcel in){
        image = in.readInt();
        title = in.readString();
        store = in.readString();
        location = in.readString();
        phone = in.readString();
        description = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
        dest.writeString(title);
        dest.writeString(store);
        dest.writeString(location);
        dest.writeString(phone);
        dest.writeString(description);
    }
    public static final Parcelable.Creator<ItemProduct> CREATOR = new
            Parcelable.Creator<ItemProduct>() {
                @Override
                public ItemProduct createFromParcel(Parcel source) {
                    // using parcelable constructor
                    return new ItemProduct (source);
                }
                @Override
                public ItemProduct [] newArray(int size) {
                    return new ItemProduct [size];
                }
            };

    @Override
    public String toString() {
        return "Titulo: '" + this.title + "', Tienda: '" + this.store + "', Ubicación: '" + this.location
                + "', Telefono: '" + this.phone + "', Descripcon: '" + this.description+ "', Image: '" + this.image  + "'";
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getStore() {
        return store;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public String getDescription() {
        return description;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() { return code; }

    public void setCode(int code) {this.code = code; }
}  // fin de clase
